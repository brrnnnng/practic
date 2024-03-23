package lesson14;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class ColltctionUtilsImpl implements CollectionUtils{


    @Override
    public Collection<Integer> union(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        ArrayList<Integer> result = new ArrayList<>();
        result.addAll(a);
        result.addAll(b);
        return result;
    }

    @Override
    public Collection<Integer> intersection(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        ArrayList<Integer> result = new ArrayList<>();

        for (Integer numFromA : a){
            if (b.contains(numFromA)){
                result.add(numFromA);
            }
        }
        for (Integer numFromB : b){
            if (a.contains(numFromB)){
                result.add(numFromB);
            }
        }
        return result;
    }

    @Override
    public Set<Integer> unionWithoutDuplicate(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        Set<Integer> result = new HashSet<>();
        result.addAll(a);
        result.addAll(b);

        return result;
    }

    @Override
    public Set<Integer> intersectionWithoutDuplicate(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        Set<Integer> result = new HashSet<>();

        for (Integer numFromA : a){
            if (b.contains(numFromA)){
                result.add(numFromA);
            }
        }
        for (Integer numFromB : b){
            if (a.contains(numFromB)){
                result.add(numFromB);
            }
        }
        return result;
    }

    @Override
    public Collection<Integer> difference(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
       ArrayList<Integer> result = new ArrayList<>(a);

       result.removeAll(b);
        return result;
    }
}
