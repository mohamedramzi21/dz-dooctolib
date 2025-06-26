package tabib.dzdoctolib.services;

import tabib.dzdoctolib.dto.AgendaDto;

import java.util.List;

public interface AgendaService {
    List<AgendaDto> findAll();
    AgendaDto findById(Long id);
    AgendaDto save(AgendaDto dto);
    void delete(Long id);
}