package tabib.dzdoctolib.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
@Getter@Setter
public class RendezVousDto {
    private Long id;
    private LocalDateTime dateHeure;
    private Long patientId;
    private Long agendaId;
}
