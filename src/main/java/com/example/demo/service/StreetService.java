package com.example.demo.service;

import com.example.demo.model.Street;
import com.example.demo.repository.StreetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StreetService {

    private final StreetRepository streetRepository;

    @Autowired
    public StreetService(StreetRepository streetRepository) {
        this.streetRepository = streetRepository;
    }

    public Street findById(Long id){
        return streetRepository.getOne(id);
    }

    public List<Street> findAll(){
        return streetRepository.findAll();
    }

    public Street saveStreet(Street street){
        return streetRepository.save(street);
    }

    public void deleteById(Long id){
        streetRepository.deleteById(id);
    }
}