package com.cwi.challenge.controller;

import com.cwi.challenge.model.Topic;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/topics")
public class TopicController {

    @PostMapping
    public ResponseEntity<Topic> save() {
        return new ResponseEntity<>(new Topic(), HttpStatus.CREATED);
    }
}
