package com.cwi.challenge.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/topics")
public class VotingController {

    @PostMapping("/{id}/voting")
    public ResponseEntity<String> startVoting() {
        return new ResponseEntity<>("VOTING STARTED.", HttpStatus.CREATED);
    }
}
