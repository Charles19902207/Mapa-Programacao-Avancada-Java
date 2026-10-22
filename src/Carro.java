/*Representa um carro, que é um tipo de veículo.*/

public class Carro extends Veiculo {

    // Sobrescreve o movimento genérico de Veiculo com o comportamento do carro.
    @Override
    public void mover() {
        System.out.println("O carro esta se movendo rapidamente");
    }
}