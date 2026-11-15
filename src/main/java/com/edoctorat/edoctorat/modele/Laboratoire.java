package com.edoctorat.edoctorat.modele;

import jakarta.persistence.*;

@Entity
@Table(name = "professeur_laboratoire")
public class Laboratoire {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nomLaboratoire", nullable = false)
    private String nomLaboratoire;

    @Column(columnDefinition = "LONGTEXT")
    private String description;

    @Column(name = "pathImage", length = 100)
    private String pathImage;

    private String initial;

    @ManyToOne
    @JoinColumn(name = "ced_id", nullable = false)
    private Ced ced;

    @ManyToOne
    @JoinColumn(name = "directeur_id", nullable = false)
    private Professeur directeur;

    @ManyToOne
    @JoinColumn(name = "etablissement_id", nullable = false)
    private Etablissement etablissement;
}