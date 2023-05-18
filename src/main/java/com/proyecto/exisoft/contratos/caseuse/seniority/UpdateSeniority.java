package com.proyecto.exisoft.contratos.caseuse.seniority;

import com.proyecto.exisoft.contratos.entity.Seniority;
import com.proyecto.exisoft.contratos.service.SenioritySevice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UpdateSeniority {
    private SenioritySevice senioritySevice;
    @Autowired
    public UpdateSeniority(SenioritySevice senioritySevice) {
        this.senioritySevice = senioritySevice;
    }

    public Seniority update(Seniority newSeniority, Integer id){
        return senioritySevice.update(newSeniority,id);
    }
}
