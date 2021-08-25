package app;

import java.util.Iterator;

public class Cart extends QuanLy {

    /*
     * @Override public void add(Object object) { int index = 1; if
     * (this.list.isEmpty()) { this.list.add( new Book(((Book) object).getMaSach(),
     * ((Book) object).getTenSach(), ((Book) object).getTacGia(), ((Book)
     * object).getNgayPhatHanh(), ((Book) object).getDonGia(), index));
     * System.out.println("add successful"); System.out.println("3");
     * 
     * } else { boolean check = true; for (Object book : this.list) { if ((((Book)
     * this.list.get(list.indexOf(book))).getMaSach()) == ((Book)
     * object).getMaSach()) {
     * 
     * index = ((Book) list.get(list.indexOf(book))).getSoluong(); index++; ((Book)
     * list.get(list.indexOf(book))).setSoluong(index);
     * System.out.println("add successful"); System.out.println("1"); check = false;
     * } } if (check) {
     * 
     * this.list.add( new Book(((Book) object).getMaSach(), ((Book)
     * object).getTenSach(), ((Book) object).getTacGia(), ((Book)
     * object).getNgayPhatHanh(), ((Book) object).getDonGia(), index));
     * System.out.println("add successful"); System.out.println("2"); }
     * 
     * }
     * 
     * }
     */

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

}
