package tabib.dzdoctolib.services.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tabib.dzdoctolib.dto.UtilisateurDto;
import tabib.dzdoctolib.mapers.UtilisateurMapper;
import tabib.dzdoctolib.repositories.UtilisateurRepository;
import tabib.dzdoctolib.services.UtilisateurService;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UtilisateurServiceImpl implements UtilisateurService {
    private final UtilisateurRepository repository;
    private final UtilisateurMapper utilisateurMapper;

    public List<UtilisateurDto> findAll() {
        return repository.findAll().stream().map(utilisateurMapper::toDto).toList();
    }

    public UtilisateurDto findById(Long id) {
        return utilisateurMapper.toDto(repository.findById(id).orElseThrow());
    }

    public UtilisateurDto save(UtilisateurDto dto) {
        return utilisateurMapper.toDto(repository.save(utilisateurMapper.toEntity(dto)));
    }

    @Override
    public void delete(Long id) {

    }
}
