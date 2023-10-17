package com.tmb.adapters.out.repository.mapper;

import com.tmb.adapters.out.repository.entity.UserEntity;
import com.tmb.application.core.domain.User;
import jakarta.enterprise.context.ApplicationScoped;

public interface UserEntityMapper {

    UserEntity toEntity(User u);
}
