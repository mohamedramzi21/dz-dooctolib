package tabib.dzdoctolib.services;

import tabib.dzdoctolib.dto.MedecinDto;

import java.util.List;

public interface MedecinService {
    List<MedecinDto> findAll();
    MedecinDto findById(Long id);
    MedecinDto save(MedecinDto dto);
    void delete(Long id);
}