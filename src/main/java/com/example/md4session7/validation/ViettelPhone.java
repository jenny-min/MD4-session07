package com.example.md4session7.validation;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = ViettelPhoneValidator.class)//Liên kết annotation với class xử lý logic
@Target({ElementType.FIELD})//Cho phép annotation dùng cho ElementType.FIELD
@Retention(RetentionPolicy.RUNTIME)//để Validation Framework đọc được lúc runtime
public @interface ViettelPhone {
    String message() default "Số điện thoại không thuộc nhà mạng Viettel";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
