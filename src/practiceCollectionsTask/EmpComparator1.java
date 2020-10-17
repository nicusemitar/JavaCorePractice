package practiceCollectionsTask;

import java.util.Comparator;

public class EmpComparator1 implements Comparator<Emp> {
    @Override
    public int compare(Emp e1, Emp e2) {
        return (e1.getSalary() - e2.getSalary());
    }
}
