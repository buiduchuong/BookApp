package app;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Iterator;
import java.util.Scanner;

public class TestDriverBookApp {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        QuanLy inventoryManage, accountManage, cartManage;
        inventoryManage = new Inventory();
        accountManage = new AccountManage();
        cartManage = new Cart();

        try {
            khoiTaoDS(inventoryManage, accountManage);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        while (true) {
            System.out.println("1. Sign in");
            System.out.println("2. Sign up");
            int number = sc.nextInt();
            sc.nextLine();
            switch (number) {
                case 1:
                    Account account = nhap();
                    if (Login.singIn(account, accountManage)) {
                        Iterator<Object> iterator = accountManage.search(account);
                        Account account2 = (Account) iterator.next();
                        String str = "admin";
                        int i = accountManage.list.indexOf(account2);
                        if (!str.equals(((Account) accountManage.list.get(i)).getAccount())) {

                            customerFunction(inventoryManage, cartManage, accountManage, account);
                        } else {

                            managerFunction(accountManage, inventoryManage);

                        }

                    } else {
                        System.out.println("Incorrect username or password");
                    }
                    break;

                default:
                    Login.signUp(nhap(), accountManage);
                    break;
            }

        }
    }

    public static Account nhap() {
        System.out.println("Username:  ");
        String account1 = sc.nextLine();
        System.out.println("Password: ");
        String password = sc.nextLine();
        return new Account(account1, password);
    }

    public static void khoiTaoDS(QuanLy inventory, QuanLy accountManage) throws ParseException {

        inventory.add(new Book(2291, "Đắc nhân tâm", "Dale Carnegie",
                new SimpleDateFormat("dd/MM/yyy").parse("12/09/2001"), 50, 2));
        inventory.add(new Book(124, "Being A Happy Teenager", "Andrew Matthews",
                new SimpleDateFormat("dd/MM/yyy").parse("12/09/2001"), 219.9, 83));
        inventory.add(new Book(542, "Cho tôi xin 1 vé đi tuổi thơ", "Nguyễn Nhật Ánh",
                new SimpleDateFormat("dd/MM/yyy").parse("12/09/2001"), 139.04, 99));
        inventory.add(new Book(423, "Tôi thấy hoa vàng trên cỏ xanh", "Nguyễn Nhật Ánh",
                new SimpleDateFormat("dd/MM/yyy").parse("12/09/2001"), 100, 120));
        inventory.add(new Book(657, "Harry Potter and the Philosopher's Stone", "J K Rowling",
                new SimpleDateFormat("dd/MM/yyy").parse("12/09/2001"), 209.1, 13));
        inventory.add(new Book(56756, "Người bán hàng vĩ đại nhất thế giới", "Og Mandino",
                new SimpleDateFormat("dd/MM/yyy").parse("12/09/2001"), 159.2, 11));
        inventory.add(new Book(657, "Trump – Đừng Bao Giờ Bỏ Cuộc", "Meredith McIver  Donald J. Trump",
                new SimpleDateFormat("dd/MM/yyy").parse("12/09/2001"), 27.13, 93));
        inventory.add(new Book(344, "the Catcher in the Rye", "J. D. Salinger",
                new SimpleDateFormat("dd/MM/yyy").parse("12/09/2001"), 44.98, 29));
        inventory.add(new Book(331, "The Old Man and the Sea", "Hemingway",
                new SimpleDateFormat("dd/MM/yyy").parse("12/09/2001"), 88.13, 82));

        accountManage.add(new Account("a", "ac"));
        accountManage.add(new Account("b", "ac"));

    }

    public static void managerFunction(QuanLy accountManage, QuanLy inventory) {
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
                    Iterator<Object> iterator = accountManage.search(new Account("a", "ac"));
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
                    try {
                        inventory.add(new Book(3391, "Java 102", "MJ",
                                new SimpleDateFormat("dd/MM/yyy").parse("12/09/2001"), 55.32, 3));
                    } catch (ParseException e) {
                        e.printStackTrace();
                    }
                    System.out.println("add successful");
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

    public static void customerFunction(QuanLy inventory, QuanLy cart, QuanLy accountManage, Account accounts) {
        boolean check = true;
        while (check) {

            System.out.println("1. View inventory books list");
            System.out.println("2. Search book");
            System.out.println("3. Add books to cart");
            System.out.println("4. View cart books list");
            System.out.println("5. Nap tien vao tai khoan");
            System.out.println("0. Log out");
            switch (sc.nextInt()) {
                case 1:
                    inventory.inDS();

                    break;
                case 2:
                    Iterator<Object> iterator = inventory.search(new Book(2291, "Đắc nhân tâm"));
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
                    System.out.println("Nhap ma sach can them vao gio do");
                    int maSach = sc.nextInt();

                    cart.add(new Book(maSach));

                    break;
                case 4:
                    cart.inDS();
                    break;
                case 5:
                    // ((AccountManage) accountManage).napTien(accounts, 574.4);
                    break;

                default:
                    check = false;
                    sc.nextLine();
                    break;
            }
        }
    }
}
