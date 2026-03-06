package com.interntrainingumay.back_end.strategy;

import com.interntrainingumay.back_end.entity.Task;

import java.util.List;

public interface TaskSortStrategy {
    List<Task> sort(List<Task> tasks);
}
