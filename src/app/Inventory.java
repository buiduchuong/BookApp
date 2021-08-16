package app;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Inventory {
    private List<Book> listBook;
    private Book book;

    public Inventory() {
        listBook = new ArrayList<Book>();

    }

    public void addBook(Book book) {
        listBook.add(book);
    }

    public String removeBook(Book book) {
        for (Book book2 : listBook) {
            if (book.check(book2)) {
                listBook.remove(book2);
                return "";
            }
        }
        return null;
    }

    public void inDS() {
        for (Book book : listBook) {
            System.out.println(book.toString());
        }
    }

    public void sapXepTheoPrice() {

    }

    public Iterator<Book> timSach(Book book) {
        List<Book> lBooks = new ArrayList<Book>();
        Iterator<Book> i = listBook.iterator();
        while (i.hasNext()) {
            Book book2 = i.next();
            if (book2.check(book)) {
                lBooks.add(book2);
            }
        }
        return lBooks.iterator();
    }
    public Iterator<Book> addBookCart(Book book) {
        this.book = book;
        List<Book> lBooks = new ArrayList<Book>();
        Iterator<Book> i = listBook.iterator();
        while (i.hasNext()) {
            Book book2 = i.next();
            if (book2.check(book)) {
                lBooks.add(book2);
            }
        }
        return lBooks.iterator();
    }

}
