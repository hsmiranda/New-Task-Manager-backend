package com.tmb.presentation.dto;

import java.util.Date;

public record TaskDTO(
        long id,
        String taskName,
        String description,
        Date dateDue,
        boolean isPast
) {
}
