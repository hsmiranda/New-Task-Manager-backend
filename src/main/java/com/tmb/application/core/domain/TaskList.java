package com.tmb.application.core.domain;

import java.util.List;

public class TaskList {

    private Long id;

    private List<Task> tasks;

    private User user;

    public TaskList() {
    }

    public TaskList(Long id, List<Task> tasks, User user) {
        this.id = id;
        this.tasks = tasks;
        this.user = user;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public void setTasks(List<Task> tasks) {
        this.tasks = tasks;
    }
}
