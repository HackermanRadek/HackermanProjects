import java.math.BigDecimal;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class BankTester {


    public static void main(String[] args) {

        Account first = new Account(2020);
        Account second = new Account(1999);
        Account third = new Account(1337);
        Account fourth = new Account(1709);


        Map<Integer, Account> accounts = new HashMap<>();

        accounts.put(1, first);
        accounts.put(2,second);
        accounts.put(3,third);
        accounts.put(4,fourth);


        third.pay(BigDecimal.valueOf(10));
        first.withdraw(BigDecimal.valueOf(1000));

        LinkedList<Bank> banks = new LinkedList<>();





        Bank pko = new Bank("PKO BP", accounts);
        pko.addAccount(first);


        Bank ing = new Bank("ING Bank", accounts);
        ing.addAccount(second);

        Bank alior = new Bank("Alior Bank", accounts);
        alior.addAccount(third);


        Bank mBank = new Bank("mBank", accounts);
        mBank.addAccount(fourth);


        NationalBank nationalBank = new NationalBank("National Bank", banks);


        nationalBank.registerBank(pko);
        nationalBank.registerBank(alior);
        nationalBank.registerBank(ing);
        nationalBank.registerBank(mBank);

        System.out.println(nationalBank.toString());

    }

}
