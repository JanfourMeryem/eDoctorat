package com.edoctorat.edoctorat.modele;

import java.util.List;
import java.util.ArrayList;
import jakarta.persistence.*;

@Entity
@Table(name = "candidat_pays")
public class Pays {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nom", length = 255, nullable = false)
    private String nom;

    @OneToMany(mappedBy = "pays")
    private List<Candidat> candidats = new ArrayList<>();
}