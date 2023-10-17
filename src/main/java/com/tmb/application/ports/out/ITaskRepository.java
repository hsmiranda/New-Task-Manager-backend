package com.tmb.application.ports.out;

import com.tmb.application.core.domain.Task;
import io.quarkus.hibernate.orm.panache.PanacheRepository;

import java.util.List;

public interface ITaskRepository extends PanacheRepository<Task> {

    public List<Task> fullSearch(Task t);

    public List<Task> getAllDue(Task t);

    public List<Task> getNotHasDateDue(Task t);
}
