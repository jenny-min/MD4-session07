package com.example.md4session7.models.dto;

import jakarta.validation.Valid;
import jakarta.validation.constraints.*;

public class StudentDTO {
    //Họ và tên không được để trống, độ dài 5-100 ký tự
    @NotBlank(message = "Họ và tên không được để trống")
    @Size(min = 5, max = 100, message = "Họ và tên phải từ 5 đến 100 ký tự")
    private String fullName;
    //Chuyên ngành không được để trống
    @NotBlank(message = "Chuyên ngành không được để trống")
    private String major;

    //Validation số học (Điểm số & Tuổi)
    @Min(value = 18, message = "Sinh viên phải từ 18 tuổi trở lên")
    private int age;

    @Min(value = 0, message = "Điểm GPA phải nằm trong khoảng từ 0-10")
    @Max(value = 10, message = "Điểm GPA phải nằm trong khoảng từ 0-10")
    private double gpa;

    //Validation định dạng Mã Sinh viên (Regex)
    @Pattern(regexp = "^SV\\d{4}$", message = "Mã sinh viên phải có dạng SVxxxx (Ví dụ: SV0001, SV9999)")
    private String studentCode;

    @NotNull(message = "Thông tin phụ huynh là bắt buộc")
    @Valid
    private ParentDTO parentDTO;

    public StudentDTO() {
    }

    public StudentDTO(String fullName, String major, int age, double gpa, String studentCode, ParentDTO parentDTO) {
        this.fullName = fullName;
        this.major = major;
        this.age = age;
        this.gpa = gpa;
        this.studentCode = studentCode;
        this.parentDTO = parentDTO;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public String getStudentCode() {
        return studentCode;
    }

    public void setStudentCode(String studentCode) {
        this.studentCode = studentCode;
    }

    public ParentDTO getParentDTO() {
        return parentDTO;
    }

    public void setParentDTO(ParentDTO parentDTO) {
        this.parentDTO = parentDTO;
    }
}
