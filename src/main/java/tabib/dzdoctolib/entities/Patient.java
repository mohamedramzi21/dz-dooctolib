package tabib.dzdoctolib.entities;

import jakarta.persistence.Entity;
import lombok.*;
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
    public class Patient extends utilisateur {
        private String ville;
        private String telephone;
    }


