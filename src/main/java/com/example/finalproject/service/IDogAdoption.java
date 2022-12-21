package com.example.finalproject.service;

import com.example.finalproject.pojo.Dogadoption;

import java.util.*;

public interface IDogAdoption {

    List<String> getAllNames();

    List<String> selectAllSizes();

    List<Dogadoption> selectByBreed(String breed);

    List<Dogadoption> selectBySize(String size);

    Float calAdopRate(String age);

    List<HashMap<String,Object>> fastadopt();

    List<HashMap<String,Object>> economyadopt();
    List<HashMap<String,Object>> adoptablestate();
    List<HashMap<String,Object>> sizeadopted();
}
