public class Caderno extends Produto {
    private String identificacao;
    private int numeroPaginas;
    private String fabricante;

    public Caderno(String nome, double precoUnitario, int quantidade,
                   String identificacao, int numeroPaginas, String fabricante) {
        super(nome, precoUnitario, quantidade);
        this.identificacao = identificacao;
        this.numeroPaginas = numeroPaginas;
        this.fabricante = fabricante;
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("=== Caderno ===");
        super.exibirInformacoes();
        System.out.println("Identificação: " + identificacao);
        System.out.println("Número de Páginas: " + numeroPaginas);
        System.out.println("Fabricante: " + fabricante);
        System.out.println("Preço Total (com imposto): R$ " + calcularPrecoTotal());
        System.out.println();
    }

    @Override
    public double calcularPrecoTotal() {
        double subtotal = precoUnitario * quantidade;
        double imposto = subtotal * 0.11; // 11% de imposto
        return subtotal + imposto;
    }
}
