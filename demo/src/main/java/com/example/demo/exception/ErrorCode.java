package com.example.demo.exception;

import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.HttpStatus;

@Getter
public enum ErrorCode {
    UNDEFINED_EXCEPTION( 400, "Undefined Error", HttpStatus.INTERNAL_SERVER_ERROR),
    INVALID_KEY(404, "Invalid Key",HttpStatus.BAD_REQUEST),
    USER_EXISTED( 400, "User Existed", HttpStatus.BAD_REQUEST),
    USER_NOT_EXISTED(404,"User Not Existed",HttpStatus.NOT_FOUND),
    UNAUTHENTICATED(401,"Unauthenticated", HttpStatus.UNAUTHORIZED),
    UNAUTHORIZED(403, "Unauthorized", HttpStatus.FORBIDDEN),

    USERNAME_INVALID(400, "Username must between 6 to 32 characters", HttpStatus.BAD_REQUEST),
    USERNAME_BLANK(400,"User Name may not contain blank", HttpStatus.BAD_REQUEST),
    USERNAME_EMPTY(400, "User Name can't be empty", HttpStatus.BAD_REQUEST),

    PASSWORD_INVALID(400, "Password must be at least 8 characters", HttpStatus.BAD_REQUEST),
    PASSWORD_BLANk(400,"Password may not contain blank", HttpStatus.BAD_REQUEST),
    PASSWORD_EMPTY(400, "Password can't be empty", HttpStatus.BAD_REQUEST),

    FIRSTNAME_NULL(400, "Fist Name is required", HttpStatus.BAD_REQUEST),
    FIRSTNAME_EMPTY(400, "First Name can't be empty", HttpStatus.BAD_REQUEST),

    LASTNAME_NULL(400, "Last Name is required", HttpStatus.BAD_REQUEST),
    LASTNAME_EMPTY(400, "Last Name can't be empty", HttpStatus.BAD_REQUEST),
    ;
    private int code;
    private String message;
    private HttpStatusCode statusCode;

    ErrorCode(int code, String message, HttpStatusCode statusCode) {
        this.code = code;
        this.message = message;
        this.statusCode = statusCode;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setStatusCode(HttpStatusCode statusCode) {
        this.statusCode = statusCode;
    }
}
