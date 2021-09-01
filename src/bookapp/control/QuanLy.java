package bookapp.control;

import bookapp.entity.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class QuanLy {
    private List<Object> list;

    public QuanLy() {
        this.list = new ArrayList<Object>();
    }

    public void add(Object object) {
        list.add(object);
    }

    public void remove(Object object) {
        if (object instanceof Account) {
            for (Object account : list) {
                if (((Account) account).check((Account) object)) {
                    list.remove(account);
                }
            }
        } else {
            for (Object book : list) {
                if (((Book) book).check((Book) object)) {
                    list.remove(book);
                }
            }
        }
    }

    public Iterator<Object> search(Object object) {
        List<Object> lAccounts = new ArrayList<Object>();
        Iterator<Object> i = list.iterator();
        while (i.hasNext()) {
            if (object instanceof Account) {
                Account account = (Account) i.next();
                if (account.check((Account) object)) {
                    lAccounts.add(account);
                }
            } else {
                Book book = (Book) i.next();
                if (((Book) object).getTheLoai() == null) {
                    if (book.check((Book) object)) {
                        lAccounts.add(book);
                    }
                } else {
                    if (book.check(((Book) object).getTheLoai())) {
                        lAccounts.add(book);
                    }
                }
            }
        }
        return lAccounts.iterator();
    }

    public void inDS() {
        for (Object object : list) {
            if (object instanceof Account) {
                Account account = (Account) object;
                System.out.println(account.toString());
            } else if (object instanceof Bill) {
                ((Bill) object).inDS();
            } else {
                Book book = (Book) object;
                System.out.println(book.toString());
            }
        }
    }

    public List<Object> getList() {
        return list;
    }

}