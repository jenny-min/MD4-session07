package com.example.md4session7.validation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import org.springframework.stereotype.Component;

@Component
public class ViettelPhoneValidator implements ConstraintValidator<ViettelPhone, String> {
    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        if (value == null || value.isBlank()) {
            return true;
        }

        return value.matches(
                "^(086|096|097|098|032|033|034|035|036|037|038|039)\\d{7}$"
        );
    }
}
