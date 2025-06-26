package tabib.dzdoctolib.dto;

import lombok.Getter;
import lombok.Setter;

@Getter@Setter
public class MedecinDto {
    private Long id;
    private String nom;
    private String prenom;
    private String specialite;
    private String adresse;
}
