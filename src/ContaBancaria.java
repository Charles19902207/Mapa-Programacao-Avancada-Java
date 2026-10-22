/*Representa uma conta bancária simples, permitindo depósitos,
 saques e a consulta do saldo.*/

public class ContaBancaria {
    // Dados que pertencem à conta.
    String titular;
    double saldo;

    // Construtor: recebe os dados iniciais usados ao criar uma conta.
    public ContaBancaria(String titular, double saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    // Só aceita depósitos com valor positivo.
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Deposito realizado!");
        } else {
            System.out.println("Valor invalido.");
        }
    }

    // Só permite sacar um valor positivo que não ultrapasse o saldo disponível.
    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque realizado!");
        } else {
            System.out.println("Saque invalido ou saldo insuficiente.");
        }
    }

    // Mostra o titular e o saldo formatado com duas casas decimais.
    public void exibirSaldo() {
        System.out.println("Titular: " + titular);
        System.out.printf("Saldo: R$ %.2f%n", saldo);
    }
}
