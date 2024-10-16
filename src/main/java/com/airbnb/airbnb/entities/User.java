package com.airbnb.airbnb.entities;

import com.airbnb.airbnb.enums.Gender;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Table(name = "users")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "firstName", length = 150)
    private String firstName;

    @Column(name = "lastName", length = 150)
    private String lastName;

    @Column(name = "email", unique = true)
    private String email;

    @Column(name = "username", unique = true)
    private String username;

    @Column(name = "cin", unique = true)
    private String cin;

    @Column(name = "tel", length = 20)
    private String tel;

    @Temporal(TemporalType.DATE)
    private Date birthday;

    @MapKeyEnumerated(EnumType.STRING)
    private Gender gender;
}
