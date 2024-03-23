package lesson14;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(2);
        a.add(3);
        a.add(4);
        a.add(5);

        LinkedList<Integer> b = new LinkedList<>();
        b.add(4);
        b.add(5);
        b.add(6);
        b.add(7);

        CollectionUtils utils = new ColltctionUtilsImpl();
        Collection<Integer> unionResult = utils.union(a,b);
        System.out.println(unionResult);

        Collection<Integer> intersectionResult = utils.intersection(a,b);
        System.out.println(intersectionResult);

        Collection<Integer> unionWithoutDuplicateResult = utils.unionWithoutDuplicate(a,b);
        System.out.println(unionWithoutDuplicateResult);

        Collection<Integer> intersectionWithoutDuplicateResult = utils.intersectionWithoutDuplicate(a,b);
        System.out.println(intersectionWithoutDuplicateResult);

        Collection<Integer> differenceResult = utils.difference(a,b);
        System.out.println(differenceResult);
    }
}
