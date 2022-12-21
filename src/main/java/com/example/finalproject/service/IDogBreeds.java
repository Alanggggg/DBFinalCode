package com.example.finalproject.service;

import com.example.finalproject.pojo.Dogbreeds;
import org.apache.ibatis.annotations.Param;
import java.util.*;

public interface IDogBreeds {
    List<Dogbreeds> higherthanaverage(@Param("group") String group, @Param("energy_value") Float energy_value);
    List<HashMap<String,Object>> mostpopularfemale();
    List<HashMap<String,Object>> dailygroom();
}
