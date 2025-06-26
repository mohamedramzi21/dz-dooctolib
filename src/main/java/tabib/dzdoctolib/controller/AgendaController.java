/*
package tabib.dzdoctolib.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tabib.dzdoctolib.dto.AgendaDto;
import tabib.dzdoctolib.services.AgendaService;

import java.util.List;

@RestController
@RequestMapping("/api/agendas")
@RequiredArgsConstructor
public class AgendaController {
    private final AgendaService service;

    @GetMapping
    public List<AgendaDto> all() { return service.findAll(); }

    @GetMapping("/{id}")
    public AgendaDto one(@PathVariable Long id) { return service.findById(id); }

    @PostMapping
    public AgendaDto save(@RequestBody AgendaDto dto) { return service.save(dto); }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.delete(id); }
}*/
