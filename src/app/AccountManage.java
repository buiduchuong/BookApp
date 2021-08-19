package app;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import app.interfaces.Manage;

public class AccountManage implements Manage {
    private List<Account> list;

    public AccountManage() {
        this.list = new ArrayList<Account>();
        add(new Account("admin", "password", 0));
    }

    @Override
    public void add(Object object) {
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

    public boolean login(Account account1) {
        Iterator<Account> i = list.iterator();
        while (i.hasNext()) {
            Account account = i.next();
            if (account.check(account1)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public Iterator<Account> search(Object object) {
        List<Account> lAccounts = new ArrayList<Account>();
        Iterator<Account> i = list.iterator();
        while (i.hasNext()) {
            Account account = i.next();
            if (account.check((Account) object)) {
                lAccounts.add(account);
            }
        }
        return lAccounts.iterator();
    }

    @Override
    public void inDS() {
        for (Account account : list) {
            System.out.println(account.toString());
        }
    }

    public List<Account> getList() {
        return list;
    }

    public void setList(List<Account> list) {
        this.list = list;
    }

}
