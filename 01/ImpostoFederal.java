public class ImpostoFederal extends Imposto{
    public static final double TAXA_FEDERAL = 0.1; //10%
    public ImpostoFederal() {
        super(TAXA_FEDERAL);
    }

    @Override
    public double calcular(double valorBase) {
        return valorBase * this.taxa;
    }
}
