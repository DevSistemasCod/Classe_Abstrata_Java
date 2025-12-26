import java.util.Scanner;

public class MainTarifa {
    public static void main(String[] args) {
        Scanner  lerDados = new Scanner(System.in);

        System.out.print("Informe o consumo de água (em m³): ");
        double consumoAgua = lerDados.nextDouble();

        System.out.print("Informe o consumo de energia (em kWh): ");
        double consumoLuz = lerDados.nextDouble();

        System.out.print("Informe o consumo de internet (em GB): ");
        double consumoInternet = lerDados.nextDouble();

        // Instanciando as tarifas com valor base fixo (exemplo: R$10,00)
        Tarifa agua = new TarifaAgua(10.00);
        Tarifa luz = new TarifaLuz(15.00);
        Tarifa internet = new TarifaInternet(20.00);

        System.out.println("\n=== Custos Totais ===");
        System.out.print("Água ");
        agua.exibirCusto(consumoAgua);

        System.out.print("Luz ");
        luz.exibirCusto(consumoLuz);

        System.out.print("Internet ");
        internet.exibirCusto(consumoInternet);

        lerDados.close();
    }
}
