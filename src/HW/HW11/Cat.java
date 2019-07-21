package HW.HW11;

public class Cat extends Pet {

    @Override
    public int calculateAge(int humanAge) {
        int catYear = 0;
        if (humanAge >=1){
            catYear = 15;
        }

        if (humanAge >=2){
            catYear = catYear + 9;
        }

        if (humanAge >=3){
            catYear = catYear + 4 * (humanAge - 2);
        }

        return catYear;
    }

    public String toString() {
        return "Cat age is: " + getAge();
    }
}