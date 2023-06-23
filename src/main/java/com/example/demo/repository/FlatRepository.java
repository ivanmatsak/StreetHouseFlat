package com.example.demo.repository;

import com.example.demo.model.Flat;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FlatRepository extends JpaRepository<Flat, Long> {
}