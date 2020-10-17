package practiceCollectionsTask;

import java.util.*;

class Emp implements Comparable<Emp> {

    private int id;
    private String firstName;
    private String lastName;
    private int salary;

    public Emp(int id, String firstName, String lastName, int salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public Emp(Emp e) {
        this.id = e.id;
        this.firstName = e.firstName;
        this.lastName = e.lastName;
        this.salary = e.salary;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getName() {
        return firstName + " " + lastName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "{id : " + id + ", name: " + getName() + ", salary: " + salary + "}";
    }

    // sortare dupa nume
    @Override
    public int compareTo(Emp e) {
        return getName().compareTo(e.getName());
    }
}

public class FirstAndSecondTask {
    public static void main(String[] args) {
        //1
//        List<Integer> listMerge1 = new ArrayList<>(Arrays.asList(1, 3, 5, 7, 10, 12));
//        List<Integer> listMerge2 = new ArrayList<>(Arrays.asList(1, 8, 5, 9, 14, 12));
//        Set<Integer> set = new TreeSet<>(listMerge1);
//        set.addAll(listMerge2);
//        List<Integer> combinedList = new ArrayList<>(set);
//        System.out.println(combinedList);

        //2
        List<Emp> list1 = new ArrayList<Emp>();
        list1.add(new Emp(12434, "Travolta", "Kevin", 3670));
        list1.add(new Emp(132334, "Boateng", "Nicola", 5200));
        list1.add(new Emp(23456, "Vanea", "Alex", 1800));
        list1.add(new Emp(33456, "Gica", "Ioana", 1801));

        System.out.println("Please enter one of the criteria: " + "\n" +
                "ID to sort by ID, \nNAME to sort by NAME, \nSALASC to sort by ascending salary," +
                "\nSALDESC to sort by decreasing salary.");
        Scanner scn = new Scanner(System.in);
        String crit = scn.next();
        boolean bsort = true;

        if (crit.equals("NAME")) {
            Collections.sort(list1);

        } else if (crit.equals("SALASC")) {
            list1.sort(new EmpComparator1());
        }

//         Clasa anonima
        else if (crit.equals("SALDESC")) {
            list1.sort(new Comparator<Emp>() {
                @Override
                public int compare(Emp o1, Emp o2) {
                    return -(o1.getSalary() - o2.getSalary());
                }
            });
        }

//        Expresie Leambda
        else if (crit.equals("ID")) {
            list1.sort((e1, e2) -> (e1.getId() - e2.getId()));
        } else {
            bsort = false;
        }
        if (bsort) {
            for (Emp e : list1) {
                System.out.print(e + " " + "\n");
            }
            System.out.println();
        } else
            System.out.println("Unknown criterion: " + crit + "\nTry: ID | NAME | SALASC | SALDESC");
    }
}
