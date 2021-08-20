package app;

import java.util.Iterator;
import app.interfaces.Manage;

public class Login {
    public static boolean singIn(Account account1, Manage accountManage) {
        Iterator<Account> i = accountManage.getList().iterator();
        while (i.hasNext()) {
            Account account = i.next();
            if (account.check(account1)) {
                return true;
            }
        }
        return false;
    }

    public static void signUp(Account account, Manage acountManage) {
        acountManage.add(account);
    }

}
