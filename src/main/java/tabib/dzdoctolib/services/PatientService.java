package tabib.dzdoctolib.services;

import tabib.dzdoctolib.dto.PatientDto;

import java.util.List;

public interface PatientService {
    List<PatientDto> findAll();
    PatientDto findById(Long id);
    PatientDto save(PatientDto dto);
    void delete(Long id);
}


