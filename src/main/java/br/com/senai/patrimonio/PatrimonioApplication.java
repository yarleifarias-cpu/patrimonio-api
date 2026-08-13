package br.com.senai.patrimonio;

import br.com.senai.patrimonio.model.Empresa;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PatrimonioApplication {

	public static void main(String[] args) {
		SpringApplication.run(PatrimonioApplication.class, args);
		Empresa empresa = new Empresa();
		empresa.setRazaosocial("Senai LTDA");
		System.out.println(empresa.getRazaosocial());
	}


}
