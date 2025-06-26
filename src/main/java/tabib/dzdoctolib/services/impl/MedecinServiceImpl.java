package tabib.dzdoctolib.services.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tabib.dzdoctolib.dto.MedecinDto;
import tabib.dzdoctolib.mapers.MedecinMapper;
import tabib.dzdoctolib.repositories.MedecinRepository;
import tabib.dzdoctolib.services.MedecinService;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MedecinServiceImpl implements MedecinService {
    private final MedecinRepository repository;
    private final MedecinMapper medecinMapper;

    public List<MedecinDto> findAll() {
        return medecinMapper.toDtoList(repository.findAll());
    }

    public MedecinDto findById(Long id) {
        return medecinMapper.toDto(repository.findById(id).orElseThrow());
    }

    public MedecinDto save(MedecinDto dto) {
        return medecinMapper.toDto(repository.save(medecinMapper.toEntity(dto)));
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
