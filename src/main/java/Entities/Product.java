package Entities;

public class Product {
    public String name;
    public double price;
    public int quantity;

    public double totalValorEstoque(){
        return price * quantity;
    }
    public void addProduto (int quantity){
        this.quantity += quantity;
    }
    public void removerProduto(int quantity){
        this.quantity -= quantity;
    }
    public String toString(){
        return name + ", R$ " + String.format("%.2f", price) + ", " + quantity
                + " unidades, total: R$ "  + String.format("%.2f", totalValorEstoque());
    }
}
