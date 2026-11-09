package correspondances.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "seat_class")
public class SeatClass {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    protected SeatClass() {}

    public SeatClass(String name) { this.name = name; }

    public Long getId() { return id; }
    public String getName() { return name; }
}
