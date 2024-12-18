package Stream;

import java.util.Objects;

public class Customer {
    private String name;
    private Integer debt;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getDebt() {
        return (int) debt;
    }

    public void setDebt(Integer debt) {
        this.debt = debt;
    }

    public Customer(String name, Integer debt) {
        this.name = name;
        this.debt = debt;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", debt=" + debt +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return Objects.equals(name, customer.name) && Objects.equals(debt, customer.debt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, debt);
    }
}

