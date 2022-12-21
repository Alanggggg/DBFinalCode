package com.example.finalproject.controllers;

import com.example.finalproject.pojo.Dogadoption;
import com.example.finalproject.pojo.Doggroups;
import com.example.finalproject.pojo.Dogbreeds;
import com.example.finalproject.pojo.Stateeconomy;

import com.example.finalproject.service.IDogAdoption;
import com.example.finalproject.service.IDogGroups;
import com.example.finalproject.service.IDogShelter;
import com.example.finalproject.service.IDogBreeds;
import com.example.finalproject.service.IStateEconomy;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.*;

import org.json.JSONObject;

@RestController
@Slf4j

@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/test")
public class TestController {

    @Autowired
    IDogAdoption dogAdoption;
    @Autowired
    IDogGroups dogGroup;
    @Autowired
    IDogShelter dogShelter;
    @Autowired
    IDogBreeds dogBreeds;

    
    @GetMapping("/allFNames")
    @ResponseBody
    public List<String> getAllFnames() {
        List<String> names = dogAdoption.getAllNames();
        return names;
    }

    @GetMapping("/selectByBreed")
    @ResponseBody
    public List<Dogadoption> selectByBreed(@RequestParam(value="breed",required=true) String breed) {
        System.out.println(breed);
        List<Dogadoption> result = dogAdoption.selectByBreed(breed);
        return result;
    }

    @GetMapping("/selectAllSizes")
    @ResponseBody
    public List<String> selectAllSizes() {
        List<String> result = dogAdoption.selectAllSizes();
        return result;
    }

//    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping("/selectBySize")
    @ResponseBody
    public List<Dogadoption> selectBySize(@RequestParam String size) {
        List<Dogadoption> result = dogAdoption.selectBySize(size);
        return result;
    }

    @GetMapping("/calAdopRate")
    @ResponseBody
    public List<Map<String,Object>> CalAdopRate() {
        List<Map<String,Object>> b = new ArrayList<>();
        Map<String,Object> m1 = new HashMap<String,Object>(); 
        Map<String,Object> m2 = new HashMap<String,Object>(); 
        Map<String,Object> m3 = new HashMap<String,Object>(); 
        Map<String,Object> m4 = new HashMap<String,Object>(); 
        Float result_b = dogAdoption.calAdopRate("Baby");
        Float result_s = dogAdoption.calAdopRate("Senior");
        Float result_a = dogAdoption.calAdopRate("Adult");
        Float result_y = dogAdoption.calAdopRate("Young");
        m1.put("Age", "Baby");
        m1.put("Rate", result_b);
        b.add(m1);
        m2.put("Age", "Senior");
        m2.put("Rate", result_s);
        b.add(m2);
        m3.put("Age", "Adult");
        m3.put("Rate", result_a);
        b.add(m3);
        m4.put("Age", "Young");
        m4.put("Rate", result_y);
        b.add(m4);
        return b;
    }

    @GetMapping("/higherenergy")
    @ResponseBody
    public List<String> higherenergy() {
        return dogGroup.higherthanaverage();
    }

    @GetMapping("/mostherd")
    @ResponseBody
    public List<HashMap<String, Object>> mostherd() {
        return dogShelter.mostherd();

    }

    @GetMapping("/fastadopt")
    @ResponseBody
    public List<HashMap<String,Object>> fastadopt() {
        return dogAdoption.fastadopt();
    }

    @GetMapping("/economyadopt")
    @ResponseBody
    public List<HashMap<String,Object>> economyadopt() {
        return dogAdoption.economyadopt();
    }

    @GetMapping("/adoptablestate")
    @ResponseBody
    public List<HashMap<String,Object>> adoptablestate() {
        return dogAdoption.adoptablestate();
    }

    @GetMapping("/sizeadopted")
    @ResponseBody
    public List<HashMap<String,Object>> sizeadopted() {
        return dogAdoption.sizeadopted();
    }

    @GetMapping("/numbershelter")
    @ResponseBody
    public List<HashMap<String,Object>> numbershelter() {
        return dogShelter.numbershelter();
    }

    @GetMapping("/mostdogsinshelter")
    @ResponseBody
    public List<HashMap<String,Object>> mostdogsinshelter() {
        return dogShelter.mostdogsinshelter();
    }

    @GetMapping("/mostpopularfemale")
    @ResponseBody
    public List<HashMap<String,Object>> mostpopularfemale() {
        return dogBreeds.mostpopularfemale();
    }

    @GetMapping("/dailygroom")
    @ResponseBody
    public List<HashMap<String,Object>> dailygroom() {
        return dogBreeds.dailygroom();
    }
}
