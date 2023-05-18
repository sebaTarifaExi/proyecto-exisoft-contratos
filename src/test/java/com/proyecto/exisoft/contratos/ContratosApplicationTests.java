package com.proyecto.exisoft.contratos;

import com.proyecto.exisoft.contratos.caseuse.seniority.UpdateSeniority;
import com.proyecto.exisoft.contratos.entity.Seniority;
import com.proyecto.exisoft.contratos.repository.SeniorityRepository;
import com.proyecto.exisoft.contratos.service.SenioritySevice;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ContratosApplicationTests {

	@Test
	void contextLoads() {
	}

	/*@Test
	public void queSePuedaHacerUnUpdateDeUnTipoContratacion(){
		Seniority seniority = new Seniority(4,"SSR", "Semi Senior");
		Seniority seniority1 = new Seniority(5,"SSR", "Semi Senior");
		UpdateSeniority updateSeniority = new UpdateSeniority(new SenioritySevice());


		updateSeniority.update(seniority,4);
	}*/

}
