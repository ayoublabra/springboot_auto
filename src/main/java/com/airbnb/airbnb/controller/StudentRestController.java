package com.airbnb.airbnb.controller;


import com.airbnb.airbnb.entities.Payment;
import com.airbnb.airbnb.entities.Student;
import com.airbnb.airbnb.repository.PaymentRepository;
import com.airbnb.airbnb.repository.StudentRepository;
import org.apache.coyote.BadRequestException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.HttpClientErrorException;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@RestController
@RequestMapping("/students")
public class StudentRestController {
    @Autowired
    private StudentRepository studentRepository;
    private PaymentRepository paymentRepository;

    public StudentRestController(StudentRepository studentRepository, PaymentRepository paymentRepository) {
        this.studentRepository = studentRepository;
        this.paymentRepository = paymentRepository;
    }

    @GetMapping("/student")
    public ResponseEntity<Student> getStudentByCode(@RequestParam(required = false) String id,
                                                    @RequestParam(required = false) String code) {
        if (id != null) {
            return new ResponseEntity<>(studentRepository.findById(id).get(), HttpStatus.OK);
        } else if (code != null) {
            return new ResponseEntity<>(studentRepository.findByCode(code), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping("/program/{programId}")
    public List<Student> getStudentsByProgramId(@PathVariable String programId) {
        return studentRepository.findByProgramId(programId);
    }

    @GetMapping("/{code}/payments")
    public List<Payment> paymentsByStudent(@PathVariable String code) {
        return paymentRepository.findByStudentCode(code);
    }

    @GetMapping
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }
}
