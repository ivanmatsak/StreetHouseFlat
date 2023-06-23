package com.example.demo.model;


import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "streets")
public class Street {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "length")
    private Integer length;
    @Column(name = "is_narrow")
    private Boolean isNarrow;
    @Column(name = "is_noisy")
    private Boolean isNoisy;
    @Column(name = "distance_from_metro")
    private Integer distanceFromMetro;
}
