package HW.HW9;

/**
 I have a cat and a dog.
 I got them at the same time as kitten/puppy. That was humanYears years ago. Calculate their respective ages now.
 NOTES:
 humanYears >= 1
 humanYears are whole numbers only Cat Years
 15 cat years for first year
 +9 cat years for second year
 +4 cat years for each year after that
 Dog Years
 15 dog years for first year
 +9 dog years for second year
 +5 dog years for each year after that
 EXAMPLE output: HumanYears: 4 CatYears: 32 DogYears: 34
 */

public class Human {
    private int age;

    public Human (int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String toString() {
        return "Human age is: " + getAge();
    }
}
