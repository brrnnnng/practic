package lesson10;

import java.util.Objects;

public class Student extends Object {
    private String fullName;
    private int age;
    private int scholarSip;

    public Student (){

    }
    public Student(String fullName, int age, int scholarSip) {
        this.fullName = fullName;
        this.age = age;
        this.scholarSip = scholarSip;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getScholarSip() {
        return scholarSip;
    }

    public void setScholarSip(int scholarSip) {
        this.scholarSip = scholarSip;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        if (age != student.age) return false;
        if (scholarSip != student.scholarSip) return false;
        return Objects.equals(fullName, student.fullName);
    }

    @Override
    public int hashCode() {
        int result = fullName != null ? fullName.hashCode() : 0;
        result = 31 * result + age;
        result = 31 * result + scholarSip;
        return result;
    }
}
