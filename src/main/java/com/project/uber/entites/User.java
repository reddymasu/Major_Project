package com.project.uber.entites;

import com.project.uber.entites.enums.Role;
import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name="app_user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @Column(unique = true)
    private String email;
    private String password;

    //one userr can contain multiple roles in orfder to represent this will cfetae new table 
    @ElementCollection(fetch = FetchType.LAZY)
    @Enumerated(EnumType.STRING)
    private Set<Role> roles;





}
