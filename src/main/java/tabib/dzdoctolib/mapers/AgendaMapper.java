/*
package tabib.dzdoctolib.mapers;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import tabib.dzdoctolib.dto.AgendaDto;
import tabib.dzdoctolib.entities.AgendaEntity;
import tabib.dzdoctolib.entities.MedecinEntity;
@Mapper(componentModel = "spring")
public interface AgendaMapper {

    @Mapping(target = "medecinId", source = "medecin.id")
    AgendaDto toDto(AgendaEntity agenda);

    @Mapping(target = "medecin", source = "medecinId")
    AgendaEntity toEntity(AgendaDto dto);

    // Cette méthode est utilisée par MapStruct automatiquement
    default MedecinEntity mapMedecin(Long id) {
        if (id == null) return null;
        MedecinEntity medecin = new MedecinEntity();
        medecin.setId(id); // hérité de UtilisateurEntity
        return medecin;
    }
}
*/
