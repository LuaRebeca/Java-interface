public class PagamentoCartao implements Pagamento {

    private double valor;

    public PagamentoCartao(double valor) {
        this.valor = valor;
    }

    public double calcularPagamento() {
        return valor + valor * 0.05;
    }

    public String emitirRecibo() {
        return "Recibo - Cartao\n"
                + "Valor: R$ " + String.format("%.2f", valor) + "\n"
                + "Taxa de 5%: R$ " + String.format("%.2f", valor * 0.05) + "\n"
                + "Total: R$ " + String.format("%.2f", calcularPagamento());
    }
}
