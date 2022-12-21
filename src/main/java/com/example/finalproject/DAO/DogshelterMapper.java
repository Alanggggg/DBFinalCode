package com.example.finalproject.DAO;

import com.example.finalproject.pojo.Dogshelter;
import java.util.*;
public interface DogshelterMapper {
    int deleteByPrimaryKey(String id);

    int insert(Dogshelter record);

    int insertSelective(Dogshelter record);

    Dogshelter selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Dogshelter record);

    int updateByPrimaryKey(Dogshelter record);

    List<HashMap<String,Object>> top5states();
    List<HashMap<String,Object>> mostshelter();
    List<HashMap<String,Object>> mostdogs();
}