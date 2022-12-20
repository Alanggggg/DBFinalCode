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

    @GetMapping("/selectByCol")
    @CrossOrigin(origins = "http://localhost:3000")
    @ResponseBody
    public List<JoinedTables> selectByCol(@RequestParam Map<String, String> col) {
        return dogAdoption.selectByCol(col);
    }


}
