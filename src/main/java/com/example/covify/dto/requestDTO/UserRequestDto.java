package com.example.covify.dto.requestDTO;

import com.example.covify.enums.Gender;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import javax.validation.constraints.Size;

@Data
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UserRequestDto {

    String name;

    int age;

    String emailId;

    // add char limit in contact number
    @Size(min = 10, max = 13)
    String mobileNo;

    Gender gender;
}
