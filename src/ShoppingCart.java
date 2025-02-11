// Código original a refactorizar
// Este programa calcula el precio total de un carrito de compras.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ShoppingCart {
    public static void main(String[] args) {
        List<Item> items = new ArrayList<>();

        Item item1 = new Item("manzana",0.5,10);

        items.add(item1);

        Item item2 = new Item("pan",1.5,2);

        items.add(item2);

        double total = getTotal(items);

        System.out.println("Precio total: " + total);
    }

    private static double getTotal(List<Item> items) {
        double total = 0;
        for (Item item : items) {
            total += item.price * item.quantity;
            System.out.println("Precio por unidad: " + item.price+
                    " Cantidad: " + item.quantity+
                    " Subtotal: " + (item.price * item.quantity));
            //se imprime directamente el mensaje sin usar el for que aunque no sea algo recursivo y
            //el coste sea el mismo no tiene mucho sentido para hacer solo un sytem out print
        }
        return total;
    }
}

class Item {
    String name;
    double price;
    int quantity;

    public Item(String name, double price,int quantity){
        this.name=name;
        this.price=price;
        this.quantity=quantity;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
