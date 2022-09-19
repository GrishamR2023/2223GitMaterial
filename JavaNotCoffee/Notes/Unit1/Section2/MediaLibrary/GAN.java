import java.util.Random;
import java.util.Scanner;
import java.util.random.*;

public class GAN{
    public static void main(String[] args){
        //Guess the number!
        Random rand = new Random();
        int secretNumber = rand.nextInt(0,11);



        Scanner ui = new Scanner(System.in);
        System.out.print("Enter Guess: ");
        int guess = ui.nextInt();

        while (guess!=secretNumber){
            if(guess > secretNumber){
                System.out.println("Too High!");
            }
            if(guess < secretNumber){
                System.out.println("Too Low!");
            }
            System.out.print("Enter Guess: ");
            guess = ui.nextInt();
        }
        System.out.println("You win!");
    
                //ask the user for a number between 0-10
        



        //if number is equal to number
        //  print you win
        //if number is < secret number
        // print too low
        //if number is > secret number
        // print too high


    }
}