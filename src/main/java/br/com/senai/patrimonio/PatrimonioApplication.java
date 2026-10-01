package br.com.senai.patrimonio;

import br.com.senai.patrimonio.avaliacao.Participante;
import br.com.senai.patrimonio.avaliacao.enums.Nivel;
import br.com.senai.patrimonio.model.*;
import br.com.senai.patrimonio.model.enums.Cargo;
import br.com.senai.patrimonio.model.enums.EstadoConservacao;
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

		Funcionario funcionario = new Funcionario(
				35L,"João", "123456789",
				Cargo.GERENTE, empresa, sala
		);

		System.out.println(funcionario.getCpf());
		System.out.println(Pagamento.PIX);
		System.out.println(PagamentoComposto.PIX.getDescricao());
		System.out.println(PagamentoComposto.PIX);
		System.out.println(PagamentoComposto.PIX.getSituacao());
		System.out.println(PagamentoComposto.CARTAO_CREDITO.getSituacao());
		System.out.println(PagamentoComposto.CARTAO_CREDITO.getDescricao());

		Participante participante =
				new Participante("Ana",
						"ana@gamil.com",
						"4002-8922",
						"P1900",
						Nivel.INICIANTE);

		Empresa empresaInterface = new Empresa();

		Bloco blocoInterface =new Bloco(1l,"Bloco 2", empresaInterface);

		Sala salaInterface = new Sala(2l,"Lab 2 ", "45678",
				blocoInterface, empresaInterface);


		System.out.println(salaInterface.getDescricaoLocalizavel());

		Patrimonio patrimonioInterface = new Patrimonio();
		System.out.println(patrimonioInterface.validarEstadoConservacao());

		patrimonioInterface.setEstado(EstadoConservacao.INCERVIVEL);
		System.out.println(patrimonioInterface.validarEstadoConservacao());

		Funcionario funcionario1 = new Funcionario();
		System.out.println(funcionario1.getEmpresaVinculada());
Bem bem = new Bem();
		System.out.println(bem.getEmpresaVinculada());

		Empresa empresa1 = new Empresa();
		System.out.println(bem.getEmpresaVinculada());

		empresa1.setNome("Senai");
		bem.setEmpresa(empresa1);
		System.out.println(bem.getEmpresaVinculada());

		Bloco bloco = new Bloco();
		System.out.println(bloco.getEmpresaVinculada());

		empresa1.setNome("Tesla");
		bloco.setEmpresa(empresa1);
		System.out.println(bloco.getEmpresaVinculada());

		Funcionario funcionario2 = new Funcionario();
		System.out.println(funcionario2.getEmpresaVinculada());
		empresa1.setNome("Bauduco");
		funcionario2.setEmpresa(empresa1);
		System.out.println(funcionario2.getEmpresaVinculada());

		Sala sala1 = new Sala();
		System.out.println(sala1.getEmpresaVinculada());

		empresa1.setNome("Meta");
		sala1.setEmpresa(empresa1);
		System.out.println(sala1.getEmpresaVinculada());

		Pessoa pessoa = new Pessoa();

		pessoa.setNome("João");
		pessoa.setCpf("87654321");

		funcionario2.setNome("Joao");
		funcionario2.setCpf("12345678");
funcionario2.setCargo(Cargo.ANALISTA);
		System.out.println(funcionario2.getIdentificacao());
	}
	
}
