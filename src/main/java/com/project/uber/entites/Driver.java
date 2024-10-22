package com.project.uber.entites;

import jakarta.persistence.*;
import org.geolatte.geom.Point;

@Entity
public class Driver {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name="user_id")
    private User user;
    private Double rating;
    private boolean available;

    @Column(columnDefinition = "Geometry(Point,4326)")
    Point currentlocation;

}
