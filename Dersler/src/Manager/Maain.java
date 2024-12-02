package Manager;

public class Maain {

    public static void main(String[] args) {
        Employee employee =new Employee(50,"Coshqun",2023,"Kapital");
        Menegeer menegeer = new Menegeer(200,"Ilkin ",2022,"Kapital",5);
        Director director = new Director(500,"Sebuhi",2020,"Kapital",555);
        menegeer.work();
        director.work();
    }
}
