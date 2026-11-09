package com.correspondances.controller;

import com.correspondances.model.Station;
import com.correspondances.service.StationService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/stations")
@Tag(name = "Station Controller", description = "REST API endpoints for managing stations")
public class StationController {

    private final StationService stationService;

    public StationController(StationService stationService) {
        this.stationService = stationService;
    }

    @GetMapping
    @Operation(summary = "Get all stations", description = "Retrieves a list of all available stations")
    public ResponseEntity<List<Station>> getAllStations() {
        return ResponseEntity.ok(stationService.getAllStations());
    }

    @GetMapping("/{id}")
    @Operation(summary = "Get station by ID", description = "Retrieves a specific station by its unique identifier")
    public ResponseEntity<Station> getStationById(@PathVariable Long id) {
        return ResponseEntity.ok(stationService.getStationById(id));
    }

    @PostMapping
    @Operation(summary = "Create a new station", description = "Creates a new station record")
    public ResponseEntity<Station> createStation(@Valid @RequestBody Station station) {
        Station created = stationService.createStation(station);
        return new ResponseEntity<>(created, HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "Delete a station", description = "Deletes a station record by its ID")
    public ResponseEntity<Void> deleteStation(@PathVariable Long id) {
        stationService.deleteStation(id);
        return ResponseEntity.noContent().build();
    }
}