public class Principal {
    public static void main(String[] args) {
        Produto caderno1 = new Caderno("Caderno Universitário", 15.0, 3,
                "C001", 200, "Tilibra");

        Produto livro1 = new Livro("Programação Java", 80.0, 1,
                "Educação", "José Silva", "NovaTec");

        Produto livro2 = new Livro("História do Brasil", 50.0, 2,
                "História", "Maria Souza", "Atlas");

        // Exibição polimórfica
        caderno1.exibirInformacoes();
        livro1.exibirInformacoes();
        livro2.exibirInformacoes();
    }
}
