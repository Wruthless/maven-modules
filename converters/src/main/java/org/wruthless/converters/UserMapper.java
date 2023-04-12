package org.wruthless.converters;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import org.wruthless.domain.UserCommand;
import org.wruthless.entities.User;

@Mapper
public interface UserMapper {
    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    UserCommand userToUserCommand(User user);

    User userCommandToUser(UserCommand userCommand);
}
