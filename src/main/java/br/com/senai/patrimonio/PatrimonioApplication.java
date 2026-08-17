package br.com.senai.patrimonio;

import br.com.senai.patrimonio.service.model.Empresa;
import br.com.senai.patrimonio.service.model.Endereco;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PatrimonioApplication {

	public static void main(String[] args) {
		SpringApplication.run(PatrimonioApplication.class, args);
		Empresa empresa = new Empresa();
		empresa.setRazaosocial("Senai LTDA");

		System.out.println(empresa.getRazaosocial());

		Endereco endereco = new Endereco();
		endereco.setRua("Manual Gulart");
		System.out.println(endereco.getRua());


	}


}
