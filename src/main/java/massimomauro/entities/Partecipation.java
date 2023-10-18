package massimomauro.entities;

import javax.persistence.*;

@Entity
public class Partecipation {
    @Id
    @GeneratedValue
    private long id;
    private Person person;
    private Event event;
    private Status status;

}
