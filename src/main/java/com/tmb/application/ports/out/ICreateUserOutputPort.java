package com.tmb.application.ports.out;

import com.tmb.application.core.domain.User;

public interface ICreateUserOutputPort {

    public void createUser(User u);
}
