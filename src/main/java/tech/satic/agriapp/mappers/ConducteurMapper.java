// Package
package tech.satic.agriapp.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;
import tech.satic.agriapp.dto.ConducteurRequestDTO;
import tech.satic.agriapp.dto.ConducteurResponseDTO;
import tech.satic.agriapp.entity.Conducteur;

/**
 * @author Lorince TAWAMBA
 * @version 1.0.O
 * @since 27/11/2021
 */
@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface ConducteurMapper {

    ConducteurMapper INSTANCE = Mappers.getMapper(ConducteurMapper.class);

    @Mapping(source = "nom", target = "name")
    ConducteurResponseDTO conducteurToConducteurResponseDTO(Conducteur conducteur);

    Conducteur conducteurRequestDTOConducteur(ConducteurRequestDTO conducteurRequestDTO);
}
