package com.airbnb.airbnb.controller;

import com.airbnb.airbnb.entities.Payment;
import com.airbnb.airbnb.entities.PaymentStatus;
import com.airbnb.airbnb.entities.PaymentType;
import com.airbnb.airbnb.repository.PaymentRepository;
import com.airbnb.airbnb.repository.StudentRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @GetMapping(path = "/byStatus")
    public List<Payment> getPaymentByStatus(@RequestParam PaymentStatus status) {
        return paymentRepository.findByStatus(status);
    }

    @GetMapping(path = "/byType")
    public List<Payment> getPaymentByType(@RequestParam PaymentType type) {
        return paymentRepository.findByType(type);
    }

    //@GetMapping(path = "/students")
    //public List<Student> getAllStudents(){
      //  return  studentRepository.findAll();
    //}



    //public  List<Payment> paymentByStrudents(@PathVariable String code){
      //  return  paymentRepository.findByStudentCode(code);
    //}




}
