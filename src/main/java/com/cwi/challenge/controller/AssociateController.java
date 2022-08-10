package com.cwi.challenge.controller;

import com.cwi.challenge.model.Associate;
import com.cwi.challenge.repository.AssociateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/associates")
public class AssociateController {

    @Autowired
    private AssociateRepository associateRepository;

    @PostMapping
    public ResponseEntity<Associate> save() {
        return new ResponseEntity<>(new Associate(), HttpStatus.CREATED);
    }
}
