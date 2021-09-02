package bookapp.control;

import java.util.Iterator;
import bookapp.entity.Book;

public class Inventory extends QuanLy {

    @Override
    public void add(Object object) {
        super.add(object);
    }

    @Override
    public void remove(Object object) {
        super.remove(object);
    }

    @Override
    public Iterator<Object> search(Object object) {
        return super.search(object);
    }

    @Override
    public void inDS() {
        super.inDS();
    }

    public void inDSS() {
        for (int i = 0; i < 4; i++) {
            System.out.println(getList().get(i).toString());
        }
    }

    protected Book check(Book book) {
        Iterator<Object> i = getList().iterator();
        while (i.hasNext()) {
            Book book2 = (Book) i.next();
            int amount = book2.getSoluong();
            if (amount < 1) {
                return null;
            } else {
                if (book.check(book)) {
                    amount--;
                    book2.setSoluong(amount);
                    return book2;
                }
            }
        }
     return null;  
    }

}
