import java.util.LinkedList;

public enum DayOfWeek {MON("Poniedziałek", "Monday", true),
    TUE("Wtorek", "Tuesday", true),
    WED("Środa", "Wednesday", true),
    THU("Czwartek" , "Thursday", true),
    FRI("Piątek", "Friday", true),
    SAT("Sobota", "Saturday", false),
    SUN("Niedziela", "Sunday", false);

    private String polishName;
    private String englishName;
    private boolean workingDay;



    DayOfWeek(String polishName, String englishName, boolean workingDay){
        this.polishName = polishName;
        this.englishName = englishName;
        this.workingDay = workingDay;
    }

    public boolean isWorkingDay() {
        return workingDay;
    }

    public void setWorkingDay(boolean workingDay) {
        this.workingDay = workingDay;
    }

    public String getEnglishName() {
        return englishName;
    }

    public void setEnglishName(String englishName) {
        this.englishName = englishName;
    }

    public String getPolishName() {
        return polishName;
    }

    public void setPolishName(String polishName) {
        this.polishName = polishName;
    }

   public static void fromPolishName(DayOfWeek dayOfWeek){

       System.out.println(dayOfWeek.polishName);

   }

   public static void fromEnglishName(DayOfWeek dayOfWeek){


       System.out.println(dayOfWeek.englishName);

   }

 public static boolean isItWeekend(DayOfWeek dayOfWeek){

        if (dayOfWeek.workingDay){
            System.out.println("Its not weekend");
        }else {
            System.out.println("Its weekend!");
        }

        return false;
    }

        private static LinkedList<String> workingDays = new LinkedList<String>();
    public static void getWorkingDays(){



        System.out.println("Working days: " + workingDays);

    }

        private static LinkedList<String> weekendDays = new LinkedList<String>();

    public static void getWeekends(){

        System.out.println("Weekend: " + weekendDays);
    }



    public static void main(String[] args) {

        weekendDays.add(SAT.englishName);
        weekendDays.add(SUN.englishName);


        workingDays.add(MON.englishName);
        workingDays.add(TUE.englishName);
        workingDays.add(WED.englishName);
        workingDays.add(THU.englishName);
        workingDays.add(FRI.englishName);

    fromPolishName(MON);
    fromEnglishName(SAT);
    isItWeekend(THU);
    isItWeekend(SUN);

    getWorkingDays();
    getWeekends();

    }



}
