public class FretePremium extends Frete {
    public FretePremium() {
        super(5.00);
    }

    @Override
    public double calcular(double distancia) {
        return distancia * taxaPorKm;
    }
}