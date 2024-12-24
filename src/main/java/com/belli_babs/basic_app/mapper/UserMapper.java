package com.belli_babs.basic_app.mapper;


import com.belli_babs.basic_app.dto.UserDto;
import com.belli_babs.basic_app.entity.User;
import org.mapstruct.Mapper;

@Mapper
public interface UserMapper {

    UserDto userToUserDto(User user);
    User userDtoToUser(UserDto userDto);
}
