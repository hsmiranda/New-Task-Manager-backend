package com.tmb.application.core.usecase.tasks;

import com.tmb.application.core.domain.Task;

import java.util.List;

public interface IGetTaskReport {

    public List<Task> getDailyReports();


}
