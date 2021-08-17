package app;

public class Account {
    private String account, password;
    private double balance;

    public Account() {

    }

    public Account(String account, String password, double balance) {
        this.account = account;
        this.password = password;
        this.balance = 0;
    }

    public boolean check(Account account) {
        if (account.getAccount().equals(this.account)) {
            return true;
        } else {
            return false;
        }
    }
    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

}
