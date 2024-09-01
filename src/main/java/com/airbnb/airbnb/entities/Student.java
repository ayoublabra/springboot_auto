package com.airbnb.airbnb.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Student {

    @Id
    private String id;
    @Column(name = "firstName")
    private String firstName;
    @Column(name = "lastName")
    private String lastName;
    @Column(unique = true)
    private String code;
    @Column(name = "programId")
    private String programId;
    @Column(name = "photo")
    private String photo;



}
