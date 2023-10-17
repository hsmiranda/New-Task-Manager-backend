package com.tmb.model.services.impl;

import com.tmb.application.usecase.ItaskUC;
import com.tmb.presentation.dto.TaskDTO;
import com.tmb.model.repository.impl.TaskRepsitoryImpl;
import com.tmb.model.services.ITaskServices;
import com.tmb.model.services.utils.TaskParse;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class TaskServicesImpl implements ITaskServices {
    @Inject
    TaskRepsitoryImpl repository;

    @Inject
    ItaskUC uc;

    @Override
    public TaskDTO create(TaskDTO dto) throws RuntimeException {

        if(!this.uc.isValidTask(dto)){
            throw new RuntimeException("DTO Invalido"); //TODO criar a exception para tratar corretamente.
        }
        else {
            this.repository.persist(TaskParse.toEntity(dto));
        }

        return null;
    }

    @Override
    public TaskDTO update(TaskDTO dto) {
        return null;
    }

    @Override
    public TaskDTO delete(TaskDTO dto) {
        return null;
    }

    @Override
    public TaskDTO list(TaskDTO dto) {
        return null;
    }

    @Override
    public TaskDTO search(TaskDTO dto) {
        return null;
    }
}
