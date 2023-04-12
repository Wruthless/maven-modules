package org.wruthless.controllers;


import org.wruthless.converters.UserMapper;
import org.wruthless.domain.UserCommand;
import org.wruthless.entities.User;

public class UserController {

    User saveUser(UserCommand command) {

        // fake impl
        //return new User();
        return UserMapper.INSTANCE.userCommandToUser(command);
    }

}
