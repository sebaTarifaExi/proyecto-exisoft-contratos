package com.proyecto.exisoft.contratos.caseuse;

import com.proyecto.exisoft.contratos.entity.Perfil;
import com.proyecto.exisoft.contratos.service.PerfilService;

import java.util.List;

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
