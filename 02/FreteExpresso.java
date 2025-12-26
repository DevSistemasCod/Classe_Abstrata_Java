public class FreteExpresso extends Frete {
    public FreteExpresso() {
        super(3.00);
    }

    @Override
    public double calcular(double distancia) {
        return distancia * taxaPorKm;
    }
}