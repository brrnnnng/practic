package lesson7;

public class Main1 {
    public static void main(String[] args) {
        //формула создания объекта определенного типа

        // вызов конструктора (особый метод который вызывается после слова new)
        Student vasya = new Student();
        Student petya = new Student();
        vasya.setAge(27);
        petya.setAge(23);

        System.out.println(vasya.getAge());
        System.out.println(petya.getAge());
    }
}
