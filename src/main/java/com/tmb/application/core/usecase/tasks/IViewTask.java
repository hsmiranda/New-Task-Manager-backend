package com.tmb.application.core.usecase.tasks;

import com.tmb.application.core.domain.Task;

import java.util.List;

public interface IViewTask {

    public List<Task> viewAllTasks();

    public List<Task> viewTaskByAtribute(Task t);

    public List<Task> viewByFullSearch(String keyword);

}
