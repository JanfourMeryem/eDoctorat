package com.edoctorat.edoctorat.modele;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "professeur_formationdoctorale")
public class FormationDoctorale {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "pathImage", length = 100)
    private String pathImage;

    private String initiale;

    @Column(nullable = false)
    private String titre;

    @Column(name = "axeDeRecherche", columnDefinition = "LONGTEXT")
    private String axeDeRecherche;

    @Column(name = "dateAccreditation")
    private LocalDate dateAccreditation;

    @ManyToOne
    @JoinColumn(name = "ced_id", nullable = false)
    private Ced ced;

    @ManyToOne
    @JoinColumn(name = "etablissement_id", nullable = false)
    private Etablissement etablissement;
}