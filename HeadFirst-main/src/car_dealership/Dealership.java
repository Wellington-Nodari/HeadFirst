package car_dealership;

public class Dealership {

    public static void main (String[] args) {

        Customer custOne = new Customer();
        custOne.setName("Nodari");
        custOne.setAddress("Ireland");
        custOne.setCashOnHand(7000.00);

        Vehicle carOne = new Vehicle();
        carOne.setCarModel("i20");
        carOne.setCarYear("2023");
        carOne.setCarPrice(25000.00);

        Employee empOne = new Employee();
        empOne.setEmpName("Karl");
        empOne.setIsFinance(false);
        empOne.setMonthsRepay(36);

        BankFinance finance = new BankFinance();

        custOne.purchaseVehicle(carOne, empOne, empOne,finance);
    }
}
