package tn.esprit.tpstationski.Entity;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode

public class Piste implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long numPiste;
    private String nomPiste;
    private Couleur couleur;
    private int Longueur;
    private int pente;

    @Enumerated(EnumType.STRING)
    private Couleur clr;



}
