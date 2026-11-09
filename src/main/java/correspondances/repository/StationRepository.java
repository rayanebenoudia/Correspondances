package correspondances.repository;

import correspondances.entity.Station;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface StationRepository extends JpaRepository<Station, String> {

    // Requête dérivée : Spring la déduit du nom de la méthode
    Optional<Station> findByNameIgnoreCase(String name);
}
