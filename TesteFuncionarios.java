public class TesteFuncionarios {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Carlos", 8000.00);
        Vendedor vendedor = new Vendedor("Ana", 3000.00);
        Faxineiro faxineiro = new Faxineiro("Jose", 1800.00);

        Funcionario[] equipe = {gerente, vendedor, faxineiro};

        for (Funcionario f : equipe) {
            System.out.println(f.apresentar());
            f.baterPonto();
            f.trabalhar();
            System.out.println();
        }

        vendedor.realizarVenda("Camiseta", 59.90);
        vendedor.realizarVenda("Calca Jeans", 129.90);
        faxineiro.solicitarMaterial("Detergente", 5);
        gerente.fecharCaixa(vendedor.getTotalVendido());

        System.out.println();
        for (Funcionario f : equipe) {
            f.baterPonto();
        }
    }
}
