package com.example.finalproject.DAO;

import com.example.finalproject.pojo.Dogbreeds;
import java.util.*;
import org.apache.ibatis.annotations.Param;
public interface DogbreedsMapper {
    int deleteByPrimaryKey(String breed);

    int insert(Dogbreeds record);

    int insertSelective(Dogbreeds record);

    Dogbreeds selectByPrimaryKey(String breed);

    int updateByPrimaryKeySelective(Dogbreeds record);

    int updateByPrimaryKey(Dogbreeds record);

    List<Dogbreeds> higherthanaverage(@Param("group") String group, @Param("energy_value") Float energy_value);

    List<HashMap<String,Object>> mostpopular();

    List<HashMap<String,Object>> dailygroom();
}