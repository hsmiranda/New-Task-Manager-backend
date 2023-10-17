package com.tmb.application.ports.out;

import com.tmb.application.core.domain.TaskList;
import io.quarkus.hibernate.orm.panache.PanacheRepository;

public interface ITasklistRepository extends PanacheRepository<TaskList> {
}
