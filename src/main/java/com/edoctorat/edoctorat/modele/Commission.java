package com.edoctorat.edoctorat.modele;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Table(name = "professeur_commission")
public class Commission {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "dateCommission", nullable = false)
    private LocalDate dateCommission;

    @Column(nullable = false)
    private String lieu;

    @Column(nullable = false)
    private LocalTime heure;

    @ManyToOne
    @JoinColumn(name = "labo_id", nullable = false)
    private Laboratoire laboratoire;
}