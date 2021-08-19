package app;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import app.interfaces.Manage;

public class Inventory implements Manage {
    private List<Book> listBook;

    public Inventory() {
        listBook = new ArrayList<Book>();

    }

    @Override
    public void add(Object object) {
        listBook.add((Book) object);

    }

    @Override
    public void remove(Object object) {
        for (Book book2 : listBook) {
            if (book2.check((Book) object)) {
                listBook.remove(book2);

            }

        }
    }

    @Override
    public Iterator<Book> search(Object object) {
        List<Book> lBooks = new ArrayList<Book>();
        Iterator<Book> i = listBook.iterator();
        while (i.hasNext()) {
            Book book2 = i.next();
            if (((Book) object).check(book2)) {
                lBooks.add(book2);
            }
        }
        return lBooks.iterator();
    }

    public void inDS() {
        for (Book book : listBook) {
            System.out.println(book.toString());
        }
    }

    public void sapXepTheoPrice() {

    }

    public void addBookCart(Book book,Cart cart) {
        
        Iterator<Book> i = listBook.iterator();
        while (i.hasNext()) {
            Book book2 = i.next();
            int amount = book2.getSoluong();
            if (amount < 1) {
                System.out.println("Quyen sach nay da het");
            } else {
                if (book2.check(book)) {
                    cart.add(book2);
                    amount--;
                    book2.setSoluong(amount);
                    System.out.println("add successful");

                }
            }
        }
    }

}
