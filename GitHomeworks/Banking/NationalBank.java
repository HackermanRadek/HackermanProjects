import java.util.LinkedList;

public class NationalBank {

    private String name;

    private LinkedList<Bank> banks;

    public NationalBank(String name, LinkedList<Bank> banks1){

        this.name=name;
        this.banks=banks1;
    }

    @Override
    public String toString() {
        return "NationalBank{" +
                "name='" + name + '\'' +
                '}';
    }
    LinkedList<Bank> banksList = new LinkedList<>();
    public void registerBank(Bank banks1){

        if (!banksList.contains(banks1)) {
            banksList.add(banks1);
        }

    }

    public String getName(Bank banks1){
        return "Bank name: " + banks1.getName();
    }

}
