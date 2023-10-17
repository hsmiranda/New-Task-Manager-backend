package com.tmb.application.core.usecase;

import com.tmb.application.core.domain.User;
import com.tmb.application.ports.out.CreateUserOutputPort;
import com.tmb.application.ports.out.ValidateMailOutputPort;

public class UCCreateUser implements CreateUserOutputPort{

    private final ValidateMailOutputPort validateMailOutputPort;
    private final CreateUserOutputPort createUserOutputPort;

    public UCCreateUser(ValidateMailOutputPort v, CreateUserOutputPort c) {
        this.validateMailOutputPort = v;
        this.createUserOutputPort = c;
    }

    @Override
    public void createUser(User u){
        String mail = u.getEmail();
        this.validateMailOutputPort.sendMailValidation(mail);
        this.createUserOutputPort.createUser(u);
    }
}
