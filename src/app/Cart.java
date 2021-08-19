package app;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import app.interfaces.Manage;

public class Cart implements Manage {
    private List<Book> listCartBooks;

    public Cart() {
        this.listCartBooks = new ArrayList<Book>();
    }

    @Override
    public void add(Object object) {
        int index = 1;
        if (listCartBooks.isEmpty()) {
            this.listCartBooks.add(
                    new Book(((Book) object).getMaSach(), ((Book) object).getTenSach(), ((Book) object).getTacGia(),
                            ((Book) object).getNgayPhatHanh(), ((Book) object).getDonGia(), index));
            System.out.println("add successful");
            System.out.println("3");

        } else {
            boolean check = true;
            for (Book book : listCartBooks) {
                if ((listCartBooks.get(listCartBooks.indexOf(book)).getMaSach()) == ((Book) object).getMaSach()) {

                    index = listCartBooks.get(listCartBooks.indexOf(book)).getSoluong();
                    index++;
                    listCartBooks.get(listCartBooks.indexOf(book)).setSoluong(index);
                    System.out.println("add successful");
                    System.out.println("1");
                    check = false;
                }
            }
            if (check) {

                this.listCartBooks.add(
                        new Book(((Book) object).getMaSach(), ((Book) object).getTenSach(), ((Book) object).getTacGia(),
                                ((Book) object).getNgayPhatHanh(), ((Book) object).getDonGia(), index));
                System.out.println("add successful");
                System.out.println("2");
            }

        }
        /*
         * this.listCartBooks.add( new Book(((Book) object).getMaSach(), ((Book)
         * object).getTenSach(), ((Book) object).getTacGia(), ((Book)
         * object).getNgayPhatHanh(), ((Book) object).getDonGia(), index));
         */
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

        for (Book book : listCartBooks) {
            System.out.println(book.toString());
        }

    }

    @Override
    public List<Book> getList() {
        return listCartBooks;
    }
}
