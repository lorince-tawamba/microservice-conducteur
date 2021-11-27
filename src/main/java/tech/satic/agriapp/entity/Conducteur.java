// Package
package tech.satic.agriapp.entity;

// Librairie

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 * @author Lorince TAWAMBA
 * @version 1.0.O
 * @since 27/11/2021
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "tb_conducteur",
        uniqueConstraints = {
                @UniqueConstraint(
                        name = "cni_number_unique",
                        columnNames = "cni"
                ),
                @UniqueConstraint(
                        name = "email_unique",
                        columnNames = "email"
                ),
                @UniqueConstraint(
                        name = "mobile_phone_number_unique",
                        columnNames = "mobile_phone_number"
                )
        }
)
public class Conducteur {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "conducteur_id")
    private Long id;

    @Column(name = "matricule", length = 30, nullable = false)
    private String matricule;

    @Column(name = "firts_name", length = 60, nullable = false)
    private String nom;

    @Column(name = "second_name", length = 60)
    private String prenom;

    @Column(name = "cni", length = 20, nullable = false)
    private String cni;

    @Column(name = "mobile_phone_number", length = 15)
    private String tel;

    @Column(name = "address", length = 30)
    private String adresse;

    @Column(name = "email", length = 30)
    private String email;

}
