package Travel;

import java.util.List;

public class TravelAgency {
    private String agencyName;
    private List<Customer>customers;
    private List<Tour> tours;

    public TravelAgency(String agencyName, List<Customer> customers) {
        this.agencyName = agencyName;
        this.customers = customers;
    }
    public String getAgencyName() {
        return agencyName;
    }
    public void setAgencyName(String agencyName) {
        this.agencyName = agencyName;
    }
    public List<Customer> getCustomers() {
        return customers;
    }
    public void setCustomers(List<Customer> customers) {
        this.customers = customers;
    }

    public void addTour(Tour tour) {
        if (!tour.isReserved()) {
            tour.Reserve();
            System.out.println("Tur " + tour.getTourName() + " has added siyahi ");
        } else {
            System.out.println("Tur reserv olunub artiq");
        }
    }
    public void deleteTour(Tour tour){

    }
    public void plusTour(Tour tour){

    }

    public void displayInfo(){

    }
    public void addCustomer(Customer customer){

    }
}
