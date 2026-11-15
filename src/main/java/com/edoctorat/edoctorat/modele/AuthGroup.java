package com.edoctorat.edoctorat.modele;

import java.util.List;
import java.util.ArrayList;
import jakarta.persistence.*;

@Entity
@Table(name = "auth_group")
public class AuthGroup {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false, length = 150)
    private String name;

    @OneToMany(mappedBy = "group")
    private List<AuthGroupPermission> permissions = new ArrayList<>();

    @OneToMany(mappedBy = "group")
    private List<AuthUserGroup> utilisateurs = new ArrayList<>();
}