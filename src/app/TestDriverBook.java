package app;

import java.util.Iterator;
import java.util.Scanner;

public class TestDriverBook {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Inventory inventory = new Inventory();
        menu();
        khoiTaoDS(inventory);
        switch (sc.nextInt()) {
            case 1:
                inventory.inDS();
                break;
            case 2:
                inventory.timSach(new Book(2291, "Đắc nhân tâm", "Dale Carnegie", "Kim Đồng", 50));
                break;
            case 3:
                inventory.addBookCart(
                        new Book(2291, "Tôi thấy hoa vàng trên cỏ xanh", "Nguyễn Nhật Ánh", "9 tháng 12, 2010", 100));
                break;

            default:
                System.out.println("Good bye");
                break;
        }

        /*
         * Book book = new Book(2291, "Đắc nhân tâm", "Dale Carnegie", "Kim Đồng",
         * 100000);
         * 
         * if (inventory.removeBook(book) != null) {
         * System.out.println("Remove successful"); } else {
         * System.out.println("Not found"); } inventory.inDS();
         * 
         * Iterator iterator = inventory.timSach(book); if (iterator.hasNext()) { while
         * (iterator.hasNext()) { Book book2 = (Book) iterator.next();
         * System.out.println(book2.toString()); } } else {
         * System.out.println("not found"); }
         */

    }

    public static void khoiTaoDS(Inventory inventory) {
        inventory.addBook(new Book(2291, "Đắc nhân tâm", "Dale Carnegie", "Kim Đồng", 50));
        inventory.addBook(new Book(2291, "Being A Happy Teenager", "Andrew Matthews", "tháng 11 năm 2001", 219.9));
        inventory.addBook(
                new Book(2291, "Cho tôi xin 1 vé đi tuổi thơ", "Nguyễn Nhật Ánh", "1 tháng 2 năm 2008", 139.04));
        inventory.addBook(new Book(2291, "Tôi thấy hoa vàng trên cỏ xanh", "Nguyễn Nhật Ánh", "9 tháng 12, 2010", 100));
        inventory.addBook(
                new Book(2291, "Harry Potter and the Philosopher's Stone", "J K Rowling", "26 tháng 6, 1997", 209.1));
        inventory.addBook(new Book(2291, "Người bán hàng vĩ đại nhất thế giới", "Og Mandino", "1.1.1983", 159.2));
        inventory.addBook(
                new Book(2291, "Trump – Đừng Bao Giờ Bỏ Cuộc", "Meredith McIver  Donald J. Trump", "1.1, 2008", 27.13));
        inventory.addBook(new Book(2291, "the Catcher in the Rye", "J. D. Salinger", "1.1.2001", 44.98));
        inventory.addBook(new Book(2291, "The Old Man and the Sea", "Hemingway", "5.5.1995", 88.13));

        // Book book2 = new Book(maSach, tenSach, tacGia, nXB, donGia);
    }

    public static void menu() {
        System.out.println("1. View inventory books list");
        System.out.println("2. Search book");
        System.out.println("3. Add books to cart");

    }

}
