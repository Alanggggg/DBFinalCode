package com.example.finalproject.controllers;

import com.example.finalproject.pojo.Dogadoption;
import com.example.finalproject.pojo.JoinedTables;
import com.example.finalproject.service.IDogAdoption;
import com.example.finalproject.service.IJoinedTables;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@RestController
@Slf4j

@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/test")
public class TestController {

    @Autowired
    IDogAdoption dogAdoption;

    @GetMapping("/allFNames")
    @ResponseBody
    public List<String> getAllFnames() {
        List<String> names = dogAdoption.getAllNames();
        return names;
    }

    @GetMapping("/selectByBreed")
    @ResponseBody
    public List<Dogadoption> selectByBreed(@RequestParam String breed) {
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


}
