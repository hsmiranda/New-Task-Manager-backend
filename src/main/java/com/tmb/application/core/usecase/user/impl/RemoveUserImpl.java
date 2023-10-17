package com.tmb.application.core.usecase.user.impl;

import com.tmb.application.core.domain.User;
import com.tmb.application.core.usecase.user.IRemoveUser;

public class RemoveUserImpl implements IRemoveUser {
    @Override
    public boolean disableUser(User u) {
        return false;
    }
}
