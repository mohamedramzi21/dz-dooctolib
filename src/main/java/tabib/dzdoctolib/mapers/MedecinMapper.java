package tabib.dzdoctolib.mapers;

import org.mapstruct.Builder;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import tabib.dzdoctolib.dto.MedecinDto;
import tabib.dzdoctolib.entities.MedecinEntity;

import java.util.List;

@Mapper(componentModel = "spring", builder = @Builder(disableBuilder = true))
public interface MedecinMapper {

    @Mappings({
            @Mapping(source = "id", target = "id"),
            @Mapping(source = "nom", target = "nom"),
            @Mapping(source = "prenom", target = "prenom"),
            @Mapping(source = "specialite", target = "specialite"),
            @Mapping(source = "adresse", target = "adresse")
            // ville, email, motdepasse, numeroProfessionnel, role, valide ne sont pas dans le DTO → ignorés automatiquement
    })
    MedecinEntity toEntity(MedecinDto dto);

    @Mappings({
            @Mapping(source = "id", target = "id"),
            @Mapping(source = "nom", target = "nom"),
            @Mapping(source = "prenom", target = "prenom"),
            @Mapping(source = "specialite", target = "specialite"),
            @Mapping(source = "adresse", target = "adresse")
    })
    MedecinDto toDto(MedecinEntity entity);

    List<MedecinDto> toDtoList(List<MedecinEntity> list);
}


