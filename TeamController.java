package com.example.acko.controllers;


import com.example.acko.services.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class TeamController {

    @Autowired
    TeamService teamService;

    @RequestMapping(method = RequestMethod.POST, value = "/create-team")
    public ResponseEntity<Object> createTeam(Map<String, Object> request) {
        return (ResponseEntity<Object>) teamService.createTeam(request);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/receive-alert")
    public ResponseEntity<Object> receiveAlert(String teamId) {
        return (ResponseEntity<Object>) teamService.receiveAlert(teamId);


    }
}

