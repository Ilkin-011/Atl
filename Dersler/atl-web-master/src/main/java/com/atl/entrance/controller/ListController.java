package com.atl.entrance.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/v1/list")
public class ListController {
    @GetMapping("get")
    public List<String> gel() {
        List<String> list = List.of("Samir", "Aygun", "Huseyn");
        List<String> list1 = List.of("Resad", "Aygun", "Huseyn");
        List<String> newList = new ArrayList<>();
        for (String b : list1) {
            if (!list.contains(b)) {
                newList.add(b);
            }
            for (String a : list) {
                if (!list1.contains(a)) {
                    newList.add(a);
                }
            }
            return newList;
        }
        return newList;
    }
}