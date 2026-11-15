package com.edoctorat.edoctorat.modele;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "directeur_pole_calendrier")
public class Calendrier {

    @Id
    private Integer id;

    @Column(nullable = false, length = 500)
    private String action;

    @Column(name = "dateDebut", nullable = false)
    private LocalDate dateDebut;

    @Column(name = "dateFin", nullable = false)
    private LocalDate dateFin;

    @Column(nullable = false, length = 50)
    private String pour;
}