package com.crick.api.CrickInformerBackend.controllers;

import com.crick.api.CrickInformerBackend.entities.Match;
import com.crick.api.CrickInformerBackend.services.MatchService;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/match")
public class MatchController {
    private MatchService matchService;

    public MatchController(MatchService matchService){
        this.matchService=matchService;
    }
    //GET LIVE MATCHES AND GIVE A PROPER RESPONSE WITH HTTP STATUS CODE
    @GetMapping("/live")
    public ResponseEntity<List<Match>>getLiveMatches(){
        return new ResponseEntity<>(this.matchService.getLiveMatch(), HttpStatus.OK);
    }

    //Get all matches
    @GetMapping
    public ResponseEntity<List<Match>>getAllMatches(){
        return new ResponseEntity<>(this.matchService.getAllMatches(), HttpStatus.OK);
    }
    @GetMapping("/point-table")
    public ResponseEntity<?>getCWC2023PointTable(){
        return new ResponseEntity<>(this.matchService.getCWC2023PointTable(),HttpStatus.OK);
    }
}
