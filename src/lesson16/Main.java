package lesson16;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> text = new ArrayList<>();
        text.add("aaa");
        text.add("bbb");
        text.add("ccc");
        text.add("ddd");
        text.add("eee");

        Collections.sort(text, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        });

        System.out.println(text);
    }
}
