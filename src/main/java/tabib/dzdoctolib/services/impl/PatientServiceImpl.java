package tabib.dzdoctolib.services.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tabib.dzdoctolib.dto.PatientDto;
import tabib.dzdoctolib.mapers.PatientMapper;
import tabib.dzdoctolib.repositories.PatientRepository;
import tabib.dzdoctolib.services.PatientService;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PatientServiceImpl implements PatientService {
    private final PatientRepository repository;
    private final PatientMapper patientMapper;

    public List<PatientDto> findAll() {
        return patientMapper.toDtoList(repository.findAll());
    }

    public PatientDto findById(Long id) {
        return patientMapper.toDto(repository.findById(id).orElseThrow());
    }

    public PatientDto save(PatientDto dto) {
        return patientMapper.toDto(repository.save(patientMapper.toEntity(dto)));
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}