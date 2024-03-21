package lesson7;

public class Student {
    /**
     * 1 - переменные, или поля класса, или свойства
     * 2 - конструктор (особый метод который вызывается в момент создания объекта после слова new)
     * 3 - методы
     */
    private int age;
    private String fullName;
    private String adress;
    private String phoneNumber;

    public Student() {


    }

    public Student(int age, String fullName, String adress, String phoneNumber) {
        this.age = age;
        this.adress = adress;
        this. fullName = fullName;
        this.phoneNumber = phoneNumber;
    }

    public void setAge(int age) {
        //this -- обращение "я"
        this.age = age;

    }

    // узнать возраст
    public int getAge() {
        return age;
    }

}
