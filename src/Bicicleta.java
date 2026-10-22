/*Representa uma bicicleta, que é um tipo de veículo.*/

public class Bicicleta extends Veiculo {

    // Sobrescreve o movimento genérico de Veiculo com o comportamento da bicicleta.
    @Override
    public void mover() {
        System.out.println("A bicicleta está se movendo lentamente");
    }
}