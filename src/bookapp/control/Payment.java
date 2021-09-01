package bookapp.control;

import bookapp.entity.*;

public class Payment {
    private QuanLy cart;
    private CustomerInfo customerInfo;

    public Payment(QuanLy cart, CustomerInfo customerInfo) {
        this.cart = cart;
        this.customerInfo = customerInfo;
    }

    public boolean thanhToan(Account account, QuanLy accountManage, QuanLy billManage) {

        boolean check = true;

        for (Object object : accountManage.getList()) {
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

    public QuanLy getCart() {
        return cart;
    }

    public void setCart(QuanLy cart) {
        this.cart = cart;
    }

    public CustomerInfo getCustomerInfo() {
        return customerInfo;
    }

    public void setCustomerInfo(CustomerInfo customerInfo) {
        this.customerInfo = customerInfo;
    }

}
