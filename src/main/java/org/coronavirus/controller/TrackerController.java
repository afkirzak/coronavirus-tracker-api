package org.coronavirus.controller;

import org.coronavirus.model.Data;
import org.coronavirus.service.TrackerService;
import org.springframework.beans.factory.annotation.Autowired;
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
        return "Welcome!\nThis is the fast and basic API for tracking development of the new coronavirus (COVID-19)";
    }

    @GetMapping("/all")
    public List<Data> all() {
        return trackerService.getLastData();
    }
}
