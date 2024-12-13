package Curse;
import  java.time.LocalDate;
import java.time.Period;

public class Student {
    private String Name;
    private  LocalDate BirthDate;

    public String getName() {
        return Name;
    }

    public LocalDate getBirthDate() {
        return BirthDate;
    }

    public Student(String name, LocalDate birthDate) {
        this.Name = name;
        this.BirthDate = birthDate;
    }
    public int getAge() {
        LocalDate currentDate = LocalDate.now();
        Period period = Period.between(getBirthDate(), currentDate);
        return period.getYears();
    }

    @Override
    public String toString() {
        return  Name + " " + BirthDate;
    }
}
