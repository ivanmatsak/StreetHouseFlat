package com.example.demo.service;

import com.example.demo.model.House;
import com.example.demo.repository.HouseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HouseService {

    private final HouseRepository houseRepository;

    @Autowired
    public HouseService(HouseRepository houseRepository) {
        this.houseRepository = houseRepository;
    }

    public House findById(Long id){
        return houseRepository.getOne(id);
    }

    public List<House> findAll(){
        return houseRepository.findAll();
    }

    public House saveHouse(House house){
        return houseRepository.save(house);
    }

    public void deleteById(Long id){
        houseRepository.deleteById(id);
    }
}