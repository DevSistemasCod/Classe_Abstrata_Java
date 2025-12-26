import java.util.Scanner;

public class TesteMainFrete {
    public static void main(String[] args) {
        Scanner lerTeclado = new Scanner(System.in);

        System.out.print("Informe a distância da entrega (em km): ");
        double distancia = lerTeclado.nextDouble();

        // Instancia os diferentes tipos de frete
        Frete[] fretes = {
            new FreteEconomico(),
            new FreteExpresso(),
            new FretePremium()
        };

        System.out.println("\n=== Cálculo dos Tipos de Frete ===");
        for (Frete frete : fretes) {
            frete.exibirInformacoes(distancia);
        }

        lerTeclado.close();
    }
}
