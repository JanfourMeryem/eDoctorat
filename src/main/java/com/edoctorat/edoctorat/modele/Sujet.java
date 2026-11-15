package com.edoctorat.edoctorat.modele;

import jakarta.persistence.*;

@Entity
@Table(name = "professeur_sujet")
public class Sujet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String titre;

    @Column(columnDefinition = "LONGTEXT")
    private String description;

    @Column(nullable = false)
    private Boolean publier;

    @ManyToOne
    @JoinColumn(name = "coDirecteur_id")
    private Professeur coDirecteur;

    @ManyToOne
    @JoinColumn(name = "formationDoctorale_id", nullable = false)
    private FormationDoctorale formationDoctorale;

    @ManyToOne
    @JoinColumn(name = "professeur_id", nullable = false)
    private Professeur professeur;
}