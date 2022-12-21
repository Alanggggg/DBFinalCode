package com.example.finalproject.service;

import com.example.finalproject.pojo.Dogadoption;
import com.example.finalproject.pojo.JoinedTables;

import java.util.*;

public interface IDogAdoption {

    List<String> getAllNames();

    List<String> selectAllSizes();
    List<String> selectAllAges();
    List<String> selectAllGenders();

    List<Dogadoption> selectByBreed(String breed);

    List<Dogadoption> selectBySize(String size);
    List<JoinedTables> selectByCol(Map<String, String> col);

    Float calAdopRate(String age);


    List<HashMap<String,Object>> fastadopt();

    List<HashMap<String,Object>> economyadopt();
    List<HashMap<String,Object>> adoptablestate();
    List<HashMap<String,Object>> sizeadopted();
}
