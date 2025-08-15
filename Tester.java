import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Tester
{
    public static void main(String[] args)
    {
        String myWord = "";
        ArrayList<String> words = new ArrayList<>();
        
        
        
        //use try-catch statement for any errors
        try
        {
            //read from the words10 file
            File file = new File("words10.txt");
            Scanner fileScanner = new Scanner(file);

            while (fileScanner.hasNextLine())
            {
                String line = fileScanner.nextLine().trim();
                // Find 10 letter word
                if (line.length() == 10)
                {
                    words.add(line);
                }
            }
            fileScanner.close();

            //create random words and sore them in an array
            Random rand = new Random();
            myWord = words.get(rand.nextInt(words.size()));
            

        } 
        catch (FileNotFoundException e)
        {
            System.out.println("Error!! File not found");
            
            return;
        }

        //Here we must create wrpper aobjects and store them in the array
        Wordload loader = new Wordload();
        
        MyArrayList<Wrapper> character = loader.loadWord(myWord);
        
        
        
        
        /* 
         Assignment 3 testing
        
        System.out.println("\nTesting Methods from Assignment 3");
        
        //Testing Task 4 Swap
        System.out.println("List before swap(1, 8): " + character);
        character.swap(1, 8);
        System.out.println("List after swap(1, 8): " + character);
        
        //Testing Task 5 Shuffle Word
        
        System.out.println("The list before shuffle: " + character);
        loader.shuffleWord(character);
        System.out.println("The list after shuffle: " + character);

        // Testing Task 6 Verify Word
        
        String correctGuess = myWord;
        System.out.println("Guessing the correct word: \"" + correctGuess + "\"");
        boolean isCorrect = character.verifyWord(correctGuess);
        System.out.println("Is the guess correct? " + isCorrect);
        System.out.println("List after correct guess: " + character);
        
        //Use invalid inputs to test the methods
        System.out.println("\nINVALID TESTS");
        
        // Test Task 4: Invalid Swap
        
        System.out.println("\nThe list before invalid swaps: " + character);
        System.out.println("\nTesting swap(-1, 3)...");
        character.swap(-1, 3);
        System.out.println("The list after invalid swap: " + character);
        
        System.out.println("\nTesting swap(0, 99)...");
        character.swap(0, 99);
        System.out.println("List after invalid swap: " + character);
        
    
        System.out.println("List before invalid guesses: " + character);
        
        // Testing null guesses
        isCorrect = character.verifyWord(null);
        System.out.println("Is the guess correct? " + isCorrect);
        
        // Test with guess of incorrect length
        isCorrect = character.verifyWord("colour");
        System.out.println("Is the guess correct? " + isCorrect);
        System.out.println("List after invalid guess: " + character);
        
        
        //show the user a hint
        System.out.println("\nGive a hint: ");
        
        int randomIndex2 = rand.nextInt(character.size());
        character.get(randomIndex2).setDisplayed(true);
        
        for (int i = 0; i < character.size(); i++)
        {
            System.out.print(character.get(i).toString());
        }
        System.out.println();
        
        //Show the user the final word
        System.out.println("\nShowing the word: \n");
        for (int i = 0; i < character.size(); i++)
        {
            //show the word
            character.get(i).setDisplayed(true);
            System.out.print(character.get(i).toString());
        }
        System.out.println();
        */
        
        
        
        //task 10 code
        final int MAX = 7;
        
        Scanner scan = new Scanner(System.in);
        String originalWord = myWord;
        
        int numGuessLeft = MAX;
        //Shuffle the word at the beginning of the game
        loader.shuffleWord(character);
        
        System.out.println("-------------------------------------\n");
        System.out.println("Welcometo the word shuffle game!!!!");
        System.out.println("-------------------------------------");
        System.out.println("\n");
        System.out.println("\nGuess the 10-letter word!");
        
        //use a while loop to loop the game 7 times
        while (numGuessLeft > 0) {
            //Display correctly guessed letters
            System.out.println("\nWord: " + character.toString());
        
            System.out.println("\nNumber of guesses left: " + numGuessLeft); 
            System.out.print("\nYour guess: ");
            String guess = scan.nextLine();
            
            //Check if the user has won
            if (guess.equalsIgnoreCase(originalWord)) {
                System.out.println("\nCONGRATULATIONS! You guessed the word: " + originalWord + "!");
                //When the player guessed the word correctly end the game
                break;
            }
            
            //cHECK IF THE GUESS IS A PERFECT MATCH
            boolean isGuessCorrect = character.verifyWord(guess);
            
            //check if the guess was incorrect
            if (!isGuessCorrect)
            {
                numGuessLeft--;
                System.out.println("Incorrect guess!");
                
                // Only give a hint if guesses are still available
                if (numGuessLeft > 0)
                {
                    System.out.println("Giving a hint...");
                    character.showHint();
                }
            }
            //Check for a win after an incorrect guess if enough letters have been revealed
            if (character.verifyWinner()) {
                System.out.println("\nCONGRATULATIONS! You guessed the word: " + originalWord + "!");
                break;
            }
        }
        
        //The game must end after 7 incorrect guesses
        if (numGuessLeft == 0)
        {
            System.out.println("\nGAME OVER!!!");
            System.out.println("The word was: " + originalWord);
        }
        
        scan.close();
        
        
        

        
    }
}
