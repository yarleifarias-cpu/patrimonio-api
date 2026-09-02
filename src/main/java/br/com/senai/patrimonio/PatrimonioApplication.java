package br.com.senai.patrimonio;

import br.com.senai.patrimonio.avaliacao.Participante;
import br.com.senai.patrimonio.avaliacao.enums.Nivel;
import br.com.senai.patrimonio.model.Empresa;
import br.com.senai.patrimonio.model.Endereco;
import br.com.senai.patrimonio.model.Fucionario;
import br.com.senai.patrimonio.model.Sala;
import br.com.senai.patrimonio.model.enums.Cargo;
import br.com.senai.patrimonio.model.enums.Pagamento;
import br.com.senai.patrimonio.model.enums.PagamentoComposto;
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
Sala sala = new Sala();

		Fucionario fucionario = new Fucionario(
				35L,"João", "123456789",
				Cargo.GERENTE, empresa, sala
		);

		System.out.println(fucionario.getCpf());
		System.out.println(Pagamento.PIX);
		System.out.println(PagamentoComposto.PIX.getDescricao());
		System.out.println(PagamentoComposto.PIX);
		System.out.println(PagamentoComposto.PIX.getSituacao());
		System.out.println(PagamentoComposto.CARTAO_CREDITO.getSituacao());
		System.out.println(PagamentoComposto.CARTAO_CREDITO.getDescricao());


	}
	Participante participante = new Participante("ana", "ana@gmail.com","4002-8922","P002", Nivel.INTERMEDIARIO);


}
