package com.tmb.model.services;

import com.tmb.presentation.dto.TaskDTO;

public interface ITaskServices {

    public TaskDTO create (TaskDTO dto);
    public TaskDTO update (TaskDTO dto);
    public TaskDTO delete (TaskDTO dto);
    public TaskDTO list (TaskDTO dto);
    public TaskDTO search (TaskDTO dto);
}
