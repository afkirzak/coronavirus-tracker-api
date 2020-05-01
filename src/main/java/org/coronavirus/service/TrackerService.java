package org.coronavirus.service;

import org.coronavirus.model.Data;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TrackerService {

    public List<Data> getLastData() {
        List<Data> lastData = new ArrayList<>();
        lastData.add(new Data("China"));
        lastData.add(new Data("United states of america"));
        lastData.add(new Data("France"));
        lastData.add(new Data("Italy"));
        return lastData;
    }
}
