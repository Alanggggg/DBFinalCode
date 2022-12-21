package com.example.finalproject.service.Impl;
import com.example.finalproject.DAO.DogshelterMapper;
import com.example.finalproject.pojo.Dogshelter;
import com.example.finalproject.service.IDogShelter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class DogShelterImpl implements IDogShelter{
    @Autowired
    private DogshelterMapper dogsheltermapper;

    @Override
    public List<HashMap<String, Object>> mostherd(){
        // List<HashMap<String, Object>> res = new ArrayList<HashMap<String, Object>>();
        List<HashMap<String, Object>> list = dogsheltermapper.top5states();
        System.out.println(list);
        return list;
    }
    @Override
    public List<HashMap<String,Object>> numbershelter(){
        List<HashMap<String,Object>> list = dogsheltermapper.mostshelter();
        // SortedMap<String, Integer> map = new TreeMap<String, Integer>();

        // if (list != null && !list.isEmpty()) {
        //     for (HashMap<String, Object> hashMap : list) {
        //         String key = null;
        //         Integer value = null;
        //         for (Map.Entry<String, Object> entry : hashMap.entrySet()) {
        //             if ("state".equals(entry.getKey())) {
        //                     key = (String) entry.getValue();
        //             } else if ("shelternum".equals(entry.getKey())) {
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
    public List<HashMap<String,Object>> mostdogsinshelter(){
        List<HashMap<String,Object>> list = dogsheltermapper.mostdogs();
        // SortedMap<String, Integer> map = new TreeMap<String, Integer>();

        // if (list != null && !list.isEmpty()) {
        //     for (HashMap<String, Object> hashMap : list) {
        //         String key = null;
        //         Integer value = null;
        //         for (Map.Entry<String, Object> entry : hashMap.entrySet()) {
        //             if ("name".equals(entry.getKey())) {
        //                     key = (String) entry.getValue();
        //             } else if ("adoptablenum".equals(entry.getKey())) {
        //                     //我需要的是int型所以做了如下转换，实际上返回的object应为Long。
        //                     value = ((Long)entry.getValue()).intValue();
        //             }     
        //         }
        //         map.put(key, value);
        //     }
        // }
        // System.out.println(list);
        return list;
    }
}
