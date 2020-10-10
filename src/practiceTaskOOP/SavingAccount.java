package practiceTaskOOP;

class SavingsAccount {
    private static double annualInterestRate = 0.055;
    private double savingsBalance;

    public SavingsAccount(double savingsBalance) {
        this.savingsBalance = savingsBalance;
    }

    public static void modifyInterestRate(double annualInterestRate) {
        SavingsAccount.annualInterestRate = annualInterestRate;
    }

    public static void main(String[] args) {
        SavingsAccount saver1 = new SavingsAccount(2000.00);
        SavingsAccount saver2 = new SavingsAccount(3000.00);
        //saver1.modifyInterestRate(0.04);
        SavingsAccount.modifyInterestRate(0.04);
        System.out.println("Old value: " + saver1.getSavingsBalance());
        double mi1 = saver1.calculateMonthlyInterest();
        saver1.setSavingsBalance(saver1.getSavingsBalance() + mi1);
        System.out.println("New value: " + saver1.getSavingsBalance());

        System.out.println("Old value: " + saver2.getSavingsBalance());
        double mi2 = saver2.calculateMonthlyInterest();
        saver2.setSavingsBalance(saver2.getSavingsBalance() + mi2);
        System.out.println("New value: " + saver2.getSavingsBalance());
        System.out.println();

        SavingsAccount.modifyInterestRate(0.05);
        saver1.setSavingsBalance(2000);
        System.out.println("Old value: " + saver1.getSavingsBalance());
        mi1 = saver1.calculateMonthlyInterest();
        saver1.setSavingsBalance(saver1.getSavingsBalance() + mi1);
        System.out.println("New value: " + saver1.getSavingsBalance());

        saver2.setSavingsBalance(3000);
        System.out.println("Old value: " + saver2.getSavingsBalance());
        mi2 = saver2.calculateMonthlyInterest();
        saver2.setSavingsBalance(saver2.getSavingsBalance() + mi2);
        System.out.println("New value: " + saver2.getSavingsBalance());
    }

    public double calculateMonthlyInterest() {
        double mi = (savingsBalance * annualInterestRate) / 12.0;
        return mi;
    }

    public double getSavingsBalance() {
        return savingsBalance;
    }

    public void setSavingsBalance(double savingsBalance) {
        this.savingsBalance = savingsBalance;
    }
}