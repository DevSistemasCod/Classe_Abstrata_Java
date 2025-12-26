public class ImpostoMunicipal extends Imposto{

    public static final double TAXA_MUNICIPAL = 0.03; //3%
    public ImpostoMunicipal() {
        super(TAXA_MUNICIPAL);
    }

    @Override
    public double calcular(double valorBase) {
        return valorBase * this.taxa;
    }
}