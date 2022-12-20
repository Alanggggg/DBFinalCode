package com.example.finalproject.DAO;

import com.example.finalproject.pojo.Dogadoption;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface DogadoptionMapper {
    int deleteByPrimaryKey(String id);

    int insert(Dogadoption row);

    int insertSelective(Dogadoption row);

    Dogadoption selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Dogadoption row);

    int updateByPrimaryKey(Dogadoption row);

    List<Dogadoption> selectByBreed(String breed);
    List<String> selectAllSizes();
    List<String> selectAllBreeds();
    List<Dogadoption> selectBySize(String size);
    List<Dogadoption> selectByCols(@Param("col") Map<String, String> col);

}