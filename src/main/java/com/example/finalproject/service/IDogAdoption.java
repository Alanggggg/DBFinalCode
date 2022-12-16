package com.example.finalproject.service;

import com.example.finalproject.pojo.Dogadoption;

import java.util.List;

public interface IDogAdoption {

    List<String> getAllNames();

    List<String> selectAllSizes();

    List<Dogadoption> selectByBreed(String breed);

    List<Dogadoption> selectBySize(String size);



}
