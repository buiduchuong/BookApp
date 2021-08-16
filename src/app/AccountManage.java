package app;

import java.util.ArrayList;
import java.util.List;

public class AccountManage {
    List<Account> list;

    public AccountManage() {
        list = new ArrayList<Account>();
    }

    public void addAccount(Account account) {
        list.add(account);
    }
}
