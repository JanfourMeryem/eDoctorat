package com.edoctorat.edoctorat.modele;

import jakarta.persistence.*;

@Entity
@Table(name = "candidat_annexe")
public class Annexe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "typeAnnexe", nullable = false, length = 100)
    private String typeAnnexe;

    @Column(nullable = false)
    private String titre;

    @Column(name = "pathFile", nullable = false, length = 100)
    private String pathFile;

    @ManyToOne
    @JoinColumn(name = "diplome_id", nullable = false)
    private Diplome diplome;
}