package com.example.finalproject.service;

import com.example.finalproject.pojo.JoinedTables;
import java.util.List;
import java.util.Map;

public interface IJoinedTables {
    List<JoinedTables> selectByCol(Map<String, String> col);

}
