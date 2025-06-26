package tabib.dzdoctolib.entities;
import jakarta.persistence.Entity;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class MedecinEntity extends UtilisateurEntity {
    private String ville;
    private String adresse;
    private String specialite;
    private String numeroProfessionnel;
    private boolean valide;
}
