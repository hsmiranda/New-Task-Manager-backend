package com.tmb.application.core.usecase.user;

import com.tmb.application.core.domain.User;

public interface IRemoveUser {

    public boolean disableUser(User u);
}
