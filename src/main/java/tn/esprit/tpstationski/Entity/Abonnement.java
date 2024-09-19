package tn.esprit.tpstationski.Entity;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Setter
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Abonnement implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long numAbon;
    private LocalDate datedebut;
    private LocalDate datefin;
    private float prixAbon;


    @Enumerated(EnumType.STRING)
    private TypeAbonment typeAbon;
}
