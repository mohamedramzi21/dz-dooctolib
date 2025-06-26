package tabib.dzdoctolib.mapers;
import org.mapstruct.Mapper;
import tabib.dzdoctolib.dto.UtilisateurDto;
import tabib.dzdoctolib.entities.UtilisateurEntity;

@Mapper(componentModel = "spring")
public interface UtilisateurMapper {
    UtilisateurDto toDto(UtilisateurEntity u);
    UtilisateurEntity toEntity(UtilisateurDto dto);
}
