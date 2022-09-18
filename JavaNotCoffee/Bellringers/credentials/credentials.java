import java.util.Scanner;

public class credentials {
    public static void main(String[] args) {
    Scanner ui = new Scanner(System.in);
    System.out.print("Enter Username: ");
    String username = ui.nextLine();
    System.out.print("Enter Password: ");
    String password = ui.nextLine();

    System.out.println("username: " + username);
    System.out.println("password: " + password);

    ui.close();

    }
}