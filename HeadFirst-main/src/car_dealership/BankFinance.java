package car_dealership;

public class BankFinance {
    private double financeAmount;
    private double interestRate;

    public double getFinanceAmount() {
        return financeAmount;
    }

    public void setFinanceAmount(double financeAmount) {
        this.financeAmount = financeAmount;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public void runFinanceApproval(Customer cust, Vehicle car, Employee emp) {
        if (emp.getIsFinance() == true) {
            setInterestRate(emp, car, cust);
        } else {
            System.out.println("Nothing to approve!");
        }
    }

    public void setInterestRate(Employee emp, Vehicle car, Customer cust) {
        int month = emp.getMonthsRepay();
        if(month > 36) {
            System.out.println("Finance NOT APPROVED!\nTimeframe selected exceeds 36 months.");
        } else if(month > 24) {
            this.setInterestRate(0.066);
            this.settingDetails(emp, car, cust);
        } else if(month > 12) {
            this.setInterestRate(0.055);
            this.settingDetails(emp, car, cust);
        } else if(month == 12) {
            this.setInterestRate(0.045);
            this.settingDetails(emp, car, cust);
        } else {
            System.out.println("Finance NOT APPROVED!\nTimeframe selected must be 12 months or more.");
        }
    }

    public void settingDetails(Employee emp, Vehicle car, Customer cust) {
        double loanAmount = car.getCarPrice() - cust.getCashOnHand();
        double fA = (loanAmount + (loanAmount * this.getInterestRate()));
        this.setFinanceAmount(fA);
        double amountMonthlyRepayment = this.getFinanceAmount() / emp.getMonthsRepay();
        System.out.println("Finance Approved.");
        System.out.println("Amount to finance: " + loanAmount);
        System.out.println(emp.getMonthsRepay() + " months long");
        System.out.println("Monthly amount repayment of: " + amountMonthlyRepayment);
        System.out.println("Interest Rate of: " + (this.getInterestRate()*100));
        System.out.println("Total saldo: " + this.getFinanceAmount());
    }
}
