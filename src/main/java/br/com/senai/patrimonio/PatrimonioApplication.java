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
		System.out.println(endereco.getBairro());

		empresa.setEndereco(endereco);
		System.out.println(empresa.getEndereco().getRua());

		Endereco enderecoComArgumentos = new Endereco("Líbano jose gomes de criciuma",
				"489", "Perto do posto de saúde",
				"Santa luzia","Criciúma", "SC");
		System.out.println(enderecoComArgumentos.getBairro());

	}


}
