public abstract class Imposto {
    protected double taxa;

    public Imposto(double taxa) {
        this.taxa = taxa;
    }

    public abstract double calcular(double valorBase);


    public void exibirInformacoes(double valorBase) {
        double valorImposto = calcular(valorBase);
        double valorCobrado = this.taxa * 100;

        System.out.printf("Taxa: %.2f%%\n", valorCobrado);
        System.out.printf("Valor cobrado será de: R$ %.2f\n", valorImposto);
    }
}
