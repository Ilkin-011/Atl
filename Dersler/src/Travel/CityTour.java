package Travel;

public class CityTour extends Tour{
    public boolean MOUNTAIN_ADVENTURE;
    public CityTour(int tourId, double price, Tur tour) {
        super(tourId, price, tour);
        this.MOUNTAIN_ADVENTURE = true;
    }
        @Override
        public void displayInfo() {
            System.out.println("Tur nömrəsi: " + getTourId()
                    + ", Tur qiyməti :" + getPrice() +
                    ", Əlavəsi:" +
                    (MOUNTAIN_ADVENTURE ? "Gezinti var ":" "));

    }
}
