/*
package tabib.dzdoctolib.services.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tabib.dzdoctolib.dto.RendezVousDto;
import tabib.dzdoctolib.mapers.RendezVousMapper;
import tabib.dzdoctolib.repositories.RendezVousRepository;
import tabib.dzdoctolib.services.RendezVousService;


import java.util.List;

@Service
@RequiredArgsConstructor
public class RendezVousServiceImpl implements RendezVousService {
    private final RendezVousRepository repository;
    private final RendezVousMapper rendezVousMapper;

    public List<RendezVousDto> findAll() {
        return repository.findAll().stream().map(rendezVousMapper::toDto).toList();
    }

    public RendezVousDto findById(Long id) {
        return rendezVousMapper.toDto(repository.findById (id).orElseThrow());
    }

    public RendezVousDto save(RendezVousDto dto) {
        return rendezVousMapper.toDto(repository.save(rendezVousMapper.toEntity(dto)));
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
*/
