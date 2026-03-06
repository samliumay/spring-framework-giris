package com.interntrainingumay.back_end.strategy;

import com.interntrainingumay.back_end.entity.Task;
import org.springframework.stereotype.Component;

import java.util.Comparator;
import java.util.List;

@Component("byStatus")
public class SortByStatus implements TaskSortStrategy {

    @Override
    public List<Task> sort(List<Task> tasks) {
        return tasks.stream()
                .sorted(Comparator.comparing(task -> task.getStatus().ordinal()))
                .toList();
    }
}
