package app;

import java.util.Iterator;
import java.util.Scanner;

public class TestDriverBook {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        AccountManage accountManage = new AccountManage();
        Cart cart = new Cart();
        khoiTaoDS(inventory, accountManage);

       

        while (true) {

            System.out.println("Username:  ");
            String account1 = sc.nextLine();
            System.out.println("Password: ");
            String password = sc.nextLine();

            Account account = new Account(account1, password);

            if (accountManage.login(account)) {

                Iterator<Account> iterator = accountManage.search(account);
                Account account2 = (Account) iterator.next();
                String str = "admin";
                int i = accountManage.getList().indexOf(account2);
                if (!str.equals(accountManage.getList().get(i).getAccount())) {

                    customerFunction(inventory, cart);
                } else {

                    managerFunction(accountManage, inventory);

                }

            } else {
                System.out.println("Incorrect username or password");
            }
        }
    }

    public static void khoiTaoDSAcc(AccountManage accountManage) {

    }

    public static void khoiTaoDS(Inventory inventory, AccountManage accountManage) {

        inventory.add(new Book(2291, "Đắc nhân tâm", "Dale Carnegie", "Kim Đồng", 50, 2));
        inventory.add(new Book(124, "Being A Happy Teenager", "Andrew Matthews", "tháng 11 năm 2001", 219.9, 83));
        inventory.add(
                new Book(542, "Cho tôi xin 1 vé đi tuổi thơ", "Nguyễn Nhật Ánh", "1 tháng 2 năm 2008", 139.04, 99));
        inventory.add(new Book(423, "Tôi thấy hoa vàng trên cỏ xanh", "Nguyễn Nhật Ánh", "9 tháng 12, 2010", 100, 120));
        inventory.add(new Book(657, "Harry Potter and the Philosopher's Stone", "J K Rowling", "26 tháng 6, 1997",
                209.1, 13));
        inventory.add(new Book(56756, "Người bán hàng vĩ đại nhất thế giới", "Og Mandino", "1.1.1983", 159.2, 11));
        inventory.add(new Book(657, "Trump – Đừng Bao Giờ Bỏ Cuộc", "Meredith McIver  Donald J. Trump", "1.1, 2008",
                27.13, 93));
        inventory.add(new Book(344, "the Catcher in the Rye", "J. D. Salinger", "1.1.2001", 44.98, 29));
        inventory.add(new Book(331, "The Old Man and the Sea", "Hemingway", "5.5.1995", 88.13, 82));

        accountManage.add(new Account("a", "ac"));
        accountManage.add(new Account("b", "ac"));

    }

    public static void managerFunction(AccountManage accountManage, Inventory inventory) {
        boolean check = true;
        while (check) {

            System.out.println("1. View the list of accounts");
            System.out.println("2. Search account");
            System.out.println("3. Delete the account");
            System.out.println("4. Add books to inventory");
            System.out.println("5. Delete books to inventory");
            System.out.println("6. View inventory books list to inventory");
            System.out.println("0. Log out");

            switch (sc.nextInt()) {
                case 1:
                    accountManage.inDS();
                    break;
                case 2:
                    Iterator<Account> iterator = accountManage.search(new Account("a", "ac"));
                    if (iterator.hasNext()) {
                        while (iterator.hasNext()) {
                            Account account = (Account) iterator.next();
                            System.out.println(account.toString());
                        }
                    } else {
                        System.out.println("not found");
                    }
                    break;
                case 3:
                    accountManage.remove(new Account("a", "ac"));
                    break;
                case 4:
                    inventory.add(new Book(3391, "Java 102", "MJ", "2/2/991", 55.32, 3));
                    System.out.println("add successfula");
                    break;
                case 5:
                    inventory.remove(new Book(344, "the Catcher in the Rye"));
                    break;
                case 6:
                    inventory.inDS();
                    break;
                default:
                    check = false;
                    sc.nextLine();
                    break;
            }
        }
    }

    public static void customerFunction(Inventory inventory, Cart cart) {
        boolean check = true;
        while (check) {

            System.out.println("1. View inventory books list");
            System.out.println("2. Search book");
            System.out.println("3. Add books to cart");
            System.out.println("4. View cart books list");
            System.out.println("0. Log out");
            switch (sc.nextInt()) {
                case 1:
                    inventory.inDS();

                    break;
                case 2:
                    Iterator<Book> iterator = inventory
                            .search(new Book(2291, "Đắc nhân tâm", "Dale Carnegie", "Kim Đồng", 50, 0));
                    if (iterator.hasNext()) {
                        while (iterator.hasNext()) {
                            Book book2 = (Book) iterator.next();
                            System.out.println(book2.toString());
                        }
                    } else {
                        System.out.println("not found");
                    }
                    break;
                case 3:
                    inventory.addBookCart(new Book(2291, "Đắc nhân tâm", "Dale Carnegie", "Kim Đồng", 50, 2), cart);
                    break;
                case 4:
                    cart.inDS();
                    break;

                default:
                    check = false;
                    sc.nextLine();
                    break;
            }
        }
    }
}
