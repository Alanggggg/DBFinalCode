package com.example.finalproject.service.Impl;

import com.example.finalproject.DAO.DogadoptionMapper;
import com.example.finalproject.pojo.Dogadoption;
import com.example.finalproject.service.IDogAdoption;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DogAdoptionImpl implements IDogAdoption {
    @Autowired
    private DogadoptionMapper dogadoptionMapper;

    @Override
    public List<String> getAllNames() {
        //get all the unique names in the database
        List<String> strings = dogadoptionMapper.selectAllBreeds();
        return strings;
    }

    @Override
    public List<String> selectAllSizes() {
        List<String> strings = dogadoptionMapper.selectAllSizes();
        return strings;
    }

    @Override
    public List<Dogadoption> selectByBreed(String breed) {
        return dogadoptionMapper.selectByBreed(breed);
    }

    @Override
    public List<Dogadoption> selectBySize(String size) {
        return dogadoptionMapper.selectBySize(size);
    }

}
