package com.tmb.application.core.usecase.user.impl;

import com.tmb.application.core.domain.TaskList;
import com.tmb.application.core.domain.User;
import com.tmb.application.core.usecase.user.IGetReport;
import com.tmb.application.ports.out.ISendReportToMail;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

import java.util.Date;

@ApplicationScoped
public class GetReportImpl implements IGetReport {

    @Inject
    ISendReportToMail sendReportToMail;

    @Override
    public TaskList sendReportToMail(User u) {
        return null;
    }

    @Override
    public TaskList ISendReportToMail(User u, Date reportDate) {

        return null;
    }
}
