package tabib.dzdoctolib.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Getter @Setter @NoArgsConstructor @AllArgsConstructor @ToString @Builder
public class UtilisateurEntity {
    @Id @GeneratedValue(strategy= GenerationType.IDENTITY)
   private Long id;
   private String nom;
   private  String prenom;
   private String email;
   private String motdepasse;
   private String role;
}
