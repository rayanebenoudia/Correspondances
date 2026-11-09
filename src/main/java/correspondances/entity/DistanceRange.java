package correspondances.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "distance_range")
public class DistanceRange {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "min_distance", nullable = false)
    private Integer minDistance;

    @Column(name = "max_distance", nullable = false)
    private Integer maxDistance;

    protected DistanceRange() {}

    public DistanceRange(Integer minDistance, Integer maxDistance) {
        this.minDistance = minDistance;
        this.maxDistance = maxDistance;
    }

    public Long getId() { return id; }
    public Integer getMinDistance() { return minDistance; }
    public Integer getMaxDistance() { return maxDistance; }
}
