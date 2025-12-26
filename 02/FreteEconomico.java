public class FreteEconomico extends Frete {
    public FreteEconomico() {
        super(1.50);
    }

    @Override
    public double calcular(double distancia) {
        return distancia * taxaPorKm;
    }
}
