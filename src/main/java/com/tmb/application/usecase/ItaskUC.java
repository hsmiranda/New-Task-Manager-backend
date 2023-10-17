package com.tmb.application.usecase;

import com.tmb.presentation.dto.TaskDTO;

public interface ItaskUC {

    public boolean isValidTask(TaskDTO dto);

    /**
     *  Valid Task date, the date not is past;
     *
     * @param dto
     * @return true for valid date or false to date in past
     */
    public boolean isPastDate(TaskDTO dto);



}
