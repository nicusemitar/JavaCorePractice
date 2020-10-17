package practiceCollectionsTask;

import java.util.Comparator;

public class EmpComparator2 implements Comparator<Emp> {
    @Override
    public int compare(Emp e1, Emp e2) {
        return (e1.getId() - e2.getId());
    }
}
