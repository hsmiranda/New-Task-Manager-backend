package com.tmb.adapters.in.controller.mapper;

import com.tmb.adapters.in.controller.request.UserRequest;
import com.tmb.application.core.domain.User;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class UserMapperImpl implements UserMapper{

    @Override
    public User toUser(UserRequest u) {
        return new User(
                null,
                u.getUsername(),
                u.getPassword(),
                u.getEmail(),
                u.getIsEnabled()
        );
    }
}
