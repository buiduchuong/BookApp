package app;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import app.interfaces.Manage;

public class Cart implements Manage {
    private List<Book> list;

    public Cart() {
        this.list = new ArrayList<Book>();
    }

   

    @Override
    public void add(Object object) {
        this.list.add((Book) object);
        
    }

    @Override
    public void remove(Object object) {
        
    }

    @Override
    public Iterator<Book> search(Object object) {
        return null;
    }

    @Override
    public void inDS() {
       
        for (Book book : list) {
            System.out.println(book.toString());
        }
        
    }
}
