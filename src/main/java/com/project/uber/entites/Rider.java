package com.project.uber.entites;

import jakarta.persistence.*;

@Entity
public class Rider {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //rider table will have column user_id and will be foreign key for user
    @OneToOne
    @JoinColumn(name="user_id")
    private User user;
    private Double rating;


}
