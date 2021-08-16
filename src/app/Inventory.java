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
        for (Iterator iterator = listBook.iterator(); iterator.hasNext();) {
            Book book2 = (Book) iterator.next();
            if (book2.check(book)) {
                listBook.remove(book2);
            }
        }
    }

    public void sapXep() {

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

}
