package tech.satic.agriapp.service;

import org.springframework.stereotype.Service;
import tech.satic.agriapp.repository.ConducteurRepository;

@Service
public class ConducteurServiceImpl implements ConducteurService {

    private ConducteurRepository conducteurRepository;

    public ConducteurServiceImpl(ConducteurRepository conducteurRepository) {
        this.conducteurRepository = conducteurRepository;
    }
}
