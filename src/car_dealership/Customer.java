package car_dealership;

public class Customer {
    private String name;
    private String address;
    private double cashOnHand;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getCashOnHand() {
        return cashOnHand;
    }

    public void setCashOnHand(double cashOnHand) {
        this.cashOnHand = cashOnHand;
    }

    public void purchaseVehicle(Vehicle vehicle, Employee emp, Employee payment, BankFinance finance) {
        emp.handleCustomer(Customer.this, payment, vehicle, finance);

    }


}
