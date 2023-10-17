package com.tmb.bo;

import com.tmb.dto.TaskDTO;

public interface ItaskBO {

    public boolean isValidTask(TaskDTO dto);

    /**
     *  Valid Task date, the date not is past;
     *
     * @param dto
     * @return true for valid date or false to date in past
     */
    public boolean isPastDate(TaskDTO dto);



}
