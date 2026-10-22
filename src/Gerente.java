
/*Representa um gerente, que é um tipo especializado de funcionário.
  Herda os atributos e o construtor de Funcionario.*/
public class Gerente extends Funcionario {

    // super encaminha nome e salário para o construtor da classe Funcionario.
    public Gerente(String nome, double salario) {
        super(nome, salario);
    }

    // Sobrescreve o cálculo herdado: gerentes recebem bônus de 20%.
    @Override
    public double calcularBonus() {
        return salario * 0.20;
    }
}
