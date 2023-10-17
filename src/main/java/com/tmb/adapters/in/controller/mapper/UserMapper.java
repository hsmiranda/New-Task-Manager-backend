package com.tmb.adapters.in.controller.mapper;

import com.tmb.adapters.in.controller.request.UserRequest;
import com.tmb.application.core.domain.User;

public interface UserMapper {

    public User toUser(UserRequest u);
}
