package com.cwi.challenge.controller;

import com.cwi.challenge.model.Associate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/associates")
public class AssociateController {

    @PostMapping
    public ResponseEntity<Associate> save() {
        return new ResponseEntity<>(new Associate(), HttpStatus.CREATED);
    }
}
