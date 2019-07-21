package HW.HW10;

import java.io.*;

public class App {
    public static void main(String[] args) {
        FileTestLogger fileTestLogger = new FileTestLogger();
        StdTestLogger stdTestLogger = new StdTestLogger();

        Human human = new Human(4);
        System.out.println(human);

        Cat cat = new Cat();
        cat.setHumanAge(human.getAge());
        fileTestLogger.createFile(fileTestLogger.log(cat.toString()));
        stdTestLogger.log(cat.toString());



        Dog dog = new Dog();
        dog.setHumanAge(human.getAge());
        fileTestLogger.createFile(fileTestLogger.log(dog.toString()));
        stdTestLogger.log(dog.toString());
    }
}