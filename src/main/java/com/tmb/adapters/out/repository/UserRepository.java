package com.tmb.adapters.out.repository;

import com.tmb.adapters.out.repository.entity.UserEntity;
import io.quarkus.hibernate.orm.panache.PanacheRepository;

public interface UserRepository extends PanacheRepository<UserEntity> {
}
