package tech.satic.agriapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tech.satic.agriapp.dto.ConducteurRequestDTO;
import tech.satic.agriapp.dto.ConducteurResponseDTO;
import tech.satic.agriapp.entity.Conducteur;
import tech.satic.agriapp.mappers.ConducteurMapper;
import tech.satic.agriapp.repository.ConducteurRepository;

import javax.persistence.Table;
import javax.transaction.Transactional;

@Service
@Transactional
public class ConducteurServiceImpl implements ConducteurService {

    private ConducteurRepository conducteurRepository;

    public ConducteurServiceImpl(ConducteurRepository conducteurRepository) {
        this.conducteurRepository = conducteurRepository;
    }

    public ConducteurResponseDTO addConduteur(ConducteurRequestDTO conducteurRequestDTO) {
        Conducteur conducteur = ConducteurMapper.INSTANCE.conducteurRequestDTOConducteur(conducteurRequestDTO);
        return ConducteurMapper.INSTANCE.conducteurToConducteurResponseDTO(conducteurRepository.save(conducteur));
    }
}
