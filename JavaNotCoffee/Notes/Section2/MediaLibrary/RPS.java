import java.util.Scanner;

public class RPS {
    public static void main(String[] args) {
        Scanner ui = new Scanner(System.in);
        System.out.print("Player 1 --- r,p,s? ");
        String user1 = ui.nextLine();
        System.out.print("Player 2 --- r,p,s? ");
        String user2 = ui.nextLine();

        if(user1.equals(user2)){
            System.out.println("Tie!");
        }
        if(user1.equals("r") && user2.equals("p")){
            System.out.println("User 2 Wins!");
        }
        if(user1.equals("p") && user2.equals("r")){
            System.out.println("User 1 Wins!");
        }

    }
}