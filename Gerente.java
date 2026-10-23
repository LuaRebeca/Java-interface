public class Gerente extends FuncionarioBase {

    public Gerente(String nome, double salario) {
        super(nome, salario);
    }

    public void trabalhar() {
        System.out.println(getNome() + " esta coordenando a equipe");
    }

    public void fecharCaixa(double total) {
        System.out.println(getNome() + " fechou o caixa com R$ " + String.format("%.2f", total));
    }
}
