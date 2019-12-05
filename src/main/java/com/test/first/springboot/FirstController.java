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
        apartment1.add("yyyyyy");
        apartment1.add("suhaas");

        List apartment2 = new ArrayList();
        apartment2.add("anuuuuuuuuuu");
        apartment2.add("chittiiiiiiii");
        apartment2.add("pinkyyyyyyyyyyyyyy");

        List apartment3 = new ArrayList();

        resultMap.put("11111111",apartment1);
        resultMap.put("33333333",apartment2);
        resultMap.put("8888888888888888888",apartment3);

        return new ResponseEntity<>(resultMap.get(key), HttpStatus.OK);
    }


    @GetMapping(value = "/childList")
    public ResponseEntity<List> getchildList(){
        List resultList = new ArrayList();
        resultList.add("chinnu123445555555555555555");
        resultList.add("arvi123");
        resultList.add("pppppppppppppppp");
        return new ResponseEntity<>(resultList, HttpStatus.OK);
    }

    @GetMapping(value = "/addition")
    public ResponseEntity calculate(@RequestParam int firstNum, @RequestParam int secondNum){

        return new ResponseEntity<>(firstNum+secondNum, HttpStatus.OK);
    }
    @GetMapping(value = "/ranklist")
    public ResponseEntity calculate(@RequestParam int rankNo){
        Map resultMap = new HashMap<>();


        resultMap.put(12121212,"chinnu");
        resultMap.put(2222222,"rishi");
        resultMap.put(11111111,"kannayya");

        return new ResponseEntity<>(resultMap.get(rankNo), HttpStatus.OK);
    }

}
