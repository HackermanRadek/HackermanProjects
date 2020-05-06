import java.time.LocalDate;

public class Student extends Person {
    private String faculty;
    private int graduateYear;


    public Student(String firstName, String lastName, LocalDate birthDate, int graduateYear,String faculty) {
        super(firstName, lastName, birthDate);
        this.faculty=faculty;
        this.graduateYear=graduateYear;

    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public int getGraduateYear() {
        return graduateYear;
    }

    public void setGraduateYear(int graduateYear) {
        this.graduateYear = graduateYear;
    }

    @Override
    public void setFirstName(String firstName) {
        super.setFirstName(firstName);
    }

    @Override
    public void setLastName(String lastName) {
          super.setLastName(lastName);
    }

    @Override
    public void setBirthDate(LocalDate birthDate) {
        super.setBirthDate(birthDate);
    }

    @Override
    public String getFirstName() {
        return super.getFirstName();
    }

    @Override
    public String getLastName() {
        return super.getLastName();
    }

    @Override
    public LocalDate getBirthDate() {
        return super.getBirthDate();
    }
}
