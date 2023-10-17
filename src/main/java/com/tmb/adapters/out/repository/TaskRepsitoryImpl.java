package com.tmb.adapters.out.repository;

import com.tmb.application.ports.out.ITaskRepository;
import com.tmb.application.core.domain.Task;

import java.util.List;

public class TaskRepsitoryImpl implements ITaskRepository {

    @Override
    public List<Task> fullSearch(Task t) {
        return null;
    }

    @Override
    public List<Task> getAllDue(Task t) {
        return null;
    }

    @Override
    public List<Task> getNotHasDateDue(Task t) {
        return null;
    }
}
