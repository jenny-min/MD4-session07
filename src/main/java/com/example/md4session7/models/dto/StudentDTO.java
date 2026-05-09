package com.example.md4session7.models.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class StudentDTO {
    //Họ và tên không được để trống, độ dài 5-100 ký tự
    @NotBlank(message = "Họ và tên không được để trống")
    @Size(min = 5, max = 100, message = "Họ và tên phải từ 5 đến 100 ký tự")
    private String fullName;
    //Chuyên ngành không được để trống
    @NotBlank(message = "Chuyên ngành không được để trống")
    private String major;
}
