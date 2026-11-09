package correspondances.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "train")
public class Train {

    @Id
    @Column(name = "number", nullable = false)
    private Integer number;

    protected Train() {
        // requis par JPA
    }

    public Train(Integer number) {
        this.number = number;
    }

    public Integer getNumber() { return number; }
}
