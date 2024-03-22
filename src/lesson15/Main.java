package lesson15;

import com.sun.source.tree.Tree;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet<String> set = new TreeSet<>();
        set.add("aaa");
        set.add("bbb");
        set.add("ccc");
        set.add("ddd");
        set.add("ddd");


        for (String s : set) {
            System.out.println(s);
        }
        for (Iterator<String> iterator = set.iterator();iterator.hasNext(); ){
            System.out.println(iterator.next());
        }
    }
}
