package com.tmb.application.ports.out;

import com.tmb.application.core.domain.User;
import io.quarkus.hibernate.orm.panache.PanacheRepository;

public interface IUserRepository extends PanacheRepository<User> {
}
