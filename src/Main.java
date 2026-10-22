public class Main {
        public static void main(String[] args) {

                // Exercício 1: cria uma pessoa, preenche seus dados e os mostra no console.
                System.out.println("=== EXERCICIO 1 ===");
                Pessoa pessoa = new Pessoa();
                pessoa.nome = "Charles";
                pessoa.idade = 36;
                pessoa.cidade = "Sao Jose";

                System.out.println("Nome: " + pessoa.nome);
                System.out.println("Idade: " + pessoa.idade);
                System.out.println("Cidade: " + pessoa.cidade);

                // Exercício 2: calcula a área de um retângulo usando largura x altura.
                System.out.println("\n=== EXERCICIO 2 ===");
                Retangulo retangulo = new Retangulo();
                retangulo.largura = 5;
                retangulo.altura = 7;
                System.out.println("Area: " + retangulo.calcularArea());

                // Exercício 3: cria uma conta, faz um depósito e um saque e exibe o saldo.
                System.out.println("\n=== EXERCICIO 3 ===");
                ContaBancaria conta = new ContaBancaria("Charles", 1000.00);
                conta.depositar(200.00);
                conta.sacar(150.00);
                conta.exibirSaldo();

                // Exercício 4: demonstra encapsulamento usando métodos get e set de Produto.
                System.out.println("\n=== EXERCICIO 4 ===");
                Produto produto = new Produto();
                produto.setNome("Teclado");
                produto.setPreco(89.90);
                System.out.println("Produto: " + produto.getNome());
                System.out.printf("Preco: R$ %.2f%n", produto.getPreco());

                // Exercício 5: compara o cálculo de bônus de Funcionario e de Gerente.
                // A variável gerente tem tipo Funcionario, mas guarda um objeto Gerente.
                // Por isso, é executada a versão de calcularBonus sobrescrita em Gerente.
                System.out.println("\n=== EXERCICIO 5 ===");
                Funcionario funcionario = new Funcionario("Joao", 3000.00);
                Funcionario gerente = new Gerente("Maria", 6000.00);

                System.out.printf("Bonus funcionario: R$ %.2f%n",
                                funcionario.calcularBonus());
                System.out.printf("Bonus gerente: R$ %.2f%n",
                                gerente.calcularBonus());

                // Exercício 6: usa uma referência Veiculo para objetos de tipos diferentes.
                // Cada objeto executa sua própria versão do método mover.
                System.out.println("\n=== EXERCICIO 6 ===");
                Veiculo carro = new Carro();
                Veiculo bicicleta = new Bicicleta();

                carro.mover();
                bicicleta.mover();
        }
}
