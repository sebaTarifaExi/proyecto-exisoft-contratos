package com.proyecto.exisoft.contratos.caseuse.seniority;

import com.proyecto.exisoft.contratos.entity.Seniority;
import com.proyecto.exisoft.contratos.service.SenioritySevice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DeleteSeniority {
    private SenioritySevice senioritySevice;
    @Autowired
    public DeleteSeniority(SenioritySevice senioritySevice) {
        this.senioritySevice = senioritySevice;
    }

    public void delete(Integer id){
        senioritySevice.delete(id);
    }
}
