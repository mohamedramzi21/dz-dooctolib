package tabib.dzdoctolib.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tabib.dzdoctolib.dto.RendezVousDto;
import tabib.dzdoctolib.dto.UtilisateurDto;
import tabib.dzdoctolib.services.UtilisateurService;

import java.util.List;

@RestController
@RequestMapping("/api/utilisateurs")
@RequiredArgsConstructor
public class UtilisateurController {
    private final UtilisateurService service;

    @GetMapping
    public List<UtilisateurDto> all() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public UtilisateurDto one(@PathVariable Long id) { return service.findById(id); }

    @PostMapping
    public UtilisateurDto save(@RequestBody UtilisateurDto dto) { return service.save(dto); }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.delete(id); }
}
