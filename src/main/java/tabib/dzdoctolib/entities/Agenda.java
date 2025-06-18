package tabib.dzdoctolib.entities;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalTime;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Agenda {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String jour;
    private LocalTime heureDebut;
    private LocalTime heureFin;
    private int dureeCreneau;

    @ManyToOne
    private Medecin medecin;
}
