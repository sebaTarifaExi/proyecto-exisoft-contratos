package com.proyecto.exisoft.contratos.caseuse.perfil;

import com.proyecto.exisoft.contratos.entity.Perfil;
import com.proyecto.exisoft.contratos.service.PerfilService;
import com.proyecto.exisoft.contratos.service.ProfesionalService;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class GetPerfilImplement implements GetPerfil{
    private PerfilService perfilService;

    public GetPerfilImplement(PerfilService perfilService) {
        this.perfilService = perfilService;
    }

    @Override
    public List<Perfil> getAll() {
        return perfilService.getAllPerfil();
    }
}
