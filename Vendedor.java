public class Vendedor extends FuncionarioBase {

    private double totalVendido;

    public Vendedor(String nome, double salario) {
        super(nome, salario);
        totalVendido = 0;
    }

    public void trabalhar() {
        System.out.println(getNome() + " esta atendendo os clientes");
    }

    public void realizarVenda(String produto, double valor) {
        totalVendido = totalVendido + valor;
        System.out.println(getNome() + " vendeu " + produto + " por R$ " + String.format("%.2f", valor));
    }

    public double getTotalVendido() {
        return totalVendido;
    }
}
