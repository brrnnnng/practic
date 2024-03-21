package lesson2;

public class Main2 {
    public static void main(String[] args) {

        int a = 5;
        int b = 5;
        int c = 5;

        if (a == b && b == c && c == a) {
            System.out.println("Это равносторонний треугольник");
        } else if (a != b && b != c && c != a) {
            System.out.println("Это разносторонний треугольник");
        } else if ((a == b && b != c && c != a) || (a != b && b != c && c == a) || (a != b && b == c && c != a)) {
            System.out.println("Это равнобедренный треугольник");
        }
    }
}
