package tabib.dzdoctolib.entities;
import jakarta.persistence.Entity;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Medecin extends utilisateur {
    private String ville;
    private String adresse;
    private String specialite;
    private String numeroProfessionnel;
    private boolean valide;
}
