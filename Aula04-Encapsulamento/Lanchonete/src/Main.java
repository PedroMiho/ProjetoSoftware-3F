import entidades.Lanche;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Lanche lanche = new Lanche(
                "X-Burguer",
                "Pão, Hambúrguer, Maionese Verde, Queijo",
                20.90,
                10
        );

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("LISTA OPÇÕES");
            System.out.println("1 - FAZER PEDIDO");
            System.out.println("2 - CADASTRAR NO ESTOQUE");
            System.out.println("3 - INFORMAÇÕES DO LANCHE");
            System.out.println("4 - ALTERAR DESCRIÇÃO");
            System.out.println("5 - ALTERAR VALOR");
            System.out.println("6 - SAIR DO PROGRAMA");
            System.out.print("INFORME A OPÇÃO DESEJADA: ");
            String opcao = sc.nextLine();

            switch (opcao) {

                case "1":
                    System.out.print("Informe a quantidade desejada: ");
                    int quantidade = sc.nextInt();
                    sc.nextLine();
                    lanche.decrementarEstoque(quantidade);
                    break;
                case "3":
                    System.out.println(lanche.toString());
                    break;
            }
        }

    }

}
