package com.tmb.application.core.usecase.user;

import com.tmb.application.core.domain.TaskList;
import com.tmb.application.core.domain.User;
import com.tmb.application.ports.out.ISendReportToMail;

import java.util.Date;

public interface IGetReport {

    public TaskList sendReportToMail(User u);

    public TaskList ISendReportToMail(User u, Date reportDate);
}
