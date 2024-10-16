package com.airbnb.airbnb.entities;

import com.airbnb.airbnb.enums.Gender;
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
public class Categorie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "nomCategorie")
    private String nomCategorie;
    @MapKeyEnumerated(EnumType.STRING)
    private Gender gender;
}
