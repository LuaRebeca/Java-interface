public class Faxineiro extends FuncionarioBase {

    public Faxineiro(String nome, double salario) {
        super(nome, salario);
    }

    public void trabalhar() {
        System.out.println(getNome() + " esta limpando a loja");
    }

    public void solicitarMaterial(String material, int quantidade) {
        System.out.println(getNome() + " pediu " + quantidade + " de " + material);
    }
}
