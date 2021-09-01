package bookapp.control;

import java.util.Iterator;

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

}
