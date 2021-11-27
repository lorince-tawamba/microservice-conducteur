// Package
package tech.satic.agriapp.dto;

// Librairie

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author Lorince TAWAMBA
 * @version 1.0.O
 * @since 27/11/2021
 */
public class ConducteurRequestDTO {
    private Long id;
    private String matricule;
    private String nom;
    private String prenom;
    private String cni;
    private String tel;
    private String adresse;
    private String email;
}
