package com.example.finalproject.DAO;

import com.example.finalproject.pojo.Stateeconomy;
import java.util.*;
public interface StateeconomyMapper {
    int deleteByPrimaryKey(String state);

    int insert(Stateeconomy record);

    int insertSelective(Stateeconomy record);

    Stateeconomy selectByPrimaryKey(String state);

    int updateByPrimaryKeySelective(Stateeconomy record);

    int updateByPrimaryKey(Stateeconomy record);
}