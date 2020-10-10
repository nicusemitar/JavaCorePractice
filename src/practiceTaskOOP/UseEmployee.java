package practiceTaskOOP;

public class UseEmployee {
    public static void main(String[] args) {
        //6
        Employee employee = new Employee(9.5, 170);
        System.out.println(employee.getTariffPerHour());
        System.out.println(employee.getSalary());
        //7
        Manager m = new Manager(9.5, 170);
        System.out.println(m.getTariffPerHour());
        System.out.println(m.getSalary());

    }
}
