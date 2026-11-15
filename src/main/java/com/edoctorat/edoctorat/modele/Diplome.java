package com.edoctorat.edoctorat.modele;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "candidat_diplome")
public class Diplome {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String intitule;

    @Column(length = 500)
    private String type;

    @Column(name = "dateCommission", nullable = false)
    private LocalDate dateCommission;

    @Column(nullable = false, length = 50)
    private String mention;

    @Column(nullable = false)
    private String pays;

    @Column(nullable = false)
    private String etablissement;

    private String specialite;

    @Column(nullable = false)
    private String ville;

    @Column(nullable = false)
    private String province;

    @Column(name = "moyen_generale", nullable = false)
    private Double moyenGenerale;

    @ManyToOne
    @JoinColumn(name = "candidat_id", nullable = false)
    private Candidat candidat;
}