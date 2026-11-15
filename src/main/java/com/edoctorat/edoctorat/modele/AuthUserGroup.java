package com.edoctorat.edoctorat.modele;

import jakarta.persistence.*;

@Entity
@Table(name = "auth_user_groups")
public class AuthUserGroup {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private AuthUser user;

    @ManyToOne
    @JoinColumn(name = "group_id", nullable = false)
    private AuthGroup group;
}