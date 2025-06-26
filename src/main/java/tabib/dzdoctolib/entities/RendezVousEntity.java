package tabib.dzdoctolib.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class RendezVousEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private PatientEntity patient;

    @ManyToOne
    private MedecinEntity medecin;
    private String date;
    private String heure;
    private String statut;
}
