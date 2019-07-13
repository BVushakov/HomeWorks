package HW.HW9;

public class Dog extends Pet {

    @Override
    public int calculateAge(int humanAge) {
        int dogYear = 0;
        if (humanAge >=1){
            dogYear = 15;
        }

        if (humanAge >=2){
            dogYear = dogYear + 9;
        }

        if (humanAge >=3){
            dogYear = dogYear + 5 * (humanAge - 2);
        }
        return dogYear;
    }

    public String toString() {
        return "Dog age is: " + getAge();
    }
}
