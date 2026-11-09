package correspondances.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "fare_period")
public class FarePeriod {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    protected FarePeriod() {}

    public FarePeriod(String name) { this.name = name; }

    public Long getId() { return id; }
    public String getName() { return name; }
}
