package com.example.finalproject.controllers;

import com.example.finalproject.pojo.Dogadoption;
import com.example.finalproject.service.IDogAdoption;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

}
