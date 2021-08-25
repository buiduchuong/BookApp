package app;

import java.util.Iterator;

public class Inventory extends QuanLy {

    @Override
    protected void add(Object object) {
        super.add(object);
    }

    @Override
    protected void remove(Object object) {
        super.remove(object);
    }

    @Override
    protected Iterator<Object> search(Object object) {
        return super.search(object);
    }

    @Override
    protected void inDS() {
        super.inDS();
    }

    public void sapXepTheoPrice() {

    }

    /*
     * public void addBookCart(Book book, QuanLy cart) {
     * 
     * Iterator<Object> i = this.list.iterator(); while (i.hasNext()) { Book book2 =
     * (Book) i.next(); int amount = book2.getSoluong(); if (amount < 1) {
     * System.out.println("Quyen sach nay da het"); } else { if (book2.check(book))
     * { cart.add(book2); amount--; book2.setSoluong(amount);
     * 
     * } } } }
     */
}
