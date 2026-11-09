package correspondances.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "line")
public class Line {

    @Id
    @Column(name = "code", length = 10, nullable = false)
    private String code;

    @Column(name = "name", nullable = false)
    private String name;

    protected Line() {
        // requis par JPA
    }

    public Line(String code, String name) {
        this.code = code;
        this.name = name;
    }

    public String getCode() { return code; }
    public String getName() { return name; }
}
