package com.example.demo.exception;

import lombok.Data;

public enum ErrorCode {
    UNDEFINED_EXCEPTION( 400, "Undefined Error"),
    INVALID_KEY(404, "Invalid Key"),
    USER_EXISTED( 400, "User Existed"),
    USER_NOTEXISTED(404,"User Not Existed"),

    USERNAME_INVALID(400, "Username must between 6 to 32 characters"),
    USERNAME_BLANK(400,"User Name may not contain blank"),
    USERNAME_EMPTY(400, "User Name can't be empty"),

    PASSWORD_INVALID(400, "Password must be at least 8 characters"),
    PASSWORD_BLANk(400,"Password may not contain blank"),
    PASSWORD_EMPTY(400, "Password can't be empty"),

    FIRSTNAME_NULL(400, "Fist Name is required"),
    FIRSTNAME_EMPTY(400, "First Name can't be empty"),

    LASTNAME_NULL(400, "Last Name is required"),
    LASTNAME_EMPTY(400, "Last Name can't be empty"),
    ;
    private int code;
    private String message;

    ErrorCode(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
