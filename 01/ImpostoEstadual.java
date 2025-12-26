public class ImpostoEstadual extends Imposto {
    public static final double TAXA_ESTADUAL = 0.07; //7%
    public ImpostoEstadual() {
        super(TAXA_ESTADUAL);
    }

    @Override
    public double calcular(double valorBase) {
        return valorBase * this.taxa;
    }
}