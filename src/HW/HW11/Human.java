package HW.HW11;

public class Human  {
    private int age;

    public Human(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String toString() {
        return "Human age is: " + getAge();
    }
}