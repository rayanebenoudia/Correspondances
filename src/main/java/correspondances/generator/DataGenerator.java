package correspondances.generator;

import org.springframework.boot.CommandLineRunner;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class DataGenerator implements CommandLineRunner {

    private final JdbcTemplate jdbcTemplate;

    public DataGenerator(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public void run(String... args) {

        Integer count = jdbcTemplate.queryForObject(
            "SELECT COUNT(*) FROM station",
            Integer.class
        );

        if (count != null && count == 0) {

            jdbcTemplate.update(
                "INSERT INTO station (name, city, code) VALUES (?, ?, ?)",
                "Marseille Saint-Charles", "Marseille", "MSC"
            );

            jdbcTemplate.update(
                "INSERT INTO station (name, city, code) VALUES (?, ?, ?)",
                "Gare d'Aix-en-Provence", "Aix-en-Provence", "AIX"
            );

            jdbcTemplate.update(
                "INSERT INTO station (name, city, code) VALUES (?, ?, ?)",
                "Avignon Centre", "Avignon", "AVC"
            );
        }
    }
}