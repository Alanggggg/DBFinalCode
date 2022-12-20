package com.example.finalproject.service;

import com.example.finalproject.pojo.Dogadoption;
import com.example.finalproject.pojo.JoinedTables;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface IDogAdoption {

    List<String> getAllNames();

    List<String> selectAllSizes();
    List<String> selectAllAges();
    List<String> selectAllGenders();

    List<Dogadoption> selectByBreed(String breed);

    List<Dogadoption> selectBySize(String size);
    List<JoinedTables> selectByCol(Map<String, String> col);





}
