public class TarifaLuz extends Tarifa {
    private static final double VALOR_POR_KWH = 0.75;

    public TarifaLuz(double valorBase) {
        super(valorBase);
    }

    @Override
    public double calcular(double consumo) {
        return valorBase + (consumo * VALOR_POR_KWH);
    }
}
