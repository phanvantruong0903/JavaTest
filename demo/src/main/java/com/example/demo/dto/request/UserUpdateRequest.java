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
public class UserUpdateRequest {

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

}
