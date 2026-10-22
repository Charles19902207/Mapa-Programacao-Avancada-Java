/*Representa um funcionário e calcula seu bônus como 10% do salário.*/

public class Funcionario {
    // Dados usados para identificar o funcionário e calcular o bônus.
    String nome;
    double salario;

    // Construtor: inicializa nome e salário do novo funcionário.
    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    // Retorna 10% do salário.
    public double calcularBonus() {
        return salario * 0.10;
    }
}
