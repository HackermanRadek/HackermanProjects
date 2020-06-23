import java.util.LinkedList;

public enum DayOfWeek {
    MON("Poniedziałek", "Monday", true),
    TUE("Wtorek", "Tuesday", true),
    WED("Środa", "Wednesday", true),
    THU("Czwartek", "Thursday", true),
    FRI("Piątek", "Friday", true),
    SAT("Sobota", "Saturday", false),
    SUN("Niedziela", "Sunday", false);

    private String polishName;
    private String englishName;
    private boolean workingDay;


    DayOfWeek(String polishName, String englishName, boolean workingDay) {
        this.polishName = polishName;
        this.englishName = englishName;
        this.workingDay = workingDay;
    }

    public boolean isWorkingDay() {
        return workingDay;
    }

    public String getEnglishName() {
        return englishName;
    }

    public String getPolishName() {
        return polishName;
    }

    public static DayOfWeek fromPolishName(String polish) {
        for (DayOfWeek dayOfWeek : values()) {
            if (dayOfWeek.polishName.equalsIgnoreCase(polish)) {
                return dayOfWeek;
            }
        }

        throw new IllegalArgumentException("There is no day with \"" + polish + "\" polish name");

    }

    public static DayOfWeek fromEnglishName(String english) {
        for (DayOfWeek dayOfWeek : values()) {
            if (dayOfWeek.englishName.equalsIgnoreCase(english)) {
                return dayOfWeek;
            }
        }

        throw new IllegalArgumentException("There is no day with \"" + english + "\" english name");

    }

    public static LinkedList getWorkingDays() {

        LinkedList workingDays = new LinkedList();

        for (DayOfWeek dayOfWeek : values()) {
            if (dayOfWeek.workingDay) {
                workingDays.add(dayOfWeek);

            }
        }
            return workingDays;

    }

    public static LinkedList getWeekends(){

        LinkedList weekends =new LinkedList();

        for (DayOfWeek dayOfWeek: values()){

            if (!dayOfWeek.workingDay){
                weekends.add(dayOfWeek);
            }
        }
        return weekends;
    }


    public static boolean isItWeekend(DayOfWeek dayOfWeek){

        if (dayOfWeek.workingDay){
            return false;
        }else {
            return true;
        }


    }


}