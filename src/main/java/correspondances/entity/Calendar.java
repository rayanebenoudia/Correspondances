package correspondances.entity;


import jakarta.persistence.*;

@Entity
@Table(name = "calendar")
public class Calendar {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Enumerated(EnumType.STRING)
    @Column(name = "type", nullable = false)
    private CalendarType type;

    protected Calendar() {}

    public Calendar(CalendarType type) { this.type = type; }

    public Long getId() { return id; }
    public CalendarType getType() { return type; }
}

