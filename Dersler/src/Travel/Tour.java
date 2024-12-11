package Travel;

public class Tour {
    private int tourId;
    private String tourName;
    private double price;
    private boolean isReserved;
    private Tur tourtype;

    public Tour(int tourId, double price, Tur tourtype) {
        this.tourId = tourId;
        this.price = price;
        this.isReserved = true;
        this.tourtype = tourtype;
    }

    public int getTourId() {
        return tourId;
    }

    public void setTourId(int tourId) {
        this.tourId = tourId;
    }

    public String getTourName() {
        return tourName;
    }

    public void setTourName(String tourName) {
        this.tourName = tourName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isReserved() {
        return isReserved;
    }

    public void setReserved(boolean reserved) {
        isReserved = reserved;
    }

    public Tur getTourtype() {
        return tourtype;
    }

    public void setTourtype(Tur tourtype) {
        this.tourtype = tourtype;
    }

    @Override
    public String toString() {
        return "Tour{" +
                "tourId=" + tourId +
                '}';
    }

    public void displayInfo() {

    }

    public void TourTYpe() {
        System.out.println(" ");
    }

    public void Reserve() {
        if (isReserved) {
            isReserved = false;
            System.out.println("Turrezerv olundu " + tourId);
        } else {
            System.out.println("Tur reservdi !!");
        }
    }

    public void CancelReserve() {
        if (!isReserved) {
            isReserved = true;
            System.out.println("Sizin reserv leğv olundu");
        } else {
            System.out.println("Tur Reserv olunmayıb ");
        }
    }
}

