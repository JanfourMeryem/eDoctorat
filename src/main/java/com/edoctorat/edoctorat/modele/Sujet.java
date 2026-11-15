package com.edoctorat.edoctorat.modele;

import java.util.List;
import java.util.ArrayList;
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

    @OneToMany(mappedBy = "sujet")
    private List<Postuler> postulations = new ArrayList<>();

    @OneToMany(mappedBy = "sujet")
    private List<Notification> notifications = new ArrayList<>();

    @OneToMany(mappedBy = "sujet")
    private List<Examiner> examens = new ArrayList<>();

    @OneToMany(mappedBy = "sujet")
    private List<Inscription> inscriptions = new ArrayList<>();
}