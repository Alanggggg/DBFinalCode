package com.example.finalproject.service.Impl;

import com.example.finalproject.DAO.DogadoptionMapper;
import com.example.finalproject.DAO.JoinedTablesMapper;
import com.example.finalproject.pojo.Dogadoption;
import com.example.finalproject.pojo.JoinedTables;
import com.example.finalproject.service.IDogAdoption;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class DogAdoptionImpl implements IDogAdoption {
    @Autowired
    private JoinedTablesMapper joinedTablesMapper;

    @Override
    public List<String> getAllNames() {
        //get all the unique names in the database
        List<String> strings = joinedTablesMapper.selectAllBreeds();
        return strings;
    }

    @Override
    public List<String> selectAllSizes() {
        List<String> strings = joinedTablesMapper.selectAllSizes();
        return strings;
    }

    @Override
    public List<String> selectAllAges() {
        List<String> strings = joinedTablesMapper.selectAllAges();
        return strings;
    }

    @Override
    public List<String> selectAllGenders() {
        List<String> strings = joinedTablesMapper.selectAllGenders();
        return strings;
    }

    @Override
    public List<Dogadoption> selectByBreed(String breed) {
        return joinedTablesMapper.selectByBreed(breed);
    }

    @Override
    public List<Dogadoption> selectBySize(String size) {
        return joinedTablesMapper.selectBySize(size);
    }

    @Override
    public List<JoinedTables> selectByCol(Map<String, String> col) {
        return joinedTablesMapper.selectByCols(col);
    }

}
