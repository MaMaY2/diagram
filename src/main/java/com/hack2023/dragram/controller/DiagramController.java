package com.hack2023.dragram.controller;

import com.hack2023.dragram.entity.DiagramComponent;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("api/")
public class DiagramController {

    @RequestMapping("diagrams")
    public List<DiagramComponent> getDiagrams() {
        List<DiagramComponent> list = new ArrayList<>();
        return list;
    }
}
