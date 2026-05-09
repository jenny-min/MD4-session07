package com.example.md4session7.models.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

public class ParentDTO {
    @NotBlank(message = "Tên phụ huynh không được để trống")
    @Pattern(regexp = "^[A-Z].*", message = "Tên viết hoa chữ cái đầu (VD: Tuấn)")
    private String name;

    @Pattern(regexp = "^0[0-9]{9}$", message = "SĐT phải bắt đầu bằng số 0 và có 10 số")
    private String phoneNumber;

    public ParentDTO() {
    }

    public ParentDTO(String name, String phone, String studentCode) {
        this.name = name;
        this.phoneNumber = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phoneNumber;
    }

    public void setPhone(String phone) {
        this.phoneNumber = phone;
    }
}
