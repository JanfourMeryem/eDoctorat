package com.edoctorat.edoctorat.modele;

import java.util.List;
import java.util.ArrayList;
import jakarta.persistence.*;

@Entity
@Table(name = "auth_permission")
public class AuthPermission {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private String name;

    @Column(name = "content_type_id", nullable = false)
    private Integer contentTypeId;

    @Column(nullable = false, length = 100)
    private String codename;

    @OneToMany(mappedBy = "permission")
    private List<AuthGroupPermission> groupes = new ArrayList<>();

    @OneToMany(mappedBy = "permission")
    private List<AuthUserPermission> utilisateurs = new ArrayList<>();
}