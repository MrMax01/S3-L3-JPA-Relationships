package massimomauro.entities;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Set;

@Entity
@Table(name="person")
public class Person {
    @Id
    @GeneratedValue
    private long id;
    private String name;
    private String surname;
    private String email;
    private LocalDate birthday;
    private Sesso sesso;
    private Set<Partecipation> partecipationList;
}
