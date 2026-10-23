public class PagamentoDinheiro implements Pagamento {

    private double valor;

    public PagamentoDinheiro(double valor) {
        this.valor = valor;
    }

    public double calcularPagamento() {
        return valor - valor * 0.10;
    }

    public String emitirRecibo() {
        return "Recibo - Dinheiro\n"
                + "Valor: R$ " + String.format("%.2f", valor) + "\n"
                + "Desconto de 10%: R$ " + String.format("%.2f", valor * 0.10) + "\n"
                + "Total: R$ " + String.format("%.2f", calcularPagamento());
    }
}
