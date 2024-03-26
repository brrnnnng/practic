package lesson15;

import java.util.Comparator;
import java.util.HashSet;
import java.util.TreeSet;

public class Main1 {
    public static void main(String[] args) {
        Coin coin = new Coin(4, 1999, "stil", 2.3);
        Coin coin2 = new Coin(4, 1999, "stil", 2.3);
        Coin coin3 = new Coin(5, 1997, "serebro", 2.4);
        Coin coin4 = new Coin(6, 1996, "alumin", 2.2);
        Coin coin5 = new Coin(3, 1995, "olovo", 2.6);

        TreeSet<Coin> coins = new TreeSet<>();
        coins.add(coin);
        coins.add(coin2);
        coins.add(coin3);
        coins.add(coin4);
        coins.add(coin5);

        System.out.println("по наминалу");

        for (Coin c : coins) {
            System.out.println(c);
        }

        System.out.println("по году");

        TreeSet<Coin> sortingByYear = new TreeSet<>(new SortByYearComporator());
        sortingByYear.addAll(coins);

        for (Coin c : sortingByYear) {
            System.out.println(c);
        }

        System.out.println("в обратном порядке");

        TreeSet<Coin> reverse = new TreeSet<>(new Comparator<Coin>() {
            @Override
            public int compare(Coin o1, Coin o2) {
                if (o1.getYear() != o2.getYear()) {
                    return o2.getYear() - o1.getYear();
                }
                if (!o1.getMetall().equals(o2.getMetall())) {
                    return o2.getMetall().compareTo(o1.getMetall());
                }
                if (o1.getNominal() != o2.getNominal()) {
                    return o2.getNominal() - o1.getNominal();
                }

                return Double.compare(o2.getDiametr(), o1.getDiametr());
            }
        });

        reverse.addAll(coins);

        for (Coin c : reverse) {
            System.out.println(c);
        }
    }
}
