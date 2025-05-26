package entities1;

public class Product {

    public String name;
    public double price;
    public int quantity;
    
    public double totalValueInStock() {
    
        return price * quantity;
    }
    
    public void addProducts(int quantity) {
    
        // usando this. acessa o atributo da classe e nao o parametro
        this.quantity += quantity;

    }
    
    public void removeProducts(int quantity){
    
        this.quantity -= quantity;
    }
    
    public String toString(){
    
        return name
                + ", $ "
                + String.format("%.2f", price)
                + ", "
                + quantity
                + " units, Total: $ "
                + String.format("%.2f", totalValueInStock());
    }
}
