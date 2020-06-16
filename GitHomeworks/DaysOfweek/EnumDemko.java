import java.util.LinkedList;

public class EnumDemko {

    public static void main(String[] args) {
        System.out.println(DayOfWeek.fromPolishName("poniedziałek"));
        System.out.println(DayOfWeek.fromPolishName("sobota"));
        System.out.println(DayOfWeek.fromEnglishName("friday"));


        DayOfWeek saturday = DayOfWeek.SAT;
        DayOfWeek monday = DayOfWeek.MON;
        DayOfWeek tue = DayOfWeek.TUE;
        DayOfWeek wed = DayOfWeek.WED;
        DayOfWeek thu = DayOfWeek.THU;
        DayOfWeek fri = DayOfWeek.FRI;
        DayOfWeek sun = DayOfWeek.SUN;


        System.out.println(monday.workingDay());
        System.out.println(saturday.workingDay());





    }
}
