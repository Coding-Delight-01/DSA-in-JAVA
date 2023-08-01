
/**
 * Write a description of class TestClass here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
public class Test
{

    public static void main(String arg[])
    {
        Scanner in = new Scanner(System.in);   

        String defaultWord = "bytes";
        MyArrayList<Character> guessWord = new MyArrayList<>();
        MyArrayList<Character> userResult = new MyArrayList<>();

        String userWord, fileWord;
        File f1=new File("input.txt");   
        Boolean valid = false;
        
        // create an array of the default word
        for(int i = 0; i < defaultWord.length(); i++)
        {
            guessWord.add(i, defaultWord.charAt(i));
        }
        
        System.out.println("***WELCOME TO WORDLE***");
        System.out.println("Key to the results: \nC - letter is correct & in correct position \nN - letter is corrrect but not in the correct position \nI - letter is not in the word");
        
        for(int x = 0; x < 5; x++)
        {
            System.out.println("\nGuess the five-letter word: ");
            userWord = in.nextLine().toLowerCase();

            if(userWord.length() == 5) //Check if word entered is a 5 letter word.
            {
                try
                {
                    //Open the file to read the words in the list.
                    FileReader fr = new FileReader(f1);
                    BufferedReader br = new BufferedReader(fr);

                    while((fileWord = br.readLine())!=null)
                    {
                        if(fileWord.equals(userWord))//check if the word entered is in the list
                        {
                            valid = true;

                        }
                    }

                    if(valid)
                    {
                        userResult = guessWord.checkChar(userWord);
                    }

                    fr.close();
                }
                catch(IOException e) 
                {
                    System.out.println("File Read Error");
                } 
            }
            else 
            {
                valid = false;
            }

            if(valid == true)
            {
                System.out.println("\nThe entered word is a valid 5 letter word: " + userWord); 
            }
            else
            {
                System.out.println("\nThe entered word is an invalid 5 letter word, please try again: " + userWord); 
            }

            if(valid)
            {
                //display results
                System.out.println("\n***THE RESULTS***");
                System.out.println(userResult);
                
                // display feedback
                if(userResult.checkWin())
                {
                    System.out.println("\nẄow you won! You guessed the correct word which is: " + defaultWord);
                    break;
                }
                else
                {
                    System.out.println("\nOh sorry the word is incorrect! Try again");
                }
            }
            valid = false;
        }
    }  

}
