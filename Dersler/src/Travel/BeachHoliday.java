package Travel;

public class BeachHoliday extends Tour{
    public boolean Pool;
    public BeachHoliday(int tourId, double price, Enumm tour) {
        super(tourId, price, tour);
        this.Pool=true;
    }
    @Override
    public void displayInfo() {
        System.out.println("Tur nömrəsi: " + getTourId()
                + ", Tur qiyməti :" + getPrice() +
                ", əlavəsi:" +
                (Pool ? "Tək hovuzludur" : "Cüt hovuzludur"));
    }
}
