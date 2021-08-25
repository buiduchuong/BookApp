package app;

import java.util.Iterator;

public class AccountManage extends QuanLy {

    public AccountManage() {
        add(new Account("admin", "password"));
    }

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
