package entidades;

public class Lanche {
    private String nome;
    private String descricao;
    private double valor;
    private int estoque;
    private boolean disponivel;

    public Lanche(String nome, String descricao, double valor, int estoque) {
        this.nome = nome;
        this.descricao = descricao;
        this.valor = valor;
        this.estoque = estoque;
        this.disponivel = estoque > 0;
    }

    public void decrementarEstoque(int quantidade) {

        if (quantidade <= 0) {
            System.out.println("Informe um valor maior que zero");
        } else if (quantidade > this.estoque) {
            System.out.println("Sem Estoque");
        } else {
            this.estoque -= quantidade;
            System.out.println("Pedido Efetuado com sucesso");
            alterarDisponivel();
        }
    }

    public void alterarDisponivel() {
        if (this.estoque > 0) {
            this.disponivel = true;
        } else  {
            this.disponivel = false;
        }
    }


    @Override
    public String toString() {
        return "Lanche: " + nome +
                "\nDescrição: " + descricao +
                "\nValor: R$ " + valor +
                "\nEstoque: " + estoque +
                "\nDisponível: " + disponivel
        ;
    }
}
