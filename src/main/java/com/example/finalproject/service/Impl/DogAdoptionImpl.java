package com.example.finalproject.service.Impl;

import com.example.finalproject.DAO.DogadoptionMapper;
import com.example.finalproject.DAO.JoinedTablesMapper;
import com.example.finalproject.pojo.Dogadoption;
import com.example.finalproject.pojo.JoinedTables;
import com.example.finalproject.service.IDogAdoption;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.*;
import java.util.Map;

@Service
public class DogAdoptionImpl implements IDogAdoption {
    @Autowired
    private JoinedTablesMapper joinedTablesMapper;
    @Autowired
    private DogadoptionMapper dogadoptionMapper;
    @Override
    public List<String> getAllNames() {
        //get all the unique names in the database
        List<String> strings = joinedTablesMapper.selectAllBreeds();
        return strings;
    }

    @Override
    public List<String> selectAllSizes() {
        List<String> strings = joinedTablesMapper.selectAllSizes();
        return strings;
    }

    @Override
    public List<String> selectAllAges() {
        List<String> strings = joinedTablesMapper.selectAllAges();
        return strings;
    }

    @Override
    public List<String> selectAllGenders() {
        List<String> strings = joinedTablesMapper.selectAllGenders();
        return strings;
    }

    @Override
    public List<Dogadoption> selectByBreed(String breed) {
        return joinedTablesMapper.selectByBreed(breed);
    }

    @Override
    public List<Dogadoption> selectBySize(String size) {
        return dogadoptionMapper.selectBySize(size);
    }
    @Override
    public List<JoinedTables> selectByCol(Map<String, String> col) {
        return joinedTablesMapper.selectByCols(col);
    }
    @Override
    public Float calAdopRate(String age){
        return dogadoptionMapper.calAdopRate(age);
    }
    @Override
    public List<HashMap<String,Object>> fastadopt(){
        List<HashMap<String,Object>> list = dogadoptionMapper.averageAdoptionSpeed();
        // SortedMap<String, Float> map = new TreeMap<String, Float>();
        // // System.out.println(list);
        // if (list != null && !list.isEmpty()) {
        //     for (HashMap<String, Object> hashMap : list) {
        //         String key = null;
        //         Float value = null;
        //         for (Map.Entry<String, Object> entry : hashMap.entrySet()) {
        //             if ("state".equals(entry.getKey())) {
        //                     key = (String) entry.getValue();
        //             } else if ("adopt_time".equals(entry.getKey())) {
        //                     //我需要的是int型所以做了如下转换，实际上返回的object应为Long。
        //                     value = Float.parseFloat(entry.getValue().toString());
                            
        //             }     
        //         }
        //         map.put(key,value);
        //     }
        // }
        // System.out.println(map);
        return list;
    }
    @Override
    public List<HashMap<String,Object>> economyadopt(){ //'CA':[0.5,2000]
        //HashMap<String,List<Float>> map = new HashMap<String,List<Float>>();
        List<HashMap<String,Object>> list = dogadoptionMapper.adoptionRate();
        // if (list != null && !list.isEmpty()) {
        //     for (HashMap<String, Object> hashMap : list) {
        //         String key = null;
        //         Integer economy = null;
        //         Float rate = null;
        //         for (Map.Entry<String, Object> entry : hashMap.entrySet()) {
        //             if ("state".equals(entry.getKey())) {
        //                     key = (String) entry.getValue();
        //             } else if ("adopt_time".equals(entry.getKey())) {
        //                     //我需要的是int型所以做了如下转换，实际上返回的object应为Long。
        //                     rate = Float.parseFloat(entry.getValue().toString());
        //             } else if ("adopt_time".equals(entry.getKey())) {
        //                 //我需要的是int型所以做了如下转换，实际上返回的object应为Long。
        //                 economy = ((Long)entry.getValue()).intValue();
        //             }
        //         }
        //         // map.put(key,value);
        //     }
        // }
        return list;
    }
    @Override
    public List<HashMap<String,Object>> adoptablestate(){
        List<HashMap<String,Object>> list = dogadoptionMapper.adoptabledogs();
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
    public List<HashMap<String,Object>> sizeadopted(){
        List<HashMap<String,Object>> list = dogadoptionMapper.sizeadoptrate();
        // SortedMap<String, Float> map = new TreeMap<String, Float>();
        // if (list != null && !list.isEmpty()) {
        //     for (HashMap<String, Object> hashMap : list) {
        //         String key = null;
        //         Float value = null;
        //         for (Map.Entry<String, Object> entry : hashMap.entrySet()) {
        //             if ("size".equals(entry.getKey())) {
        //                     key = (String) entry.getValue();
        //             } else if ("adoptedrate".equals(entry.getKey())) {
        //                     //我需要的是int型所以做了如下转换，实际上返回的object应为Long。
        //                     value = Float.parseFloat(entry.getValue().toString());
        //             }     
        //         }
        //         map.put(key, value);
        //     }
        // }
        // System.out.println(map);
        return list;
    }
}
