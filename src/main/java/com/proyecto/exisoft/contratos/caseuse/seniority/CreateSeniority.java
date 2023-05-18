package com.proyecto.exisoft.contratos.caseuse.seniority;

import com.proyecto.exisoft.contratos.entity.Seniority;
import com.proyecto.exisoft.contratos.service.SenioritySevice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CreateSeniority {
    private SenioritySevice senioritySevice;
    @Autowired
    public CreateSeniority(SenioritySevice senioritySevice) {
        this.senioritySevice = senioritySevice;
    }

    public Seniority create(Seniority newSeniority){
        return senioritySevice.create(newSeniority);
    }
}
