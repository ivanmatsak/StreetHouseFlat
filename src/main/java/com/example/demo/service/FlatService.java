package com.example.demo.service;

import com.example.demo.model.Flat;
import com.example.demo.repository.FlatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FlatService {

    private final FlatRepository flatRepository;

    @Autowired
    public FlatService(FlatRepository flatRepository) {
        this.flatRepository = flatRepository;
    }

    public Flat findById(Long id){
        return flatRepository.getOne(id);
    }

    public List<Flat> findAll(){
        return flatRepository.findAll();
    }

    public Flat saveHouse(Flat house){
        return flatRepository.save(house);
    }

    public void deleteById(Long id){
        flatRepository.deleteById(id);
    }
}