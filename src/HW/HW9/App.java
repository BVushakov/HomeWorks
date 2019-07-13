package HW.HW9;

public class App {
    public static void main(String[] args) {
        Human human = new Human(4);
        System.out.println(human);

        Cat cat = new Cat();
        cat.setHumanAge(human.getAge());
        System.out.println(cat);

        Dog dog = new Dog();
        dog.setHumanAge(human.getAge());
        System.out.println(dog);
    }
}
