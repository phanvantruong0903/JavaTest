package com.example.demo.dto.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@NoArgsConstructor
@AllArgsConstructor
@lombok.Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ApiResponse <T> {

    @Builder.Default
    int code = 200;
    String message;
    T result;
}
