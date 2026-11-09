package correspondances.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "station")
public class Station {

    @Id
    @Column(name = "code", length = 10, nullable = false)
    private String code;

    @Column(name = "name", nullable = false)
    private String name;

    protected Station() {
        // requis par JPA
    }

    public Station(String code, String name) {
        this.code = code;
        this.name = name;
    }

    public String getCode() { return code; }
    public String getName() { return name; }
}