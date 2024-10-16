package com.airbnb.airbnb.repositories;

import com.airbnb.airbnb.entities.Categorie;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CategorieRepository extends JpaRepository <Categorie,Long> {
    //Student findByCode(String code);
    //List<Student> findByProgramId(String programId);
    //List<Payment> findByPayements(String code);
}
