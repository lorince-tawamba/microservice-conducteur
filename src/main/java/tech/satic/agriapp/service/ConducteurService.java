package tech.satic.agriapp.service;

import tech.satic.agriapp.dto.ConducteurRequestDTO;
import tech.satic.agriapp.dto.ConducteurResponseDTO;

public interface ConducteurService {

    public ConducteurResponseDTO addConduteur(ConducteurRequestDTO conducteurRequestDTO);
}
