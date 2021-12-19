// Package
package tech.satic.agriapp.dto;

// Librairie

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Lorince TAWAMBA
 * @version 1.0.O
 * @since 27/11/2021
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ConducteurResponseDTO {
    //private Long id;
    private String matricule;
    private String name;
    private String prenom;
    //private String cni;
    //private String tel;
    //private String adresse;
    private String email;
}
