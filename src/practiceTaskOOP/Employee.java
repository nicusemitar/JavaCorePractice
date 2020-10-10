package practiceTaskOOP;

//6
public class Employee {
    public int hours;
    //private double tariffPerHour = 5.5;
    protected double tariffPerHour;

    Employee(double tariffPerHour, int hours) {
        this.tariffPerHour = tariffPerHour;
        this.hours = hours;
    }

    public double getTariffPerHour() {
        return tariffPerHour;
    }

    public double getSalary() {
        return tariffPerHour * hours;
    }
}