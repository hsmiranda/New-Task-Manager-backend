package com.tmb.adapters.out.repository;

import com.tmb.application.core.domain.Task;
import io.quarkus.hibernate.orm.panache.PanacheRepository;

import java.util.List;

public class TaskRepsitoryImpl implements PanacheRepository<Task> {

    public List<Task> fullSearch(Task t) {
        return null;
    }

    public List<Task> getAllDue(Task t) {
        return null;
    }

    public List<Task> getNotHasDateDue(Task t) {
        return null;
    }
}