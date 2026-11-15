package com.edoctorat.edoctorat.modele;

import java.util.List;
import java.util.ArrayList;
import jakarta.persistence.*;

@Entity
@Table(name = "professeur_ced")
public class Ced {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(columnDefinition = "LONGTEXT")
    private String description;

    @Column(name = "pathImage", length = 100)
    private String pathImage;

    private String initiale;

    @Column(nullable = false)
    private String titre;

    @ManyToOne
    @JoinColumn(name = "directeur_id")
    private Professeur directeur;

    @OneToMany(mappedBy = "ced")
    private List<Laboratoire> laboratoires = new ArrayList<>();

    @OneToMany(mappedBy = "ced")
    private List<FormationDoctorale> formationsDoctorales = new ArrayList<>();
}