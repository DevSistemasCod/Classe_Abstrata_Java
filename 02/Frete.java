public abstract class Frete {
    protected double taxaPorKm;

    // Construtor
    public Frete(double taxaPorKm) {
        this.taxaPorKm = taxaPorKm;
    }

    // Método concreto
    public void exibirInformacoes(double distancia) {
        double taxaPorKilometro = taxaPorKm; // atributo da classe
        double distanciaPercorrida = distancia;
        double valorBase = taxaPorKilometro * distanciaPercorrida;
        double valorTotal = calcular(distanciaPercorrida);

        // 5. Exibe todas as informações de forma organizada
        System.out.println("=== Informações da Viagem ===");
        System.out.println("Taxa por Km: R$ " + String.format("%.2f", taxaPorKilometro));
        System.out.println("Distância percorrida: " + String.format("%.2f", distanciaPercorrida) + " km");
        System.out.println("Valor base (taxa * distância): R$ " + String.format("%.2f", valorBase));
        System.out.println("=============================\n");
    }


    // Método abstrato
    public abstract double calcular(double distancia);
}