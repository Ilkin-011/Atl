package Manager;
    public class Director extends Menegeer{
        public Director(int no, String name, int year, String department,double bonus) {
            super(no, name, year, department,bonus);
        }

        @Override
        public void work() {
            super.work();
        }

        @Override
        public double calculateSalary() {
            double managerSalary = super.calculateSalary();
            double employeeSalary =super.calculateSalary();
            return managerSalary + employeeSalary;

        }

        @Override
        public void createPlan(String plan) {
            super.createPlan(plan);
        }
    }

