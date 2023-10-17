package com.tmb.application.ports.out;

import com.tmb.application.core.domain.TaskList;

import java.util.List;

public interface ISendReportToMail {
    public void sendReport(TaskList tl);
}
