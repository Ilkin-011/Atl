package Manager;

public class Employee {
    public int no;
    public String name;
    public int year;
    public String department;
    public static final int BASE_SALARY = 500;
    public void work(){
        System.out.println(name + "işə başlayıb: " + year + " ildə " + department + " şöbəsində çalışır. " + "aldığı maaş : " + calculateSalary());
    }

    public Employee(int no, String name, int year, String department) {
        this.no = no;
        this.name = name;
        this.year = year;
        this.department = department;
    }
    public double calculateSalary(){
        int yersWork = 2024 -this.year;
        return yersWork*BASE_SALARY;
    }


}

