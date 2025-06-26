/*
package tabib.dzdoctolib.services.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tabib.dzdoctolib.dto.AgendaDto;
import tabib.dzdoctolib.mapers.AgendaMapper;
import tabib.dzdoctolib.repositories.AgendaRepository;
import tabib.dzdoctolib.services.AgendaService;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AgendaServiceImpl implements AgendaService {
    private final AgendaRepository repository;
    private final AgendaMapper agendaMapper;

    public List<AgendaDto> findAll() {
        return repository.findAll().stream().map(agendaMapper::toDto).toList();
    }

    public AgendaDto findById(Long id) {
        return agendaMapper.toDto(repository.findById(id).orElseThrow());
    }

    public AgendaDto save(AgendaDto dto) {
        return agendaMapper.toDto(repository.save(agendaMapper.toEntity(dto)));
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}*/
