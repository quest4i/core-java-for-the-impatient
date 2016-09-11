package ch02.sec02.sec06;

/**
 * Created on 2016. 9. 11. 오후 3:02.
 *
 * @author samyeong-gu
 */
public class InvoiceDemo {

    public static void main(String[] args) {

        Invoice invoice = new Invoice();
        invoice.addItem("Blackwell Toaster", 2, 24.95);
        invoice.addItem("ZapXpress Microwave Oven", 1, 49.95);
        invoice.print();
    }
}
