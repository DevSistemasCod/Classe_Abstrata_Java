public class TarifaInternet extends Tarifa {
    private static final double VALOR_POR_GB = 1.20;

    public TarifaInternet(double valorBase) {
        super(valorBase);
    }

    @Override
    public double calcular(double consumo) {
        return valorBase + (consumo * VALOR_POR_GB);
    }
}
