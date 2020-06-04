import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Objects;

public class Bank{


    private String name;
    private Map accountsMap;



    public Bank(String name, Map<Integer, Account> accountMap1){

        this.accountsMap=accountMap1;

    }

    @Override
    public String toString() {
        return "Bank{" +
                "name='" + name + '\'' +
                ", accountsMap=" + accountsMap +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bank bank = (Bank) o;
        return Objects.equals(name, bank.name) &&
                Objects.equals(accountsMap, bank.accountsMap);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, accountsMap);
    }

    public Map getAccountsMap() {
        return accountsMap;
    }

    public void setAccountsMap(Map accountsMap) {
        this.accountsMap = accountsMap;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

        Map<Integer, Account> accMap = new HashMap<>();
    public void addAccount(Account accountMap1){

        if (!accMap.containsValue(accountMap1)) {
            accMap.put(0,accountMap1);
        }
    }

        public void getAccountNR(){

        }


}
