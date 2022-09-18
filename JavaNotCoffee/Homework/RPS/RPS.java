import java.util.List;
import java.util.Scanner;
import java.util.random.*;
import java.util.Random;


public class RPS{
    static void v1(){
        Scanner ui = new Scanner(System.in);
        String winner = "Null";
        //user1 inputs r,p,s
        System.out.println("User 1 enter r,p,s");
        String user1 = ui.nextLine();
        //user2 inputs r,p,s
        System.out.println("User 2 enter r,p,s");
        String user2 = ui.nextLine();
        //r beats s
        if(user1.equals("r") && user2.equals("s")){
            winner = user1;
        }
        else if(user2.equals("r") && user1.equals("s")){
            winner = user2;
        }
        //p beats r
        else if(user1.equals("p") && user2.equals("r")){
            winner = user1;
        }
        else if(user2.equals("p") && user1.equals("r")){
            winner = user2;
        }
        //s beats p
        else if(user1.equals("s") && user2.equals("p")){
            winner = user1;
        }
        else if(user2.equals("s") && user1.equals("p")){
            winner = user2;
        }
        //tie
        else if(user1.equals(user2)){
            winner = "null";
        }
        else{
            winner = "invalid";
        }
        //who won? or was it a tie?
        if(winner.equals(user1)){
            System.out.println("User 1 Wins!");
        }
        else if(winner.equals(user2)){
            System.out.println("User 2 Wins!");
        }
        else if(winner.equals("null")){
            System.out.println("Nobody Wins, Tie!");
        }
        else if(winner.equals("invalid")){
            System.out.println("Invalid Input, Try Again: ");
            v1();
        }
        //Close Out UI
        ui.close();
    }
    
    //version 2: PVC and C randomly throws r,p,s
    static void v2(){
        // 
        // https://www.delftstack.com/howto/java/java-random-character/#generate-random-character-from-a-string-using-random.nextint-and-charat
        Scanner ui = new Scanner(System.in);
        String winner = "Null";
        //user1 inputs r,p,s
        System.out.println("User 1 enter r,p,s");
        String user1 = ui.nextLine();
        //user2 inputs r,p,s
        Random random = new Random();
        String setOfCharacters = "rps";
        int randomInt = random.nextInt(setOfCharacters.length());
        char use = setOfCharacters.charAt(randomInt);
        String user2 = String.valueOf(use);
        System.out.println(user2);
        //r beats s
        if(user1.equals("r") && user2.equals("s")){
            winner = user1;
        }
        else if(user2.equals("r") && user1.equals("s")){
            winner = user2;
        }
        //p beats r
        else if(user1.equals("p") && user2.equals("r")){
            winner = user1;
        }
        else if(user2.equals("p") && user1.equals("r")){
            winner = user2;
        }
        //s beats p
        else if(user1.equals("s") && user2.equals("p")){
            winner = user1;
        }
        else if(user2.equals("s") && user1.equals("p")){
            winner = user2;
        }
        //tie
        else if(user1.equals(user2)){
            winner = "null";
        }
        else{
            winner = "invalid";
        }
        //who won? or was it a tie?
        if(winner.equals(user1)){
            System.out.println("User 1 Wins!");
        }
        else if(winner.equals(user2)){
            System.out.println("User 2 Wins!");
        }
        else if(winner.equals("null")){
            System.out.println("Nobody Wins, Tie!");
        }
        else if(winner.equals("invalid")){
            System.out.println("Invalid Input, Try Again: ");
            v2();
        }
        //Close Out UI
        ui.close();
    }
    //version 3: Main Menu
        /*
         *      Ask the user if they want PVP or PVC
         *      Depending on what they choose:
         *          run the PVC function or PVP function
         */
    static void v3(){
        Scanner ui = new Scanner(System.in);
        System.out.println("Would you like to play PVP or PVC");
        System.out.println("'PVC' or 'PVP'");
        String answer = ui.nextLine();
        answer = answer.toUpperCase();
        if(answer.equals("PVC")){
            v2();
        }
        else if(answer.equals("PVP")){
            v1();
        }
        else{
            v3();
        }
        ui.close();
    }

    //main
    public static void main(String[] args){
        v3();
    }
}