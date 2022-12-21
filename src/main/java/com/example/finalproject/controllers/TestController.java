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

import com.example.finalproject.pojo.JoinedTables;
import com.example.finalproject.service.IJoinedTables;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.*;

import org.json.JSONObject;
import java.util.List;
import java.util.Map;
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
    @CrossOrigin(origins = "http://localhost:3000")
    @ResponseBody
    public List<String> selectAllSizes() {
        List<String> result = dogAdoption.selectAllSizes();
        return result;
    }

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
=======
    @GetMapping("/selectAllAges")
    @CrossOrigin(origins = "http://localhost:3000")
    @ResponseBody
    public List<String> selectAllAges() {
        List<String> result = dogAdoption.selectAllAges();
        return result;
    }

    @GetMapping("/selectAllGenders")
    @CrossOrigin(origins = "http://localhost:3000")
    @ResponseBody
    public List<String> selectAllGenders() {
        List<String> result = dogAdoption.selectAllGenders();
        return result;
    }

    @GetMapping("/selectAllCities")
    @CrossOrigin(origins = "http://localhost:3000")
    @ResponseBody
    public List<String> selectAllCities() {
        List<String> result = dogAdoption.selectAllCities();
        return result;
    }

    @GetMapping("/selectByCol")
    @CrossOrigin(origins = "http://localhost:3000")
    @ResponseBody
    public List<JoinedTables> selectByCol(@RequestParam Map<String, String> col) {
        Double lat = Double.parseDouble(col.get("latitude"));
        Double longi = Double.parseDouble(col.get("longitude"));
        col.remove("latitude");
        col.remove("longitude");
        List<JoinedTables> ljt = dogAdoption.selectByCol(col);
        ljt = ljt.stream().filter(record -> distance(lat,longi,
            Double.parseDouble(record.getLatitude().toString()),
            Double.parseDouble(record.getLongitude().toString())) < 10)
            .collect(Collectors.toList());
        return ljt;
    }

    private static double distance(double lat1, double lon1, double lat2, double lon2) {
        if ((lat1 == lat2) && (lon1 == lon2)) {
            return 0;
        }
        else {
            double theta = lon1 - lon2;
            double dist = Math.sin(Math.toRadians(lat1)) * Math.sin(Math.toRadians(lat2)) + Math.cos(Math.toRadians(lat1)) * Math.cos(Math.toRadians(lat2)) * Math.cos(Math.toRadians(theta));
            dist = Math.acos(dist);
            dist = Math.toDegrees(dist);
            dist = dist * 60 * 1.1515;
            return (dist);
        }
    }


>>>>>>> ca96cb3194ea3babfafa4d5cf9533d5767d61b3c
}
