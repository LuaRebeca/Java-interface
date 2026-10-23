public abstract class FuncionarioBase implements Funcionario {

    private String nome;
    private double salario;
    private boolean noTrabalho;

    public FuncionarioBase(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
        this.noTrabalho = false;
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    public void baterPonto() {
        if (noTrabalho == false) {
            noTrabalho = true;
            System.out.println(nome + " bateu o ponto de entrada");
        } else {
            noTrabalho = false;
            System.out.println(nome + " bateu o ponto de saida");
        }
    }

    public String apresentar() {
        return nome + " - " + getClass().getSimpleName() + " - R$ " + String.format("%.2f", salario);
    }

    public abstract void trabalhar();
}
