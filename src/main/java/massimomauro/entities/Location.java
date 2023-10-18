package massimomauro.entities;

import javax.persistence.*;

@Entity
public class Location {
    @Id
    @GeneratedValue
    private long id;

    private String name;
    private String city;
    public Location(){};
}
