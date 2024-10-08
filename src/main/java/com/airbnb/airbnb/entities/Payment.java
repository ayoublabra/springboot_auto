package com.airbnb.airbnb.entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDate date;
    private double amout;
    //@Enumerated(EnumType.STRING)
    private PaymentType type;
    @MapKeyEnumerated(EnumType.STRING)
    private PaymentStatus status;
    private String file;
    @ManyToOne
    private Student student;
}
