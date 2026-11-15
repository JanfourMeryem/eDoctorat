package com.edoctorat.edoctorat.modele;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "candidat_candidat")
public class Candidat {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 30)
    private String cne;

    @Column(nullable = false, length = 30)
    private String cin;

    @Column(name = "nomCandidatAr")
    private String nomCandidatAr;

    @Column(name = "prenomCandidatAr")
    private String prenomCandidatAr;

    @Column(nullable = false, columnDefinition = "LONGTEXT")
    private String adresse;

    @Column(name = "adresseAr", columnDefinition = "LONGTEXT")
    private String adresseAr;

    @Column(length = 20)
    private String sexe;

    @Column(name = "villeDeNaissance", nullable = false)
    private String villeDeNaissance;

    @Column(name = "villeDeNaissanceAr")
    private String villeDeNaissanceAr;

    @Column(nullable = false)
    private String ville;

    @Column(name = "dateDeNaissance", nullable = false)
    private LocalDate dateDeNaissance;

    @Column(name = "typeDeHandiCape", length = 30)
    private String typeDeHandiCape;

    private String academie;

    @Column(name = "telCandidat", length = 30)
    private String telCandidat;

    @Column(name = "pathCv", length = 100)
    private String pathCv;

    @Column(name = "pathPhoto", length = 100)
    private String pathPhoto;

    @Column(name = "etatDossier")
    private Integer etatDossier;

    @Column(name = "situation_familiale", length = 50)
    private String situationFamiliale;

    @ManyToOne
    @JoinColumn(name = "pays_id", nullable = false)
    private Pays pays;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private AuthUser user;

    @Column(nullable = false)
    private Boolean fonctionaire;
}