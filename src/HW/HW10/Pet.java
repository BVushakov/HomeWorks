package HW.HW10;

public class Pet {
    private int humanAge;

    public int calculateAge(int humanAge) {
        return humanAge;
    }

    public int getAge() {
        return calculateAge(humanAge);
    }

    public void setHumanAge(int humanAge) {
        this.humanAge = humanAge;
    }
}