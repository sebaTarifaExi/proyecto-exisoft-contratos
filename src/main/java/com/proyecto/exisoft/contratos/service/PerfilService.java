package com.proyecto.exisoft.contratos.service;

import com.proyecto.exisoft.contratos.entity.Perfil;
import com.proyecto.exisoft.contratos.repository.PerfilRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PerfilService {
    private PerfilRepository perfilRepository;

    public PerfilService(PerfilRepository perfilRepository) {
        this.perfilRepository = perfilRepository;
    }

    public List<Perfil> getAllPerfil(){
        return perfilRepository.findAll();
    }

    public Perfil create(Perfil newPerfil) {
        return perfilRepository.save(newPerfil);
    }

    public void delete(Integer id) {
        perfilRepository.delete(new Perfil(id));
    }

    public Perfil update(Perfil newPerfil, Integer id) {
        return perfilRepository.findById(id)
                .map(
                        perfil -> {
                            perfil.setPilNombre(newPerfil.getPilNombre());
                            perfil.setPilValor(newPerfil.getPilValor());
                            perfil.setPilDescripcion(newPerfil.getPilDescripcion());
                            return perfilRepository.save(perfil);
                        }
                ).get();
    }
}
