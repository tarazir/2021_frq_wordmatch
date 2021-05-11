public class WordMatch {

    private String secret;

    // Constructs a WordMatch object with the given secret string of lowercase letters
    public WordMatch (String word) {
        this.secret = word;
   }

    // Returns a score for guess, as described in part (a)
    public int scoreGuess (String guess) {

        // Count how many times the GUESS parameter appears in the SECRET word
        int count =0;
        for(int i = 0; i < secret.length(); i++)
        {
            // Variable J is used to count the Counter + length of GUESS length
            int j = i + guess.length();
            if(j <= secret.length() && secret.substring(i,j).equals(guess))
                count++;
        }
        return count * (guess.length() * guess.length());
   }

    // Method to calculate the Better Guess
    public String findBetterGuess(String guess1, String guess2)
    {
        // Return the values of the passing paramters
        if(scoreGuess(guess1) > scoreGuess(guess2))
            return guess1;
        if(scoreGuess(guess2) > scoreGuess(guess1))
            return guess2;

        // If paramters have equal values the alphabetic greater guess "con" is returned
            if(guess1.compareTo(guess2) > 0)
                return guess1;
            return guess2;
    }
}
