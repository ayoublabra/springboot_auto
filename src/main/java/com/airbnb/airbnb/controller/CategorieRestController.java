package com.airbnb.airbnb.controller;

import com.airbnb.airbnb.entities.*;
import com.airbnb.airbnb.enums.Gender;
import com.airbnb.airbnb.repositories.CategorieRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/categories")
public class CategorieRestController {
    private CategorieRepository categorieRepository;

    public CategorieRestController(CategorieRepository categorieRepository){
        this.categorieRepository=categorieRepository;
    }
    @PostMapping(path = "/create")
    public Categorie saveCategorie(String nomCategorie, Gender gender) throws IOException {
        Categorie categorie= Categorie.builder().nomCategorie(nomCategorie)
                .gender(gender)
                .build();

        return categorieRepository.save(categorie);
    }
    @GetMapping
    public ResponseEntity<List<Categorie>> getAllStudents() {
        List<Categorie> categories = categorieRepository.findAll();
        if (categories.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT); // Return 204 if no content
        }
        return new ResponseEntity<>(categories, HttpStatus.OK);
    }
}
