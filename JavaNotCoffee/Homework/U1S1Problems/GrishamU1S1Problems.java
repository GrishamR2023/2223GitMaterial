import java.util.Scanner;

public class GrishamU1S1Problems {
    static void one() {
        System.out.println("MILES 2 KILOMETERS --- ");
        Scanner ui = new Scanner(System.in);
        System.out.print("Enter Miles: ");
        double name = ui.nextDouble();
        double total = name * 1.6;
        total = Math.round(total*100.0)/100.0;
        System.out.println(name + " miles is " + total + " kilometers.");
        ui.close();
    }
    static void two() {
        System.out.println("CALCULATE ENERGY --- ");
        Scanner ui = new Scanner(System.in);
        System.out.print("Enter the amount of water in kilograms: ");
        double water = ui.nextDouble();
        System.out.print("Enter the initial temperature: ");
        double starting = ui.nextDouble();
        System.out.print("Enter the final temperature: ");
        double ending = ui.nextDouble();

        double total = water * (ending - starting) * 4184;
        System.out.println("The energy needed is " + total + ".");
        ui.close();
    }



    
    static void three() {
        System.out.println("FUTURE INVESTMENTS --- ");
        Scanner ui = new Scanner(System.in);
        System.out.print("Enter investment amount: ");
        double ace = ui.nextDouble();
        System.out.print("Enter annual interest rate in percentage: ");
        double beta = ui.nextDouble();
        beta = (beta / 12 /100) +1;
        System.out.print("Enter number of years: ");
        double charlie = ui.nextDouble();

        double delta = Math.pow(beta, charlie);
        delta = Math.pow(beta, 12);
        double foxtrot = delta * ace;
        foxtrot = Math.round(foxtrot*100.0)/100.0;
        System.out.println("Future value is  $" + foxtrot + ".");
        ui.close();
    }




    static void four() {
        System.out.println("DRIVING COST --- ");
        Scanner ui = new Scanner(System.in);
        System.out.print("Enter the driving distance: ");
        double alpha = ui.nextDouble();
        System.out.print("Enter miles per gallon: ");
        double beta = ui.nextDouble();
        System.out.print("Enter price per gallon: ");
        double charlie = ui.nextDouble();
        
        
        double total = charlie / beta * alpha;
        total = Math.round(total*100.0)/100.0;
        System.out.println("The cost of driving is  $" + total + ".");
        ui.close();
    }
    public static void main(String[] args) { 
        one();
        two();
        three();
        four();
    }
}