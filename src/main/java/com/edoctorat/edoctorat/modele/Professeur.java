package com.edoctorat.edoctorat.modele;

import jakarta.persistence.*;

@Entity
@Table(name = "professeur_professeur")
public class Professeur {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 30)
    private String cin;

    @Column(name = "telProfesseur", length = 30)
    private String telProfesseur;

    @Column(name = "pathPhoto", length = 200)
    private String pathPhoto;

    @Column(length = 10)
    private String grade;

    @Column(name = "numSOM", length = 50)
    private String numSOM;

    @Column(name = "nombreEncadrer", nullable = false)
    private Integer nombreEncadrer;

    @Column(name = "nombreProposer", nullable = false)
    private Integer nombreProposer;

    @ManyToOne
    @JoinColumn(name = "etablissement_id", nullable = false)
    private Etablissement etablissement;

    @Column(name = "labo_id")
    private Long laboId;

    @Column(name = "user_id", nullable = false)
    private Integer userId;
}