package tabib.dzdoctolib.controller;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tabib.dzdoctolib.dto.PatientDto;
import tabib.dzdoctolib.services.PatientService;

import java.util.List;

@RestController
@RequestMapping("/api/patients")
@RequiredArgsConstructor
public class PatientController {
    private final PatientService service;

    @GetMapping
    public List<PatientDto> getAllPatients() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public PatientDto one(@PathVariable Long id) {
        return service.findById(id);
    }

    @PostMapping
    public PatientDto save(@RequestBody PatientDto dto) {
        return service.save(dto);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}