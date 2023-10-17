package com.tmb.application.core.usecase.tasks.impl;

import com.tmb.application.core.domain.Task;
import com.tmb.application.core.usecase.tasks.IViewTask;

import java.util.List;

public class ViewTaskImpl implements IViewTask {
    @Override
    public List<Task> viewAllTasks() {
        return null;
    }

    @Override
    public List<Task> viewTaskByAtribute(Task t) {
        return null;
    }

    @Override
    public List<Task> viewByFullSearch(String keyword) {
        return null;
    }
}
