import java.util.Scanner;
import java.util.Random;
import java.lang.Math;

public class BasicMathQuiz {
    public static void main(String[] args) {
        Scanner ui = new Scanner(System.in);
        Random rand = new Random();
        int points = 0;
        //          (cast to int)(random decimal * 100) 0-100
        int num1 = (int)(Math.random()*100);
        int num2 = rand.nextInt(100)+1; //1-100
        double answer = 0.0;
        double input = 0.0;
        int streak = 0;

        //loop the program 10 times
        while(streak < 8){
            for(int g=1;g<=10;g++){
                //generate a math expression
                int signNumber = rand.nextInt(4);
                if(signNumber==0){
                    System.out.printf("What is %d / %d? ",num1,num2);
                    answer = (double)num1/num2;
                }
                else if(signNumber==1){
                    System.out.printf("What is %d * %d? ",num1,num2);
                    answer = (double)num1*num2;
                }
                else if(signNumber==2){
                    System.out.printf("What is %d + %d? ",num1,num2);
                    answer = (double)num1+num2;
                }
                else{
                    System.out.printf("What is %d - %d? ",num1,num2);
                    answer = (double)num1-num2;
                }
                System.out.println("Be sure to round to the nearest 4th decimal.");
                answer = Math.round(answer * 100.0) / 100.0;
                //check to see if the user answered the expression correctly
                input = ui.nextDouble();
                input = Math.round(input * 100.0) / 100.0;
                System.out.println(input);
                if(input==answer){
                    System.out.println("Great job! That's correct.");
                    points+=1;
                    streak += 1;
                }
                else{
                    System.out.println("WRONG! THE ANSWER WAS " + String.format("%.2f", answer));
                    streak -= 1;
                }
                num1 = (int)(Math.random()*100);
                num2 = rand.nextInt(100)+1; //1-100
            }
            if(streak < 8){
                System.out.println("Your score was " + points + " out of 10. That is not 80%. Try again.");
                points = 0;
                streak = 0;

            }
            else{
                System.out.println("Your score was " + points + " out of 10. Good job, that is at least 80%!!!");
            }
        }
        ui.close();
    }
}