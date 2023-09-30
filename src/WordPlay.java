import java.util.Random;
/**
 * WordPlayStudentOuputTests class - part of Control Flow
 * Advanced String manipulation tasks examples
 * @author Dr Suzy Atfieldcutts adapted from Melanie Coles
 * @since 2020
 */
public class WordPlay {

    /**
     * whatComesFirst()
     * takes too words as input and returns which word comes first alphabetically
     * @param wordOne   the first word
     * @param wordTwo   the second word
     * @return what word comes first
     */
    public String whatComesFirst(String wordOne, String wordTwo) {
        String result;
        wordOne = wordOne.toLowerCase(); //
        wordTwo = wordTwo.toLowerCase(); //
        if (wordOne.compareTo(wordTwo) < 0) { // if word one before word two
            result = wordOne + " comes before " + wordTwo + " in the alphabet";
        }
        else if (wordTwo.compareTo(wordOne) < 0) { // if word two is before word one
            result = wordTwo + " comes before " + wordOne + " in the alphabet";
        }
        else { // if both words are the same
            result = wordOne + " is the same as " + wordTwo;
        }
        return result;
    }

    /**
     * backwardsString()
     * takes a string and returns the string backwards
     * @param originalString    string to be reversed
     * @return reversed string
     */
    public String backwardsString(String originalString) {
        StringBuilder reversedString = new StringBuilder(originalString.length()); // making a modifiable array of characters
        for (int i = (originalString.length() - 1); i >= 0; i--){ // for each character in the string from end to start
            reversedString.append(originalString.charAt(i)); // append character to reversedString
        }
        return reversedString.toString();

    }

    /**
     * addressBook()
     * takes too arrays of names and phone numbers and returns them as a single array
     * @param names     array of names
     * @param phoneNumbers      array of phone numbers
     * @return names and phone numbers as a single array
     */
    public String[] addressBook(String[] names, String[] phoneNumbers) {
        String[]namesAndNumbers = new String[names.length];
        for (int i = 0; i < namesAndNumbers.length; i++) {
            namesAndNumbers[i] = names[i] + " " + phoneNumbers[i]; // combine name and phone number and put into array
        }
        return namesAndNumbers;
    }

    /**
     * rockPaperScissors()
     * user can play rock paper scissors against the computer and returns the result of the two choices.
     * @param guess     the user guess
     * @return the result of the game as a formatted string
     */
    public String rockPaperScissors(String guess) {
        String result;
        String[] choices = {"rock", "paper", "scissors"}; // array of choices
        Random randomNumberGenerator = new Random(); // random number generator
        String computerGuess = choices[randomNumberGenerator.nextInt(2)]; // randomly select computers choice from array using random number

        if (guess.equals(computerGuess)) { // if draw
            result = "USER:" + guess + " vs COMP:" + computerGuess + " it is a draw";
        }
        else if (guess.equals(choices[0]) && computerGuess.equals(choices[2])) { // if user picks rock and computer scissors
            result = "USER:" + guess + " vs COMP:" + computerGuess + " user wins";
        }
        else if (guess.equals(choices[1]) && computerGuess.equals(choices[0])) { // if user picks paper and computer picks rock
            result = "USER:" + guess + " vs COMP:" + computerGuess + " user wins";
        }
        else if (guess.equals(choices[2]) && computerGuess.equals(choices[1])) { // if user picks scissors and computer picks paper
            result = "USER:" + guess + " vs COMP:" + computerGuess + " user wins";
        }
        else { // if the user did not meet any of the other if statements the choice leads the computer winning
            result = "USER:" + guess + " vs COMP:" + computerGuess + " COMPUTER wins";
        }
        return result;
    }
}
