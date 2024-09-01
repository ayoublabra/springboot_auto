package com.airbnb.airbnb.controller;


import com.airbnb.airbnb.entities.Payment;
import com.airbnb.airbnb.entities.Student;
import com.airbnb.airbnb.repository.PaymentRepository;
import com.airbnb.airbnb.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/students")
public class StudentRestController {
    @Autowired
    private StudentRepository studentRepository;
    private PaymentRepository paymentRepository;

    public StudentRestController(StudentRepository studentRepository,PaymentRepository paymentRepository) {
        this.studentRepository = studentRepository;
        this.paymentRepository = paymentRepository;
    }

    @GetMapping("/code/{code}")
    public Student getStudentByCode(@PathVariable String code) {
        return studentRepository.findByCode(code);
    }
    @GetMapping("/id/{id}")
    public Optional<Student> getStudentById(@PathVariable String id) {
        return studentRepository.findById(id);
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
