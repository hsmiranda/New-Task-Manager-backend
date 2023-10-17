package com.tmb.adapters.out;

import com.tmb.adapters.out.repository.UserRepository;
import com.tmb.adapters.out.repository.entity.UserEntity;
import com.tmb.adapters.out.repository.mapper.UserEntityMapper;
import com.tmb.application.core.domain.User;
import com.tmb.application.ports.out.CreateUserOutputPort;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class CreateUserAdapter implements CreateUserOutputPort {

    @Inject
    UserRepository repository;

    @Inject
    UserEntityMapper userEntityMapper;

    @Override
    public void createUser(User u) {
        UserEntity userEntity = this.userEntityMapper.toEntity(u);
        this.repository.persist(userEntity);

    }
}
