package com.airbnb.airbnb.controller;

import com.airbnb.airbnb.entities.Payment;
import com.airbnb.airbnb.entities.Student;
import com.airbnb.airbnb.repository.PaymentRepository;
import com.airbnb.airbnb.repository.StudentRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/payments")
public class PaymentRestController {
    private StudentRepository studentRepository;
    private PaymentRepository paymentRepository;

    public PaymentRestController(StudentRepository studentRepository, PaymentRepository paymentRepository){
        this.paymentRepository=paymentRepository;
        this.studentRepository=studentRepository;
    }
    @GetMapping
    public List<Payment>getAllPayment(){
        return paymentRepository.findAll();
    }

    @GetMapping(path = "/{id}")
    public Payment getPaymentById(@PathVariable Long id){
        return paymentRepository.findById(id).get();
    }

    //@GetMapping(path = "/students")
    //public List<Student> getAllStudents(){
      //  return  studentRepository.findAll();
    //}



    //public  List<Payment> paymentByStrudents(@PathVariable String code){
      //  return  paymentRepository.findByStudentCode(code);
    //}




}
