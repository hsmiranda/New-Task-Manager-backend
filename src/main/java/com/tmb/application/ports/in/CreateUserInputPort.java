package com.tmb.application.ports.in;

import com.tmb.application.core.domain.User;

public interface CreateUserInputPort {

    public void createUser(User u);
}
