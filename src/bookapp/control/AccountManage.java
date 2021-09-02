package bookapp.control;

import bookapp.entity.*;
import java.util.Iterator;

public class AccountManage extends QuanLy {

    public AccountManage() {
        add(new Account("admin", "password"));
    }

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

    public boolean napTien(double soTien, Account account) {
        if (!account.check(soTien)) {
            return false;
        }
        for (Object object : getList()) {

            if (account.check((Account) object)) {
                congTien((Account) object, soTien);
            }
        }

        return true;
    }

    public void xemSoDu(Account account) {
        for (Object object : getList()) {
            if (account.check((Account) object)) {
                System.out.printf("so du tai khoan la: " + ((Account) object).getBalance());

            }
        }

    }

    private void congTien(Account account, double soTien) {
        account.setBalance(account.getBalance() + soTien);
    }

    protected void truTien(Account account, double soTien) {
        account.setBalance(account.getBalance() - soTien);
    }
}