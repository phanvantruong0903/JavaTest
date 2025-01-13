package com.example.demo.controller;

import com.example.demo.dto.request.ApiResponse;
import com.example.demo.dto.request.UserCreationRequest;
import com.example.demo.dto.request.UserUpdateRequest;
import com.example.demo.dto.response.UserResponse;
import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import jakarta.validation.Valid;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class UserController {
    UserService userService;

    @PostMapping
    ApiResponse<User> createUser(@RequestBody @Valid UserCreationRequest request){
        ApiResponse<User> apiResponse = new ApiResponse<>();

        apiResponse.setResult(userService.createUser(request));

        return apiResponse;
    }

    @GetMapping
    List<User> getUser(){
        return userService.getUsers();
    }

    @GetMapping("/{userID}")
    UserResponse getUser(@PathVariable("userID") String userID){
        return userService.getUser(userID);
    }

    @PutMapping("/{userID}")
    UserResponse updateUser(@PathVariable("userID") String userID, @RequestBody @Valid UserUpdateRequest request){
        return userService.updateUser(userID, request);
    }

    @DeleteMapping("/{userID}")
    public String deleteUser(@PathVariable("userID") String userID){
        userService.deleteUser((userID));
        return "User has been deleted";
    }

}
