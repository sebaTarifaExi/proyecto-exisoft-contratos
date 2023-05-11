package com.proyecto.exisoft.contratos.caseuse;

import com.proyecto.exisoft.contratos.entity.Perfil;
import com.proyecto.exisoft.contratos.service.PerfilService;
import org.springframework.stereotype.Component;

@Component
public class DeletePerfil {

    private PerfilService perfilService;

    public DeletePerfil(PerfilService perfilService) {
        this.perfilService = perfilService;
    }

    public void remove(Integer id){
        perfilService.delete(id);
    }
}
