package tabib.dzdoctolib.entities;

import jakarta.persistence.Entity;
import lombok.*;
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
    public class PatientEntity extends UtilisateurEntity {
        private String ville;
        private String telephone;
    }


