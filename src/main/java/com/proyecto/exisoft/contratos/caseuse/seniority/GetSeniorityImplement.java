package com.proyecto.exisoft.contratos.caseuse.seniority;

import com.proyecto.exisoft.contratos.entity.Seniority;
import com.proyecto.exisoft.contratos.service.SenioritySevice;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class GetSeniorityImplement implements GetSeniority{

    private SenioritySevice senioritySevice;

    public GetSeniorityImplement(SenioritySevice senioritySevice) {
        this.senioritySevice = senioritySevice;
    }

    @Override
    public List<Seniority> getAll() {
        return senioritySevice.getAllSeniority();
    }
}
