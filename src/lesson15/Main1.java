package lesson15;

import java.util.HashSet;
import java.util.TreeSet;

public class Main1 {
    public static void main(String[] args) {
        Coin coin = new Coin(4,1999,"stil",2.3);
        Coin coin2 = new Coin(4,1999,"stil",2.3);
        Coin coin3 = new Coin(5,1997,"serebro",2.4);
        Coin coin4 = new Coin(6,1996,"alumin",2.2);
        Coin coin5 = new Coin(3,1995,"olovo",2.6);

        TreeSet<Coin> coins =new TreeSet<>();
        coins.add(coin);
        coins.add(coin2);
        coins.add(coin3);
        coins.add(coin4);
        coins.add(coin5);

        for (Coin c: coins){
            System.out.println(c);
        }

    }
}
