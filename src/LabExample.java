import java.util.Random;
/**
 * LabExample class - part of Control Flow
 * Selection and Iteration examples
 * @author Dr Suzy Atfieldcutts adapted from Melanie Coles
 * @since 2020
 */
public class LabExample {

    /**
     * highestOfTwo()
     * works out which number out of two is the biggest
     * @param numOne    first number
     * @param numTwo    second number
     * @return highest of the two numbers
     */
    public int highestOfTwo(int numOne, int numTwo){
        int higherNumber;
        if (numOne < numTwo) {
            higherNumber = numTwo;
        }
        else if (numTwo < numOne) {
            higherNumber = numOne;
        }
        else {
            higherNumber = -1;
        }
        return  higherNumber;
    }

    /**
     * calculateGrade()
     * works out the grade from an inputted mark
     * @param mark  inputted mark
     * @return grade
     */
    public String calculateGrade(int mark) {
        String grade;
        if (mark < 0 || mark > 100) {
            grade = "Invalid mark";
        }
        else if (mark >= 70) {
            grade = "1st";
        }
        else if (mark < 70 && mark > 60) {
            grade = "2i";
        }
        else if (mark < 60 && mark > 50) {
            grade = "2ii";
        }
        else if (mark < 50 && mark > 40) {
            grade = "3rd";
        }
        else {
            grade = "Fail";
        }
        return grade;
    }

    /**
     * headsOrTails()
     * outputs if the inputted choice matches the randomly generated choice
     * @param choice    inputted choice
     * @return result of the game
     */
    public String headsOrTails(String choice) {
        String result;
        Random randomNumberGenerator = new Random();
        String[] headsTails = {"heads", "tails"}; // choices
        int number = randomNumberGenerator.nextInt(2); // generating random number
        if (headsTails[number].equals(choice)) { // if computer choice equals inputted guess
            result = "Correct: you guessed " + choice + " and I flipped " + headsTails[number];
        }
        else {
            result = "Incorrect: you guessed " + choice + " and I flipped " + headsTails[number];
        }
        return result;
    }

    /**
     * sumFromOneToWhat()
     * calculates the sum from one to an inputted number
     * @param top   number to sum to
     * @return total sum of numbers
     */
    public int sumFromOneToWhat(int top) {
        int total = 0;
        for (int i = 1; i <= top; i++) {
            total += i;
        }
        return total;

    }

    /**
     * sumFromWhatToWhat()
     * calculates the sum from an inputted number to another inputted number
     * @param startingNum   number to start summing from
     * @param topNum    number to sum to
     * @return total sum of numbers
     */
    public int sumFromWhatToWhat(int startingNum, int topNum) {
        int total = 0;
        for (int i = startingNum; i <= topNum; i++) {
            total += i;
        }
        return total;
    }
}
