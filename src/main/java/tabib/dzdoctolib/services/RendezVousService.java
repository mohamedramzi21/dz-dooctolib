package tabib.dzdoctolib.services;
import tabib.dzdoctolib.dto.RendezVousDto;
import java.util.List;

public interface RendezVousService {
    List<RendezVousDto> findAll();
    RendezVousDto findById(Long id);
    RendezVousDto save(RendezVousDto dto);
    void delete(Long id);
}
