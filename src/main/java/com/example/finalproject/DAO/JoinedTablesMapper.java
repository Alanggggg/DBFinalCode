package com.example.finalproject.DAO;

import com.example.finalproject.pojo.Dogadoption;
import com.example.finalproject.pojo.JoinedTables;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface JoinedTablesMapper {
    int insert(JoinedTables row);

    int insertSelective(JoinedTables row);

    List<JoinedTables> selectByCols(@Param("col") Map<String, String> col);
    List<String> selectAllBreeds();
    List<String> selectAllSizes();
    List<Dogadoption> selectByBreed(String breed);
    List<Dogadoption> selectBySize(String size);
    List<String> selectAllAges();
    List<String> selectAllGenders();
    List<String> selectAllCities();

}