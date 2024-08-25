package es.com.suelengalhardo.talent_acq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@SpringBootApplication
@OpenAPIDefinition( info = @Info( title="talend acq", description ="Api responsable por la gestion de ofertas de empleo"))
public class TalentAcqApplication {

	public static void main(String[] args) {
		SpringApplication.run(TalentAcqApplication.class, args);
	}

}
