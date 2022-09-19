package Application;

import Entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Product produto = new Product();
        System.out.println("ENTRE COM O PRODUTO");
        System.out.print("Produto: ");
        produto.name = sc.nextLine();
        System.out.print("Valor: ");
        produto.price = sc.nextDouble();
        System.out.print("Quantidade em estoque: ");
        produto.quantity = sc.nextInt();
        System.out.println();
        System.out.println("Dados do produto: " + produto);
        System.out.println();
        System.out.println("Entre com a quantidade a ser adicionada no estoque: ");
        int quantity = sc.nextInt();
        produto.addProduto(quantity);
        System.out.println();
        System.out.println("Dados atualizados: " + produto);
        System.out.println();
        System.out.println("Entre com a quantidade a ser removida do estoque: ");
        quantity = sc.nextInt();
        produto.removerProduto(quantity);
        System.out.println();
        System.out.println("Dados atualizados: " + produto);
        sc.close();
    }
}
