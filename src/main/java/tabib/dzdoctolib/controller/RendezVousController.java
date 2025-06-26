/*
package tabib.dzdoctolib.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tabib.dzdoctolib.dto.RendezVousDto;
import tabib.dzdoctolib.services.impl.RendezVousServiceImpl;

import java.util.List;

@RestController
@RequestMapping("/api/rendezvous")
@RequiredArgsConstructor
public class RendezVousController {
    private final RendezVousServiceImpl service;

    @GetMapping
    public List<RendezVousDto> all() { return service.findAll(); }

    @GetMapping("/{id}")
    public RendezVousDto one(@PathVariable Long id) { return service.findById(id); }

    @PostMapping
    public RendezVousDto save(@RequestBody RendezVousDto dto) { return service.save(dto); }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.delete(id); }
}*/
