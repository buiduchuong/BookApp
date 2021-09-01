package bookapp.control;

import bookapp.entity.*;
import java.util.Iterator;

public class Cart extends QuanLy {

    QuanLy inventory;

    public Cart(QuanLy inventory) {
        this.inventory = inventory;
    }

    @Override
    public void add(Object object) {

        Iterator<Object> i = inventory.getList().iterator();
        while (i.hasNext()) {
            Book book2 = (Book) i.next();
            int amount = book2.getSoluong();
            if (amount < 1) {
                System.out.println("Quyen sach nay da het");
            } else {
                if (((Book) object).check(book2)) {
                    add1(book2);
                    amount--;
                    book2.setSoluong(amount);

                }
            }
        }
    }

    private void add1(Object object) {

        int index = 1;
        if (this.getList().isEmpty()) {
            super.add(new Book(((Book) object).getMaSach(), ((Book) object).getTenSach(),
                    ((Book) object).getNhaXuatBan(), ((Book) object).getNgayPhatHanh(), ((Book) object).getDonGia(),
                    index, ((Book) object).getTacGia(), ((Book) object).getTheLoai()));
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

                super.add(new Book(((Book) object).getMaSach(), ((Book) object).getTenSach(),
                        ((Book) object).getNhaXuatBan(), ((Book) object).getNgayPhatHanh(), ((Book) object).getDonGia(),
                        index, ((Book) object).getTacGia(), ((Book) object).getTheLoai()));
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
