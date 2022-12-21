package com.example.finalproject.service.Impl;
import com.example.finalproject.DAO.StateeconomyMapper;
import com.example.finalproject.pojo.Stateeconomy;
import com.example.finalproject.service.IStateEconomy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class StateEconomyImpl implements IStateEconomy{
    @Autowired
    private StateeconomyMapper stateeconomyMapper;
}
