public class TestePagamento {
    public static void main(String[] args) {
        Pagamento cartao = new PagamentoCartao(100.00);
        Pagamento dinheiro = new PagamentoDinheiro(100.00);

        System.out.println(cartao.emitirRecibo());
        System.out.println();
        System.out.println(dinheiro.emitirRecibo());
    }
}
