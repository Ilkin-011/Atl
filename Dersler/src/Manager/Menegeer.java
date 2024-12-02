package Manager;

public class Menegeer extends Employee{
        public String departmentManaged;
        public static final int MANAGEMENT_PAYMENT =5000;
        public double bonus;

        public Menegeer(int no, String name, int year, String department,double bonus) {
            super(no, name, year, department);
            this.bonus = bonus;
        }

    @Override
    public void work() {
        System.out.println(name + " işə başlayıb: " + year + " ilde " + department + " " + departmentManaged + "Aldigi maas: " + calculateSalary() + " AZN" + " bonus: " + this.bonus + " toplam maas: " + (calculateSalary() + this.bonus));
    }

    @Override
    public double calculateSalary() {
        double employeeSalary =  super.calculateSalary();
        return MANAGEMENT_PAYMENT+employeeSalary;
    }
    public  void createPlan(String plan ){
        System.out.println(this.name + " " + plan);
    }
}

