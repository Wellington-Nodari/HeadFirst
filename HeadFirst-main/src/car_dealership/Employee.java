package car_dealership;

public class Employee {
    private String empName;
    private boolean isFinance;
    private int monthsRepay;

    public boolean getIsFinance() {
        return isFinance;
    }

    public void setIsFinance(boolean isFinance) {
        this.isFinance = isFinance;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public int getMonthsRepay() {
        return monthsRepay;
    }

    public void setMonthsRepay(int monthsRepay) {
        this.monthsRepay = monthsRepay;
    }

    public void handleCustomer (Customer cust, Employee emp, Vehicle car, BankFinance finance) {
        double financeThreshold = car.getCarPrice() / 10;
        if (cust.getCashOnHand() >= car.getCarPrice()) {
            this.setIsFinance(false);
            processTransaction(cust, car);
        } else if (cust.getCashOnHand() > financeThreshold)  {
            this.setIsFinance(true);
            runCreditHistory(finance, cust, emp, car);
        } else {
            System.out.println("Ask customer to bring more money!");
        }
    }

    public void runCreditHistory (BankFinance finance,Customer cust, Employee emp, Vehicle car) {
        finance.runFinanceApproval(cust, car, emp);
    }

    public void processTransaction (Customer cust, Vehicle car) {
        System.out.println("Mr(s)." + cust.getName() + " congratulations, you got a new " + car.getCarModel() + " for the price of €" + car.getCarPrice());
    }
}
