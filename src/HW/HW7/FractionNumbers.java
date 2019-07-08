package HW.HW7;

/** 7 */
public class FractionNumbers {

    private int numerator;
    private int denominator;


    public FractionNumbers(int numr, int denr) {
        numerator = numr;
        denominator = denr;
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }


    public FractionNumbers plus (FractionNumbers fractionTwo) {
        int numer = (numerator * fractionTwo.getDenominator()) +
                (fractionTwo.getNumerator() * denominator);
        int denr = denominator * fractionTwo.getDenominator();
        return new FractionNumbers(numer, denr);
    }

    public FractionNumbers minus (FractionNumbers fractionTwo) {
        int newNumerator = (numerator * fractionTwo.denominator) - (fractionTwo.numerator * denominator);
        int newDenominator = denominator * fractionTwo.denominator;
        FractionNumbers result = new FractionNumbers(newNumerator, newDenominator);
        return result;
    }

    public FractionNumbers multiply(FractionNumbers fractionTwo) {
        int newNumerator = numerator * fractionTwo.numerator;
        int newDenominator = denominator * fractionTwo.denominator;
        FractionNumbers result = new FractionNumbers(newNumerator, newDenominator);
        return result;
    }

    public FractionNumbers divide(FractionNumbers fractionTwo) {
        int newNumerator = numerator * fractionTwo.getDenominator();
        int newDenominator = denominator * fractionTwo.numerator;
        FractionNumbers result = new FractionNumbers(newNumerator, newDenominator);
        return result;
    }

    @Override
    public String toString() {
        return this.numerator + "/" + this.denominator;
    }
}