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

// clasa Comparator pentru comparatie dupa alte criterrii: Comparator<T>
// dupa salariu
class EmpComparator1 implements Comparator<Emp> {
    @Override
    public int compare(Emp e1, Emp e2) {
        return (e1.getSalary() - e2.getSalary());
    }
}

// dupa id
class EmpComparator2 implements Comparator<Emp> {
    @Override
    public int compare(Emp e1, Emp e2) {
        return (e1.getId() - e2.getId());
    }
}

public class FirstAndSecondTask {
    public static void main(String[] args) {
        //1
        List<Integer> listMerge1 = new ArrayList<>(Arrays.asList(1, 3, 5, 7, 10, 12));
        List<Integer> listMerge2 = new ArrayList<>(Arrays.asList(1, 8, 5, 9, 14, 12));
        Set<Integer> set = new TreeSet<>(listMerge1);
        set.addAll(listMerge2);
        List<Integer> combinedList = new ArrayList<>(set);
        System.out.println(combinedList);

        // As well a algorithm for First Task
//        List<Integer> l1 = new ArrayList(Arrays.asList(2, 1, 4, 3, 7, 5));
//        List<Integer> l2 = new ArrayList(Arrays.asList(10, 1, 11, 3, 13, 5));
        // rezultatul asteptatat: 1 2 3 4 5 7 10 11 13
        // le sortam
//        Collections.sort(l1);
//        Collections.sort(l2);
        // merged list
//        List<Integer> l3 = new ArrayList();
//        // algoritmul de interclasare
//        int i1 = 0, i2 = 0;
//        int v1 = 0, v2 = 0;
//        while (true) {
//            v1 = l1.get(i1);
//            v2 = l2.get(i2);
//            while (v1 < v2) {
//                l3.add(v1);
//                i1++;
//                if (i1 < l1.size())
//                    v1 = l1.get(i1);
//                else
//                    break;
//            }
//            if (i1 == l1.size())
//                break;
//            if (v1 == v2) {
//                l3.add(v1);
//                i1++;
//                i2++;
//                if (i1 < l1.size())
//                    v1 = l1.get(i1);
//                else
//                    break;
//                if (i2 < l2.size())
//                    v2 = l2.get(i2);
//                else
//                    break;
//            }
//            while (v2 < v1) {
//                l3.add(v2);
//                i2++;
//                if (i2 < l2.size())
//                    v2 = l2.get(i2);
//                else
//                    break;
//            }
//            if (i2 == l2.size())
//                break;
//            if (v1 == v2) {
//                l3.add(v2);
//                i1++;
//                i2++;
//                if (i1 < l1.size())
//                    v1 = l1.get(i1);
//                else
//                    break;
//                if (i2 < l2.size())
//                    v2 = l2.get(i2);
//                else
//                    break;
//            }
//        }
//        while (i1 < l1.size()) {
//            v1 = l1.get(i1);
//            l3.add(v1);
//            i1++;
//        }
//        while (i2 < l2.size()) {
//            v2 = l2.get(i2);
//            l3.add(v2);
//            i2++;
//        }
//        for (int ival : l3) {
//            System.out.print(ival + " ");
//        }
//        System.out.println();

        //2
        List<Emp> list1 = new ArrayList<Emp>();
        list1.add(new Emp(12434, "Travolta", "Kevin", 3670));
        list1.add(new Emp(132334, "Boateng", "Nicola", 5200));
        list1.add(new Emp(23456, "Vanea", "Alex", 1800));
        list1.add(new Emp(33456, "Gica", "Ioana", 1801));

        Collections.sort(list1);
        for (Emp eName : list1) {
            System.out.printf(eName + "%n ");
        }
        System.out.println();

//        Collections.sort(list1, new EmpComparator1());
        list1.sort(new EmpComparator1());
        for (Emp eSalaryAsc : list1) {
            System.out.printf(eSalaryAsc + "%n ");
        }
        System.out.println();

        list1.sort(new Comparator<Emp>() {
            @Override
            public int compare(Emp o1, Emp o2) {
                return -(o1.getSalary() - o2.getSalary());
            }
        });
        for (Emp eSalaryDesc : list1) {
            System.out.printf(eSalaryDesc + "%n ");
        }
        System.out.println();

//        list1.sort(new EmpComparator2());
        list1.sort((e1, e2) -> (e1.getId() - e2.getId()));
        for (Emp eID : list1) {
            System.out.printf(eID + "%n ");
        }
    }
}
