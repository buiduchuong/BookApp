package app;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Inventory {
    List<Book> listBook;

    public Inventory() {
        listBook = new ArrayList<Book>();
    }

    public void addBook(Book book) {
        listBook.add(book);
    }

    public void removeBook(Book book) {
        listBook.remove(book);
    }

    public void sapXep() {

    }

    public Book timSach(String nhaXB, String tenSach) {
        return null;
    }

    public Iterator<Book> timSach(Book book) {
        return null;
    }

}
