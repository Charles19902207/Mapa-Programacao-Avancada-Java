/*Representa um produto e controla o acesso ao nome e ao preço por meio
 de métodos públicos (getters e setters).*/

public class Produto {
    // private impede que outras classes alterem esses campos diretamente.
    private String nome;
    private double preco;

    // Getter: devolve o nome armazenado.
    public String getNome() {
        return nome;
    }

    // Setter: altera o nome armazenado.
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Getter: devolve o preço armazenado.
    public double getPreco() {
        return preco;
    }

    // Setter com validação: não permite gravar um preço negativo.
    public void setPreco(double preco) {
        if (preco >= 0) {
            this.preco = preco;
        }
    }
}
