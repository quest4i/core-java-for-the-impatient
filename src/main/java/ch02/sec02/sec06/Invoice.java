package ch02.sec02.sec06;

import java.util.ArrayList;

/**
 * Created on 2016. 9. 11. 오후 2:59.
 *
 * @author samyeong-gu
 */
public class Invoice {

    private static class Item {

        String description;
        int quantity;
        double unitPrice;

        double price() {
            return quantity * unitPrice;
        }

        @Override
        public String toString() {
            return "Item{" +
                    "description='" + description + '\'' +
                    ", quantity=" + quantity +
                    ", unitPrice=" + unitPrice +
                    '}';
        }
    }


    private ArrayList<Item> items = new ArrayList<>();

    public void addItem(String description, int quantity, double unitPrice) {
        Item newItem = new Item();
        newItem.description = description;
        newItem.quantity = quantity;
        newItem.unitPrice = unitPrice;
        items.add(newItem);
    }

    public void print() {
        double total = 0;
        for (Item item : items) {
            System.out.println(item);
            total += item.price();
        }
        System.out.println(total);
    }
}
