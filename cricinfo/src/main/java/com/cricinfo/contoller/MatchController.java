package com.cricinfo.contoller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cricinfo.model.Match;
import com.cricinfo.services.MatchService;

import java.util.*;

@RestController
@CrossOrigin("*")
@RequestMapping("/cricket")
public class MatchController {
    @Autowired
    private MatchService matchService;

    @GetMapping("/live")
    public ResponseEntity<?> getLiveMatchScores() throws InterruptedException{
        System.out.println("Getting Live Match");
        return new ResponseEntity<>(matchService.getLiveMatchScores(), HttpStatus.OK);
    }
    @GetMapping("/point-table")
    public ResponseEntity<?> getCWC2023PointTable(){
        return new ResponseEntity<>(matchService.getCWC2023PointTable(), HttpStatus.OK);
    }
    @GetMapping("/point-table-ipl")
    public ResponseEntity<?> getIPL2024PointTable(){
        return new ResponseEntity<>(matchService.getIPL2024PointTable(), HttpStatus.OK);
    }
    @GetMapping
    public ResponseEntity<List<Match>> getAllMatches(){
        return new ResponseEntity<>(matchService.getAllMatches(), HttpStatus.OK);
    }
}
