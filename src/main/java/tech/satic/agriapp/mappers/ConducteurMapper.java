// Package
package tech.satic.agriapp.mappers;

import tech.satic.agriapp.dto.ConducteurRequestDTO;
import tech.satic.agriapp.dto.ConducteurResponseDTO;
import tech.satic.agriapp.entity.Conducteur;

/**
 * @author Lorince TAWAMBA
 * @version 1.0.O
 * @since 27/11/2021
 */
public interface ConducteurMapper {
    ConducteurResponseDTO conducteurToConducteurResponseDTO(Conducteur conducteur);
    Conducteur conducteurRequestDTOConducteur(ConducteurRequestDTO conducteurRequestDTO);
}
