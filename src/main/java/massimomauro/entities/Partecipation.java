package massimomauro.entities;

import javax.persistence.*;

@Entity
public class Partecipation {
    @Id
    @GeneratedValue
    private long id;
    private Person person;
    @ManyToOne
    private Event event;
    private Status status;
    public Partecipation(){}

}
