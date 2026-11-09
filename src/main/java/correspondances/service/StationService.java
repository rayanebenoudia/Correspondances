package correspondances.service;

import correspondances.entity.Station;
import correspondances.repository.StationRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Service
public class StationService {

    private final StationRepository stationRepository;

    public StationService(StationRepository stationRepository) {
        this.stationRepository = stationRepository;
    }

    @Transactional(readOnly = true)
    public List<Station> findAll() {
        return stationRepository.findAll();
    }

    @Transactional(readOnly = true)
    public Station findByCode(String code) {
        return stationRepository.findById(code)
                .orElseThrow(() -> new IllegalArgumentException("Station not found: " + code));
    }

    @Transactional
    public Station create(String code, String name) {
        if (code == null || code.isBlank() || name == null || name.isBlank()) {
            throw new IllegalArgumentException("Station code and name are required");
        }
        if (stationRepository.existsById(code)) {
            throw new IllegalStateException("Station already exists: " + code);
        }
        return stationRepository.save(new Station(code, name));
    }

    @Transactional
    public void delete(String code) {
        if (!stationRepository.existsById(code)) {
            throw new IllegalArgumentException("Station not found: " + code);
        }
        stationRepository.deleteById(code);
    }
}
