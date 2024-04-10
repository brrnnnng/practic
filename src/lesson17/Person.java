package lesson17;

public class Person {
    private String name;
    private int age;

    public void setAge(int age) throws AgeException{
        if (age < 0) {
            throw new AgeException("Возраст не может быть отрицательным");
        }
        if (age > 150) {
            throw new AgeException("Возраст не может быть более 150");
        }
        this.age = age;
    }
}
