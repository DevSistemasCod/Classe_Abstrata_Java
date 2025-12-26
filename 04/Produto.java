// Classe abstrata Produto
public abstract class Produto {
    protected String nome;
    protected double precoUnitario;
    protected int quantidade;

    public Produto(String nome, double precoUnitario, int quantidade) {
        this.nome = nome;
        this.precoUnitario = precoUnitario;
        this.quantidade = quantidade;
    }

    // Método concreto
    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Preço Unitário: R$ " + precoUnitario);
        System.out.println("Quantidade: " + quantidade);
    }

    // Método abstrato — deve ser implementado nas subclasses
    public abstract double calcularPrecoTotal();
}
