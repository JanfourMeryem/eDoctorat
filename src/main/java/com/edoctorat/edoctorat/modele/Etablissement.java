package com.edoctorat.edoctorat.modele;

import jakarta.persistence.*;

@Entity
@Table(name = "professeur_etablissement")
public class Etablissement {

    @Id
    @Column(name = "idEtablissement", length = 10)
    private String idEtablissement;

    @Column(name = "nomEtablissement", nullable = false)
    private String nomEtablissement;
}