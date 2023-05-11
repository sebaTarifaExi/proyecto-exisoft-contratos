package com.proyecto.exisoft.contratos.caseuse;

import com.proyecto.exisoft.contratos.entity.Perfil;
import com.proyecto.exisoft.contratos.service.PerfilService;
import org.springframework.stereotype.Component;

@Component
public class UpdatePerfil {

    private PerfilService perfilService;

    public UpdatePerfil(PerfilService perfilService) {
        this.perfilService = perfilService;
    }

    public Perfil update(Perfil newPerfil,Integer id){
        return perfilService.update(newPerfil, id);
    }
}
