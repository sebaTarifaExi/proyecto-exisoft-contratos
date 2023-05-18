package com.proyecto.exisoft.contratos.caseuse.perfil;

import com.proyecto.exisoft.contratos.service.PerfilService;
import org.springframework.stereotype.Component;

@Component
public class DeletePerfil {
    private PerfilService perfilService;

    public DeletePerfil(PerfilService perfilService) {
        this.perfilService = perfilService;
    }

    public void delete(Integer id){perfilService.delete(id);}
}
