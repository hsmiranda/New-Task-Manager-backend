package com.tmb.application.core.usecase.user;

import com.tmb.application.core.domain.User;

public interface ICreateUser {

    public User createUser(User u);

    public String sendMailTovalidateUser(User u);

}
