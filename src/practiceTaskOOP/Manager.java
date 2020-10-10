package practiceTaskOOP;

public class Manager extends Employee {
    public Manager(double tariffPerHour, int hours) {
        super(tariffPerHour, hours);
    }

    @Override
    public double getSalary() {
        return 1.5 * tariffPerHour * hours;
    }

}
