package com.example.demo.model;


import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "houses")
public class House {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "number_of_floors")
    private String numberOfFloors;
    @Column(name = "number_of_entrances")
    private Integer numberOfEntrances;
    @Column(name = "material")
    private String material;
    @Column(name = "color")
    private String color;
    @Column(name = "house_condition")
    private Integer houseCondition;

    @ManyToOne
    @JoinColumn(name = "street_id")
    private Street streetId;
}