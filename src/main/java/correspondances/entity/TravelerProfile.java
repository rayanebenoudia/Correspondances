package correspondances.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "traveler_profile")
public class TravelerProfile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    protected TravelerProfile() {}

    public TravelerProfile(String name) { this.name = name; }

    public Long getId() { return id; }
    public String getName() { return name; }
}