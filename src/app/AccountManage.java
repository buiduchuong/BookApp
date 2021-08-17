package app;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import app.interfaces.Manage;

public class AccountManage implements Manage {
    List<Account> list;

    public AccountManage() {
        list = new ArrayList<Account>();
    }

    @Override
    public void add(Object object) {
        // TODO Auto-generated method stub
        list.add((Account) object);
    }

    @Override
    public void remove(Object object) {
        for (Account account : list) {
            if (account.check((Account) object)) {
                list.remove(account);
            }
        }

    }

    @Override
    public Iterator<Account> search(Object object) {
        List<Account> lBooks = new ArrayList<Account>();
        Iterator<Account> i = list.iterator();
        while (i.hasNext()) {
            Account account = i.next();
            if (account.check((Account) object)) {
                lBooks.add(account);
            }
        }
        return lBooks.iterator();
    }

    @Override
    public void inDS() {
        // TODO Auto-generated method stub

    }
}
