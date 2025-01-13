package com.example.demo.dto.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UserCreationRequest {

    @Size(min = 6, max = 32, message = "USERNAME_INVALID")
    @NotBlank(message = "USERNAME_BLANK")
    @NotEmpty(message = "USERNAME_EMPTY")
    String username;

    @Size(min = 8, message = "PASSWORD_INVALID")
    @NotBlank(message = "PASSWORD_BLANK")
    @NotEmpty(message = "PASSWORD_EMPTY")
    String password;

    @NotNull(message = "FIRSTNAME_NULL")
    @NotEmpty(message = "FIRSTNAME_EMPTY")
    String firstname;

    @NotNull(message = "LASTNAME_NULL")
    @NotEmpty(message = "LASTNAME_EMPTY")
    String lastname;
    LocalDate dob;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }
}
