package com.example.md4session7.models.dto;

import com.example.md4session7.validation.ViettelPhone;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

public class ParentDTO {
    @NotBlank(message = "Tên phụ huynh không được để trống")
    @Pattern(regexp = "^[A-Z].*", message = "Tên viết hoa chữ cái đầu (VD: Tuấn)")
    private String name;

    @Pattern(regexp = "^0[0-9]{9}$", message = "SĐT bắt đầu bằng 0 và có 10 số")
    @ViettelPhone(message = "SĐT phải là số Viettel hợp lệ")
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

    public String getphoneNumber() {
        return phoneNumber;
    }

    public void setphoneNumber(String phone) {
        this.phoneNumber = phone;
    }
}
