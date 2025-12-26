public abstract class Tarifa {
    protected double valorBase;

    public Tarifa(double valorBase) {
        this.valorBase = valorBase;
    }

    // método concreto - método tradicional
    public void exibirCusto(double consumo) {
        double total = calcular(consumo);
        System.out.printf("Valor base: R$ %.2f | Consumo: %.2f | Custo total: R$ %.2f%n",
                valorBase, consumo, total);
    }

    // método abstrato
    public abstract double calcular(double consumo);
}
