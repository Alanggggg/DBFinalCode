package com.example.finalproject.service.Impl;
import com.example.finalproject.DAO.DogbreedsMapper;
import com.example.finalproject.pojo.Dogbreeds;
import com.example.finalproject.service.IDogBreeds;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class DogBreedsImpl implements IDogBreeds{
    @Autowired
    private DogbreedsMapper dogbreedsMapper;

    @Override
    public List<Dogbreeds> higherthanaverage(@Param("group") String group, @Param("energy_value") Float energy_value){
        return dogbreedsMapper.higherthanaverage(group,energy_value);
    }
    @Override
    public List<HashMap<String,Object>> mostpopularfemale(){
        List<HashMap<String,Object>> list = dogbreedsMapper.mostpopular();
        // SortedMap<String, Integer> map = new TreeMap<String, Integer>();
        // if (list != null && !list.isEmpty()) {
        //     for (HashMap<String, Object> hashMap : list) {
        //         String key = null;
        //         Integer value = null;
        //         for (Map.Entry<String, Object> entry : hashMap.entrySet()) {
        //             if ("state".equals(entry.getKey())) {
        //                     key = (String) entry.getValue();
        //             } else if ("adoptablenum".equals(entry.getKey())) {
        //                     //我需要的是int型所以做了如下转换，实际上返回的object应为Long。
        //                     value = ((Long)entry.getValue()).intValue();
        //             }     
        //         }
        //         map.put(key, value);
        //     }
        // }
        // System.out.println(map);
        return list;
    }
    @Override
    public List<HashMap<String,Object>> dailygroom(){
        List<HashMap<String,Object>> list = dogbreedsMapper.dailygroom();
        // SortedMap<String, Integer> map = new TreeMap<String, Integer>();
        // if (list != null && !list.isEmpty()) {
        //     for (HashMap<String, Object> hashMap : list) {
        //         String key = null;
        //         Integer value = null;
        //         for (Map.Entry<String, Object> entry : hashMap.entrySet()) {
        //             if ("state".equals(entry.getKey())) {
        //                     key = (String) entry.getValue();
        //             } else if ("adoptablenum".equals(entry.getKey())) {
        //                     //我需要的是int型所以做了如下转换，实际上返回的object应为Long。
        //                     value = ((Long)entry.getValue()).intValue();
        //             }     
        //         }
        //         map.put(key, value);
        //     }
        // }
        // System.out.println(map);
        return list;
    }
}
