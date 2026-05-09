package com.example.md4session7.controllers;

import com.example.md4session7.models.dto.StudentDTO;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/v1/students")
public class StudentController {
    @GetMapping
    public List<StudentDTO> getStudents() {
        List<StudentDTO> list = new ArrayList<>();
        return list;
    }

    @PostMapping
    public ResponseEntity<?> createStudent(
            @Valid @RequestBody StudentDTO studentDTO,
            BindingResult bindingResult)
    {
        if (bindingResult.hasErrors()) {
            List<String> errors = bindingResult.getFieldErrors()
                    .stream()
                    .map(error -> error.getField() + ": " + error.getDefaultMessage())
                    .collect(Collectors.toList());
            return ResponseEntity.badRequest().body(errors);
        }
    return ResponseEntity.ok("Thêm sinh viên thành công");
    }
}
