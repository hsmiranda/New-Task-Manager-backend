package com.tmb.adapters.in.controller;

import com.tmb.adapters.in.controller.mapper.UserMapper;
import com.tmb.adapters.in.controller.request.UserRequest;
import com.tmb.application.core.domain.User;
import com.tmb.application.ports.in.CreateUserInputPort;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.validation.Valid;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.Response;

@Path("/api/v1/user")
public class UserController {

    @Inject
    CreateUserInputPort createUserInputPort;

    @Inject
    UserMapper userMapper;

    @POST
    public Response create(@Valid UserRequest u) {

        User u2 = this.userMapper.toUser(u);

        this.createUserInputPort.createUser(u2);

        return Response.ok().entity("User created").build();
    }
}
