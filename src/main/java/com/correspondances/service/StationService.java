package com.correspondances.service;

import com.correspondances.model.Station;
import org.springframework.stereotype.Service;
import java.util.Collections;
import java.util.List;

@Service
public class StationService {
    public List<Station> getAllStations() {
        return Collections.emptyList();
    }

    public Station getStationById(Long id) {
        Station s = new Station();
        s.setId(id);
        s.setName("Station Test");
        return s;
    }

    public Station createStation(Station station) {
        station.setId(1L);
        return station;
    }

    public void deleteStation(Long id) {
        // Suppression fictive
    }
}