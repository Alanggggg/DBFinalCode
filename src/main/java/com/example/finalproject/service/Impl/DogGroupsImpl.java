package com.example.finalproject.service.Impl;

import com.example.finalproject.DAO.DoggroupsMapper;
import com.example.finalproject.pojo.Doggroups;
import com.example.finalproject.DAO.DogbreedsMapper;
import com.example.finalproject.pojo.Dogbreeds;
import com.example.finalproject.service.IDogGroups;
import com.example.finalproject.service.IDogBreeds;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class DogGroupsImpl implements IDogGroups {
    @Autowired
    private DoggroupsMapper doggroupMapper;
    @Autowired
    private DogbreedsMapper dogbreedMapper;
    
    @Override
    public List<String> higherthanaverage(){
        List<String> b = new ArrayList<String>();
    
        List<Doggroups> groupenergy = doggroupMapper.averageEnergy();
        for(Doggroups g : groupenergy){
            Float energy_value = g.getAverageEnergyLevel();
            String group = g.getGroup();
            List<Dogbreeds> res = dogbreedMapper.higherthanaverage(group, energy_value); //breed->energy
            for (Dogbreeds r : res){
                b.add(r.getBreed());
            }
        }
        return b;
    }

}
