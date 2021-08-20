package app;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import app.interfaces.Manage;

public class AccountManage implements Manage {
    private List<Account> listAccounts;

    public AccountManage() {
        this.listAccounts = new ArrayList<Account>();
        add(new Account("admin", "password", 0));
    }

    @Override
    public void add(Object object) {
        listAccounts.add((Account) object);
    }

    @Override
    public void remove(Object object) {
        for (Account account : listAccounts) {
            if (account.check((Account) object)) {
                listAccounts.remove(account);
            }
        }
    }

    public void napTien(Account accounts, double soTien) {
        for (Account account : listAccounts) {
            if (account.check(accounts)) {
                account.setBalance(account.getBalance() + soTien);
            }
        }
    }

    @Override
    public Iterator<Account> search(Object object) {
        List<Account> lAccounts = new ArrayList<Account>();
        Iterator<Account> i = listAccounts.iterator();
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
        for (Account account : listAccounts) {
            System.out.println(account.toString());
        }
    }

    public List<Account> getList() {
        return listAccounts;
    }

    public void setList(List<Account> list) {
        this.listAccounts = list;
    }

}
