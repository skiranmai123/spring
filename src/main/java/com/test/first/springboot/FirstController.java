package com.test.first.springboot;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class FirstController {


    @GetMapping(value = "/apartment-members/{key}")
    public ResponseEntity getJobs(@PathVariable String key){
        Map resultMap = new HashMap<>();

        List apartment1 = new ArrayList();
        apartment1.add("rrrrrrrrrrrrrrr");
        apartment1.add("aarvi");
        apartment1.add("suhaas");

        List apartment2 = new ArrayList();
        apartment2.add("kiranmai");
        apartment2.add("erigadu");
        apartment2.add("suhaas");

        List apartment3 = new ArrayList();

        resultMap.put("11111111",apartment1);
        resultMap.put("33333333",apartment2);
        resultMap.put("6678",apartment3);

        return new ResponseEntity<>(resultMap.get(key), HttpStatus.OK);
    }


    @GetMapping(value = "/childList")
    public ResponseEntity<List> getchildList(){
        List resultList = new ArrayList();
        resultList.add("chinnu123445555555555555555");
        resultList.add("arvi123");
        resultList.add("suhaas");
        return new ResponseEntity<>(resultList, HttpStatus.OK);
    }

    @GetMapping(value = "/addition")
    public ResponseEntity calculate(@RequestParam int firstNum, @RequestParam int secondNum){

        return new ResponseEntity<>(firstNum+secondNum, HttpStatus.OK);
    }
    @GetMapping(value = "/ranklist")
    public ResponseEntity calculate(@RequestParam int rankNo){
        Map resultMap = new HashMap<>();


        resultMap.put(22222222,"chinnu");
        resultMap.put(388,"rishi");
        resultMap.put(6678,"kannayya");

        return new ResponseEntity<>(resultMap.get(rankNo), HttpStatus.OK);
    }

}
