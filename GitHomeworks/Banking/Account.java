import java.math.BigDecimal;
import java.util.Map;
import java.util.Objects;

public class Account {

    private int accountNumber;


    public Account(int accountNumber){

        this.accountNumber=accountNumber;


    }

    @Override
    public String toString() {
        return "Account{" +
                "accountNumber=" + accountNumber +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return accountNumber == account.accountNumber;
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountNumber);
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void pay(BigDecimal sum){


        System.out.println("Account number: " + accountNumber + " ~~  Payment: " + sum);

    }

    public void withdraw(BigDecimal sum2){

        System.out.println("Account number: " + accountNumber + " ~~  Withdraw: " + sum2);

    }

}
