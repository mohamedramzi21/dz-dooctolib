package tabib.dzdoctolib.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
@Getter@Setter
public class AgendaDto {
    private Long id;
    private LocalDate date;
    private Long medecinId;
}
