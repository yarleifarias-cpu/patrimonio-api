package br.com.senai.patrimonio;
import br.com.senai.patrimonio.atividades.Computador;
import br.com.senai.patrimonio.atividades.Equipamento;
import br.com.senai.patrimonio.atividades.Veiculo;

public class PatrimonioApiApplication {

    public static void main(String[] args) {
        Equipamento equipamento = new Equipamento("Celular", 100.00);
        Equipamento computador = new Computador("Acer 5", 2500.00);
        Equipamento veiculo = new Veiculo("Onix",50000.00);
        // TODO 2: Chamar o método exibirRelatorio(...) repassando cada um dos 3 objetos criados
exibirRelatorio(equipamento);
exibirRelatorio(computador);
exibirRelatorio(veiculo);
    }

    // Método auxiliar que demonstra o polimorfismo via parâmetro
    public static void exibirRelatorio(Equipamento item) {
        System.out.println("Item: " + item.getNome());
        System.out.println("Valor Inicial: R$ " + item.getValorInicial());

        // TODO 3: Imprimir o valor da depreciação chamando o método calcularDepreciacao() do 'item'

        System.out.println("Depreciação: " +item.calcularDepreciacao());
    }
}
