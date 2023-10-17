package com.tmb.application.core.usecase.user.impl;

import com.tmb.application.core.domain.User;
import com.tmb.application.core.usecase.user.ICreateUser;
import com.tmb.application.ports.out.ISendMailToValidateUser;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

public class CreateUserImpl implements ICreateUser {

    ISendMailToValidateUser sendMailToValidateUser;

    @Override
    public User createUser(User u) {
        return null;
    }

    @Override
    public String sendMailTovalidateUser(User u) {
        return null;
    }


}
