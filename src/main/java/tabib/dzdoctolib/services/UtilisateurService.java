package tabib.dzdoctolib.services;

import tabib.dzdoctolib.dto.RendezVousDto;
import tabib.dzdoctolib.dto.UtilisateurDto;

import java.util.List;

public interface UtilisateurService {
        List<UtilisateurDto> findAll();
        UtilisateurDto findById(Long id);
        UtilisateurDto save(UtilisateurDto dto);
        void delete(Long id);
    }
