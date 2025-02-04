// Código original a refactorizar
// Este programa calcula el precio total de un carrito de compras.

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    public static void main(String[] args) {
        List<Item> items = new ArrayList<>();

        // Añadimos algunos artículos
        Item item1 = new Item("manzana",0.5,10);

        items.add(item1);

        Item item2 = new Item("pan",1.5,2);

        items.add(item2);

        double total = 0;
        for (Item item : items) {
            total += item.price * item.quantity;
            System.out.println("Artículo: " + item.name);
            System.out.println("Precio por unidad: " + item.price);
            System.out.println("Cantidad: " + item.quantity);
            System.out.println("Subtotal: " + (item.price * item.quantity));
        }

        System.out.println("Precio total: " + total);
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
}
