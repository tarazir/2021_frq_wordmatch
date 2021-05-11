/*
 Program by: Mr. Tarazi, ASK HS Technology teacher
 Date: 05/11/2021
 Objective: This question involves the WordMatch class, which stores a secret string and provides methods that compare
 other strings to the secret string.

 Question #1

*/

public class Main {

    public static void main(String[] args) {
	// write your code here

        // Please check the Test cases listed in the RFQ questions
        // Examples
        // "i" -> 4     "iss" -> 18     "issipp" -> 36      "mississippi" -> 121
        // "a" -> 4     "aa" -> 12      "aaa" -> 18         "aabb" -> 16        "c" -> 0

        WordMatch game1 = new WordMatch("aaaabb");
        System.out.println("Value of Score Guess -> " + game1.scoreGuess("aaa"));

        // Please check the Test cases listed in the RFQ questions
        // Examples
        // game.scoreGuess ("ten") -> 9     game.scoreGuess("nation") -> 36
        // game.scoreGuess("con) -> 9       game.scoreGuess("cat") -> 9
        WordMatch game2 = new WordMatch("concatenation");
        System.out.println("The Better Guess is -> " + game2.findBetterGuess("cat","en"));


    }
}
