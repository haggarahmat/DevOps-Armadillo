package tn.esprit.tpstationski.Entity;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;

@Entity
@Setter
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Cours implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long numCours;
    private int niveau;
    //private TypeCours typecours;
   // private Support support;
    private Float prix;
    private int creneau;
    @Enumerated(EnumType.STRING)
    private Support support;
    @Enumerated(EnumType.STRING)
    private TypeCours typecours;


}
