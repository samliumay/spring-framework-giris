package com.interntrainingumay.back_end.service;

import com.interntrainingumay.back_end.entity.Task;
import com.interntrainingumay.back_end.entity.TaskStatus;
import com.interntrainingumay.back_end.repository.TaskRepository;
import com.interntrainingumay.back_end.strategy.TaskSortStrategy;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class TaskService {

    private final TaskRepository taskRepository;
    private final Map<String, TaskSortStrategy> sortStrategies;

    public Task createTask(String title) {
        Task task = new Task();
        task.setTitle(title);
        task.setStatus(TaskStatus.PENDING);
        task.setCreatedAt(LocalDateTime.now());
        return taskRepository.save(task);
    }

    public Task getTaskById(Long id) {
        return taskRepository.findById(id).orElseThrow(() -> new RuntimeException("Task bulunamadı: " + id));
    }

    public Task completeTask(Long id) {
        Task task = getTaskById(id);
        task.setStatus(TaskStatus.DONE);
        return taskRepository.save(task);
    }

    public List<Task> getAllTasks() {
        return taskRepository.findAll();
    }

    public List<Task> getTasks(String sortType) {
        List<Task> tasks = taskRepository.findAll();

        TaskSortStrategy strategy = sortStrategies.getOrDefault(sortType, sortStrategies.get("byDate"));

        return strategy.sort(tasks);
    }

    public void deleteTask(Long id) {
        Task task = getTaskById(id);
        taskRepository.delete(task);
    }
}
