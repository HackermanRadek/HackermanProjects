import java.util.LinkedList;

public class EnumDemko {

    public static void main(String[] args) {
        System.out.println(DayOfWeek.fromPolishName("poniedziałek"));
        System.out.println(DayOfWeek.fromPolishName("sobota"));
        System.out.println(DayOfWeek.fromEnglishName("friday"));

        System.out.println(DayOfWeek.getWorkingDays());
        System.out.println(DayOfWeek.getWeekends());
        System.out.println(DayOfWeek.isItWeekend(DayOfWeek.FRI));
        System.out.println(DayOfWeek.isItWeekend(DayOfWeek.SAT));

    }
}
