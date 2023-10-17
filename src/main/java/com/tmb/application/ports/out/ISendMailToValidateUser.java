package com.tmb.application.ports.out;

import com.tmb.application.core.domain.User;

public interface ISendMailToValidateUser {

    public void sendMailToValidateUser(User u);
}
