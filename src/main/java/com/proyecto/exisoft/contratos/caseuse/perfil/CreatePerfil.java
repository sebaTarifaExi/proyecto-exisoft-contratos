package com.proyecto.exisoft.contratos.caseuse.perfil;

import com.proyecto.exisoft.contratos.entity.Perfil;
import com.proyecto.exisoft.contratos.service.PerfilService;
import org.springframework.stereotype.Component;

@Component
public class CreatePerfil {
    private PerfilService perfilService;

    public CreatePerfil(PerfilService perfilService) {
        this.perfilService = perfilService;
    }

    public Perfil create(Perfil newPerfil){
        return perfilService.create(newPerfil);
    }
}
