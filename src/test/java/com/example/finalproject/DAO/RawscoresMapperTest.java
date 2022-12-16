package com.example.finalproject.DAO;

import com.example.finalproject.FinalProjectApplicationTests;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class RawscoresMapperTest extends FinalProjectApplicationTests {
    @Autowired
    private DogadoptionMapper dogadoptionMapper;

//    @Test
//    public void queryBySSN() {
//        Rawscores bySSN = rawscoresMapper.selectByPrimaryKey("1006");
//        System.out.println(bySSN.toString());
//    }

    @Test
    public void queryAllFnames() {
        List<String> names = dogadoptionMapper.selectAllBreeds();
        for (String name : names) {
            System.out.println(name);
        }
    }
}