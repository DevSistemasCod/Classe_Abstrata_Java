public class Livro extends Produto {
    private String tema;
    private String nomeAutor;
    private String editora;

    public Livro(String nome, double precoUnitario, int quantidade,
                 String tema, String nomeAutor, String editora) {
        super(nome, precoUnitario, quantidade);
        this.tema = tema;
        this.nomeAutor = nomeAutor;
        this.editora = editora;
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("=== Livro ===");
        super.exibirInformacoes();
        System.out.println("Tema: " + tema);
        System.out.println("Autor: " + nomeAutor);
        System.out.println("Editora: " + editora);
        System.out.println("Preço Total (acréscimo fixo de R$10): R$ " + calcularPrecoTotal());
        System.out.println();
    }

    @Override
    public double calcularPrecoTotal() {
        double subtotal = precoUnitario * quantidade;
        return subtotal + 10.0; // acréscimo fixo de R$10
    }
}
