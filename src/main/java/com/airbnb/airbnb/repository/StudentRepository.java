package com.airbnb.airbnb.repository;

import com.airbnb.airbnb.entities.Payment;
import com.airbnb.airbnb.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentRepository extends JpaRepository <Student ,String> {
    Student findByCode(String code);
    List<Student> findByProgramId(String programId);
    //List<Payment> findByPayements(String code);
}
