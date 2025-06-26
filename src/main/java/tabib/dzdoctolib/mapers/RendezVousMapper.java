package tabib.dzdoctolib.mapers;
import org.mapstruct.Mapping;
import tabib.dzdoctolib.dto.RendezVousDto;
import tabib.dzdoctolib.entities.RendezVousEntity;

@Mapper(componentModel = "spring")
public interface RendezVousMapper {
    @Mapping(target = "patientId", source = "patient.id")
    @Mapping(target = "agendaId", source = "agenda.id")
    RendezVousDto toDto(RendezVousEntity rv);

    @Mapping(target = "patient.id", source = "patientId")
    @Mapping(target = "agenda.id", source = "agendaId")
    RendezVousEntity toEntity(RendezVousDto dto);
}
