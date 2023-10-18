package massimomauro;

import massimomauro.entities.EventDAO;
import massimomauro.entities.EventType;
import massimomauro.entities.Event;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.time.LocalDate;

import static massimomauro.entities.EventType.PRIVATO;

public class Application {

    private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("gestioneventi");
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        EntityManager em = emf.createEntityManager();
        EventDAO sd = new EventDAO(em);

        Event ev1 = new Event("ev", today, "ciao", PRIVATO, 50  );

        sd.save(ev1);
        sd.delete(14);
        System.out.println(sd.findById(15));

        System.out.println("Hello World!");
        em.close();
        emf.close();
    }
}
