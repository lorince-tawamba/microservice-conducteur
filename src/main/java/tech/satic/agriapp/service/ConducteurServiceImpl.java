package tech.satic.agriapp.service;

import org.springframework.stereotype.Service;
import tech.satic.agriapp.dto.ConducteurRequestDTO;
import tech.satic.agriapp.dto.ConducteurResponseDTO;
import tech.satic.agriapp.entity.Conducteur;
import tech.satic.agriapp.mappers.ConducteurMapper;
import tech.satic.agriapp.repository.ConducteurRepository;

@Service
public class ConducteurServiceImpl implements ConducteurService {

    private ConducteurRepository conducteurRepository;
    private ConducteurMapper conducteurMapper;

    public ConducteurServiceImpl(ConducteurRepository conducteurRepository) {
        this.conducteurRepository = conducteurRepository;
    }

    public ConducteurResponseDTO addConduteur(ConducteurRequestDTO conducteurRequestDTO) {
        Conducteur conducteur = conducteurMapper.conducteurRequestDTOConducteur(conducteurRequestDTO);
        return conducteurMapper.conducteurToConducteurResponseDTO(conducteurRepository.save(conducteur));
    }
}
