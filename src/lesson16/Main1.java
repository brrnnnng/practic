package lesson16;

public class Main1 {
    public static void main(String[] args) {
        Holodilnik holodilnik = new Holodilnik();
        holodilnik.addProduct("Яблоко", 2000);
        holodilnik.addProduct("Яблоко", 200);
        holodilnik.addProduct("Апельсин", 220);
        holodilnik.addProduct("Киви", 100);


        holodilnik.printAllProducts();

        System.out.println("------");

        holodilnik.takeProduct("Яблоко",300);

        System.out.println("------");

        holodilnik.printAllProducts2();

        System.out.println("------");

        holodilnik.firstEndProduct();

        System.out.println("------");

        holodilnik.totalWeight();

        System.out.println("------");

        holodilnik.sortedByName();

        System.out.println("------");

        holodilnik.sortedByValue();
    }
}
