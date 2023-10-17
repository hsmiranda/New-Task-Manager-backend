package com.tmb.model.services.utils;

import com.tmb.presentation.dto.TaskDTO;
import com.tmb.model.model.Task;

public class TaskParse {

    public static TaskDTO toDto(Task t) {
        return new TaskDTO(
                t.getId(),
                t.getName(),
                t.getDescription(),
                t.getDateDue(),
                t.getIsPast());
    }

    public static Task toEntity(TaskDTO dto){

        return new Task(
                dto.id(),
                dto.taskName(),
                dto.description(),
                dto.dateDue(),
                dto.isPast()
        );
    }
}
