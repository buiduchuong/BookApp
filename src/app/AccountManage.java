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

    public boolean napTien(double soTien, Account account) {
        if (soTien < 50000) {
            return false;
        }
        for (Object object : list) {

            if (account.check((Account) object)) {
                ((Account) object).setBalance(((Account) object).getBalance() + account.congTien(soTien));
            }
        }
        return true;
    }

    public boolean thanhToan(QuanLy cart, Account account) {
        boolean check = true;

        for (Object object : list) {
            if (account.check((Account) object)) {

                if (((Cart) cart).tongTien() > ((Account) object).getBalance()) {
                    check = false;
                } else {
                    ((Account) object).setBalance(((Account) object).getBalance() - ((Cart) cart).tongTien());
                }

            }
        }
        return check;
    }

    public void xemSoDu(Account account) {
        for (Object object : list) {
            if (account.check((Account) object)) {
                System.out.println("so du tai khoan la: " + ((Account) object).getBalance());

            }
        }

    }
}