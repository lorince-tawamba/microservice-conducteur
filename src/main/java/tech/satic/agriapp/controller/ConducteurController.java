package tech.satic.agriapp.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tech.satic.agriapp.dto.ConducteurRequestDTO;
import tech.satic.agriapp.dto.ConducteurResponseDTO;
import tech.satic.agriapp.service.ConducteurService;
import tech.satic.agriapp.service.ConducteurServiceImpl;

@RestController
@RequestMapping(path = "/conducteurs")
public class ConducteurController {

    private ConducteurService conducteurService;

    public ConducteurController(ConducteurService conducteurService) {
        this.conducteurService = conducteurService;
    }

    @PostMapping(path = "/add")
    public ConducteurResponseDTO addConducteur(@RequestBody ConducteurRequestDTO conducteurRequestDTO) {
        return conducteurService.addConduteur(conducteurRequestDTO);
    }
}
