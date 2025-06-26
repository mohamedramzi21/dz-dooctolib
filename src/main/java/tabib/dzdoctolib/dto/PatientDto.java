package tabib.dzdoctolib.dto;

import lombok.Getter;
import lombok.Setter;

@Getter@Setter
public class PatientDto {
    private Long id;
    private String nom;
    private String prenom;
    private String email;
}
