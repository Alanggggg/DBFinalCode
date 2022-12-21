package com.example.finalproject.DAO;

import com.example.finalproject.pojo.Dogadoption;
import java.util.*;
public interface DogadoptionMapper {
    int deleteByPrimaryKey(String id);

    int insert(Dogadoption record);

    int insertSelective(Dogadoption record);

    Dogadoption selectByPrimaryKey(String id);

    List<Dogadoption> selectByBreed(String breed);

    List<Dogadoption> selectBySize(String size);

    int updateByPrimaryKeySelective(Dogadoption record);

    int updateByPrimaryKey(Dogadoption record);

    List<String> selectAllBreeds();
    List<String> selectAllAges();
    List<String> selectAllGenders();
    List<String> selectAllSizes();
    Float calAdopRate(String age);
    List<HashMap<String,Object>> averageAdoptionSpeed();
    List<HashMap<String,Object>> adoptionRate();
    List<HashMap<String,Object>> adoptabledogs();
    List<HashMap<String,Object>> sizeadoptrate();
}