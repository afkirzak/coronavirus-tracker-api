package org.coronavirus.service;

import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

@Service
public class TrackerService {

    public List getLastData() {
        List<Data> lastData = new ArrayList<>();
        lastData.add(new Data("China"));
        lastData.add(new Data("United states of america"));
        lastData.add(new Data("France"));
        lastData.add(new Data("Italy"));
        return lastData;
    }

    private class Data {

        private String country;
        private String lastUpdated;
        private int confirmed;
        private int deaths;
        private int recovered;

        public Data(String country) {
            this.country = country;
            lastUpdated = new SimpleDateFormat("yyyy-MM-dd'T'hh:mm:ss").format(new Date());
            confirmed = new Random().nextInt(500);
            deaths = new Random().nextInt(20);
            recovered = new Random().nextInt(100);
        }

        public String getCountry() {
            return country;
        }

        public void setCountry(String country) {
            this.country = country;
        }

        public String getLastUpdated() {
            return lastUpdated;
        }

        public void setLastUpdated(String lastUpdated) {
            this.lastUpdated = lastUpdated;
        }

        public int getConfirmed() {
            return confirmed;
        }

        public void setConfirmed(int confirmed) {
            this.confirmed = confirmed;
        }

        public int getDeaths() {
            return deaths;
        }

        public void setDeaths(int deaths) {
            this.deaths = deaths;
        }

        public int getRecovered() {
            return recovered;
        }

        public void setRecovered(int recovered) {
            this.recovered = recovered;
        }
    }
}
