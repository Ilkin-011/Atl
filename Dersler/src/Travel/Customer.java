package Travel;

import java.util.List;

public class Customer {
    private int customerId;
    private List<Tour> reserveTours;

    public Customer(int customerId, List<Tour> tours) {
        this.customerId = customerId;
        this.reserveTours = tours;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public List<Tour> getTours() {
        return reserveTours;
    }

    public void setTours(List<Tour> tours) {
        this.reserveTours = tours;

    }

    public void reserveTour(Tour tour) {
        if (!tour.isReserved()) {
            tour.Reserve();
            reserveTours.add(tour);
            System.out.println("Tur " + tour.getTourName() + " has added siyahi ");
        } else {
            System.out.println("Tur reserv olunub artiq");
        }
    }

    public void cancelReserve(Tour tour) {
        if (reserveTours.contains(tour)) {
            tour.CancelReserve();
            reserveTours.remove(tour);
            System.out.println("Tur " + tour.getTourName() + "siyahidan ayrildi");
        } else {
            System.out.println("Artiq reserv legv olub");
        }
    }
}
