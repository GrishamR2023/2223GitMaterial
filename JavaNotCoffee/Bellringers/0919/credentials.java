import java.util.Scanner;

public class credentials {
    public static void main(String[] args) {
    Scanner ui = new Scanner(System.in);
    System.out.print("Enter Username: ");
    String username = ui.nextLine();
    System.out.print("Enter Password: ");
    String password = ui.nextLine();


    if(username.equals("admin") && password.equals("admin")){
        System.out.println("Access Granted! Welcome, " + username + ".");
    }
    else{
        System.out.println("Access Denied - Credentials Incorrect.");
    }

    ui.close();

    }
}