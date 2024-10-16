package com.airbnb.airbnb.entities;

import com.airbnb.airbnb.enums.Gender;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Shop {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "ice")
    private String ice;

    @Column(name = "aboutUs")
    private String aboutUs;

    @Column(name = "phone")
    private String phone;

    @Column(name = "email")
    private String email;

    @ManyToOne
    private User user;

    @ManyToOne
    private Categorie categorie;

    //@OneToOne(cascade = CascadeType.ALL)
    //@JoinColumn(name = "location_id") // Clé étrangère dans la table Shop
    //private Location location; // Ajout de la relation One-to-One
}
