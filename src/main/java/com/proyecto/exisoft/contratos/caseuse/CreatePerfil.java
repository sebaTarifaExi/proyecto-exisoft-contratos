package com.proyecto.exisoft.contratos.caseuse;

import com.proyecto.exisoft.contratos.entity.Perfil;
import com.proyecto.exisoft.contratos.service.PerfilService;
import com.proyecto.exisoft.contratos.service.ProfesionalService;
import org.springframework.stereotype.Component;

@Component
public class CreatePerfil {

    private PerfilService perfilService;

    public CreatePerfil(PerfilService perfilService) {
        this.perfilService = perfilService;
    }

    public Perfil create(Perfil newPerfil){
        return perfilService.save(newPerfil);
    }
}
