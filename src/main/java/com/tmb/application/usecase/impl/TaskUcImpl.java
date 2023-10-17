package com.tmb.application.usecase.impl;

import com.tmb.application.usecase.ItaskUC;
import com.tmb.presentation.dto.TaskDTO;
import jakarta.enterprise.context.ApplicationScoped;


@ApplicationScoped
public class TaskUcImpl implements ItaskUC {
    @Override
    public boolean isValidTask(TaskDTO dto) {
        return false;
    }

    @Override
    public boolean isPastDate(TaskDTO dto) {
        return false;
    }
}
