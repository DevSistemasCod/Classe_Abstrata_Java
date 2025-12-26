public class TarifaAgua extends Tarifa {
    private static final double VALOR_POR_M3 = 2.50;

    public TarifaAgua(double valorBase) {
        super(valorBase);
    }

    @Override
    public double calcular(double consumo) {
        return valorBase + (consumo * VALOR_POR_M3);
    }
}