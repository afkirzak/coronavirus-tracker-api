package org.coronavirus.controller;

import org.coronavirus.service.TrackerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/coronavirus-tracker/api")
public class TrackerController {

    @Autowired
    private TrackerService trackerService;

    @GetMapping("/welcome")
    public String welcome() {
        return "Welcome!\nThis is the fast and basic API for tracking development of the new coronavirus (COVID-19)\nV1.1.0.";
    }

    @CrossOrigin
    @GetMapping("/all")
    public List all() {
        return trackerService.getLastData();
    }
}
