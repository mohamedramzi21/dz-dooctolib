package tabib.dzdoctolib.repositories;
import tabib.dzdoctolib.entities.Agenda;
import org.springframework.data.jpa.repository.JpaRepository;
public interface AgendaRepository extends JpaRepository<Agenda,Long> {
}
