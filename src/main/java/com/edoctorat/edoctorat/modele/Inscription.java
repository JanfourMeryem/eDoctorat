package com.edoctorat.edoctorat.modele;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "professeur_inscription")
public class Inscription {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "dateDiposeDossier")
    private LocalDate dateDiposeDossier;

    private String remarque;

    @Column(nullable = false)
    private Boolean valider;

    @ManyToOne
    @JoinColumn(name = "candidat_id", nullable = false)
    private Candidat candidat;

    @ManyToOne
    @JoinColumn(name = "sujet_id", nullable = false)
    private Sujet sujet;
}