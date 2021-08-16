package app;

import java.util.Iterator;

public class TestDriverBook {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        khoiTaoDS(inventory);
        Book book = new Book(2291, "Đắc nhân tâm", "Dale Carnegie", "Kim Đồng", 100000);

        Iterator iterator = inventory.timSach(book);
        if (iterator.hasNext()) {
            while (iterator.hasNext()) {
                Book book2 = (Book) iterator.next();
                System.out.println(book2.toString());
            }
        } else {
            System.out.println("not found");
        }
    }

    public static void khoiTaoDS(Inventory inventory) {
        inventory.addBook(new Book(2291, "Đắc nhân tâm", "Dale Carnegie", "Kim Đồng", 100000));
        // Book book2 = new Book(maSach, tenSach, tacGia, nXB, donGia);
    }
}
