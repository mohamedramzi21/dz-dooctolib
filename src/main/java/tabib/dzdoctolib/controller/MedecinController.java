package tabib.dzdoctolib.controller;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tabib.dzdoctolib.dto.MedecinDto;
import tabib.dzdoctolib.services.MedecinService;


import java.util.List;

@RestController
@RequestMapping("/api/medecins")
@RequiredArgsConstructor
public class MedecinController {
    private final MedecinService service;

    @GetMapping
    public List<MedecinDto> getAllMedecins() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public MedecinDto FindOne(@PathVariable Long id) {
        return service.findById(id);
    }

    @PostMapping
    public MedecinDto save(@RequestBody MedecinDto dto) {
        return service.save(dto);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}
