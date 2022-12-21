package com.example.finalproject.DAO;

import com.example.finalproject.pojo.Doggroups;
import java.util.*;
public interface DoggroupsMapper {
    int deleteByPrimaryKey(String group);

    int insert(Doggroups record);

    int insertSelective(Doggroups record);

    Doggroups selectByPrimaryKey(String group);

    int updateByPrimaryKeySelective(Doggroups record);

    int updateByPrimaryKey(Doggroups record);

    List<Doggroups> averageEnergy();
}