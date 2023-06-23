package com.example.demo.model;


import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "flats")
public class Flat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "number_of_rooms")
    private String numberOfRooms;
    @Column(name = "floor")
    private Integer floor;
    @Column(name = "price")
    private Integer price;
    @Column(name = "ceiling_height")
    private Integer ceilingHeight;
    @Column(name = "apartment_area")
    private Integer apartmentArea;

    @ManyToOne
    @JoinColumn(name = "house_id")
    private House houseId;

}