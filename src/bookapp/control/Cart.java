package bookapp.control;

import bookapp.entity.*;
import java.util.Iterator;

public class Cart extends QuanLy {

    Inventory inventory;

    public Cart(QuanLy inventory) {
        this.inventory = (Inventory) inventory;
    }

    @Override
    public void add(Object object) {
        add1(inventory.check((Book) object));
    }

    private void add1(Book object) {

        int index = 1;
        if (this.getList().isEmpty()) {
            super.add(new Book(object.getMaSach(), object.getTenSach(), object.getNhaXuatBan(),
                    object.getNgayPhatHanh(), object.getDonGia(), index, object.getTacGia(), object.getTheLoai()));
            System.out.println("add successful");

        } else {
            boolean check = true;
            for (Object book : getList()) {
                if ((((Book) getList().get(getList().indexOf(book))).getMaSach()) == ((Book) object).getMaSach()) {

                    index = ((Book) getList().get(getList().indexOf(book))).getSoluong();
                    index++;
                    ((Book) getList().get(getList().indexOf(book))).setSoluong(index);
                    System.out.println("add successful");
                    check = false;
                }
            }
            if (check) {

                super.add(new Book(object.getMaSach(), object.getTenSach(), object.getNhaXuatBan(),
                        object.getNgayPhatHanh(), object.getDonGia(), index, object.getTacGia(), object.getTheLoai()));
                System.out.println("add successfully");
            }
        }
    }

    public double tongTien() {
        double tongTien = 0;
        Iterator iterator = getList().iterator();
        while (iterator.hasNext()) {
            Book book = (Book) iterator.next();
            tongTien += book.getDonGia() * book.getSoluong();
        }
        return tongTien;
    }

    public void removeAll() {
        Iterator iterator = getList().iterator();
        while (iterator.hasNext()) {
            iterator.next();
            iterator.remove();
        }

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

}
