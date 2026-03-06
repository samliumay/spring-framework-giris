package com.interntrainingumay.back_end.repository;

import com.interntrainingumay.back_end.entity.Task;
import com.interntrainingumay.back_end.entity.TaskStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {

    List<Task> findByStatus(TaskStatus status);

    Optional<Task> findByTitle(String title);
}
