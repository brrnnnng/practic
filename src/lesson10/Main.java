package lesson10;

public class Main {
    public static void main(String[] args) {
        Student natasha = new Student("Головина Наташа", 23, 5000);
        Student vasya = new Student("Головина Наташа", 23, 5000);

        System.out.println(natasha.equals(vasya));
    }

}
