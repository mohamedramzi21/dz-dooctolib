package tabib.dzdoctolib.repositories;
import tabib.dzdoctolib.entities.PatientEntity;
import org.springframework.data.jpa.repository.JpaRepository;
public interface PatientRepository extends JpaRepository<PatientEntity,Long> {
}
