package com.example.demo.mapper;

import com.example.demo.dto.request.UserCreationRequest;
import com.example.demo.dto.request.UserUpdateRequest;
import com.example.demo.dto.response.UserResponse;
import com.example.demo.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface UserMapper {

//    @Mapping(source = "firstname", target = "firstname")
//    @Mapping(source = "lastname", target = "lastname")
//    @Mapping(source = "username", target = "username")
//    @Mapping(source = "password", target = "password")
//    @Mapping(source = "dob", target = "dob")
    User toUser(UserCreationRequest request);

//    @Mapping(source = "firstname", target = "firstname")
//    @Mapping(source = "lastname", target = "lastname")
//    @Mapping(source = "username", target = "username")
//    @Mapping(source = "password", target = "password")
//    @Mapping(source = "dob", target = "dob")
    void updateUser(@MappingTarget User user, UserUpdateRequest request);
//
//    @Mapping(source = "firstname", target = "firstname")
//    @Mapping(source = "lastname", target = "lastname")
//    @Mapping(source = "username", target = "username")
//    @Mapping(source = "password", target = "password")
//    @Mapping(source = "dob", target = "dob")
    UserResponse toUserResponse(User user);
}
