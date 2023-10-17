package com.tmb.application.ports.out;

import com.tmb.application.core.domain.User;

public interface CreateUserOutputPort {

    public void createUser(User u);
}
