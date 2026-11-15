package com.edoctorat.edoctorat.modele;

import java.util.List;
import java.util.ArrayList;
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

    @ManyToOne
    @JoinColumn(name = "labo_id")
    private Laboratoire laboratoire;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private AuthUser user;

    @OneToMany(mappedBy = "directeur")
    private List<Ced> cedsDiriges = new ArrayList<>();

    @OneToMany(mappedBy = "directeur")
    private List<Laboratoire> laboratoiresDiriges = new ArrayList<>();

    @OneToMany(mappedBy = "professeur")
    private List<Sujet> sujetsProposes = new ArrayList<>();

    @OneToMany(mappedBy = "coDirecteur")
    private List<Sujet> sujetsCoDiriges = new ArrayList<>();

    @OneToMany(mappedBy = "professeur")
    private List<CommissionProfesseur> participationsCommissions = new ArrayList<>();
}