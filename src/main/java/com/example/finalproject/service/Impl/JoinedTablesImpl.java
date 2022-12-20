package com.example.finalproject.service.Impl;

import com.example.finalproject.DAO.JoinedTablesMapper;
import com.example.finalproject.pojo.JoinedTables;
import com.example.finalproject.service.IJoinedTables;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Map;

public class JoinedTablesImpl implements IJoinedTables {

    @Autowired
    private JoinedTablesMapper joinedtablesMapper;

    @Override
    public List<JoinedTables> selectByCol(Map<String, String> col) {
        return joinedtablesMapper.selectByCols(col);
    }
}
