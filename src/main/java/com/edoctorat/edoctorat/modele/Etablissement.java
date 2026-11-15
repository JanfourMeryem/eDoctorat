package com.edoctorat.edoctorat.modele;

import java.util.List;
import java.util.ArrayList;
import jakarta.persistence.*;

@Entity
@Table(name = "professeur_etablissement")
public class Etablissement {

    @Id
    @Column(name = "idEtablissement", length = 10)
    private String idEtablissement;

    @Column(name = "nomEtablissement", nullable = false)
    private String nomEtablissement;

    @OneToMany(mappedBy = "etablissement")
    private List<Professeur> professeurs = new ArrayList<>();

    @OneToMany(mappedBy = "etablissement")
    private List<Laboratoire> laboratoires = new ArrayList<>();

    @OneToMany(mappedBy = "etablissement")
    private List<FormationDoctorale> formationsDoctorales = new ArrayList<>();
}