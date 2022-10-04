import java.util.ArrayList;
import java.util.Scanner;

public class Inventory {
    public static void main(String[] args) {
        //manage an inventory
        //  you can add, insert, remove, replace, clear the db
        //  quit -> ends the program
        ArrayList<String> iceCreamList = new ArrayList<String>();

        Scanner ui = new Scanner(System.in);
        String input="";
        while(!input.equals("q")){
            System.out.println(iceCreamList);
            System.out.println("Would you like to (a)dd, (i)nsert, (r)emove, Re(p)lace, (c)lear or (q)uit?");
            input = ui.nextLine();

            if(input.equals("a")){
                System.out.print("What flavor? ");
                input = ui.nextLine();
                iceCreamList.add(input);
            }

            else if(input.equals("i")){
                System.out.print("What Index? ");
                Integer input1 = ui.nextInt();
                System.out.print("What Flavor? ");
                String input2 = ui.next();
                iceCreamList.add(input1,input2);
                System.out.println(iceCreamList);

            }

            else if(input.equals("r")){
                System.out.print("What Item to remove?");
                input = ui.next();
                iceCreamList.remove(input);
                System.out.println(iceCreamList);
            }

            else if(input.equals("p")){
                System.out.print("What index to replace?");
                Integer input2 = ui.nextInt();
                System.out.print("What to replace with?");
                input = ui.next();
                iceCreamList.set(input2, input);
                System.out.println(iceCreamList);
            }

            else if(input.equals("c")){
                iceCreamList.clear();
            }



        }
    }
}