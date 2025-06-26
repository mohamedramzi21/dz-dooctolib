package tabib.dzdoctolib.mapers;

import org.mapstruct.Mapper;

import tabib.dzdoctolib.dto.PatientDto;
import tabib.dzdoctolib.entities.PatientEntity;

import java.util.List;

@Mapper(componentModel = "spring")
public interface PatientMapper {
    PatientDto toDto(PatientEntity p);
    PatientEntity toEntity(PatientDto dto);
    List<PatientDto> toDtoList(List<PatientEntity> list);
}