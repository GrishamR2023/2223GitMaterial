import java.util.Scanner;

public class FunctionPractice {

    public static void main(String[] args){
        //static method
        //Python ClassName.method()
        addTwoNumbers();
        addTwoNumbers(2,2);
        addTwoNumbers(1.25,1.5);

        //if print is static method
        //PrintFunctions.print("howdy");

        //PrintFunctions pf = new PrintFunctions();
        //pf.print("howdy");


    }

    //@staticmethod
    //signature of the method
    //private => only this class can access
    //static => no need for an object of the class to be instantiated
    //void => means no return data
    private static void addTwoNumbers() {
        Scanner ui = new Scanner(System.in);
        System.out.println("Enter the first number you want to add:  ");
        double a = ui.nextDouble();
        System.out.println("Enter the second number you want to add:  ");
        double b = ui.nextDouble();

        System.out.printf("%2.2f%n",(a+b));
        ui.close();
    }

    // def addTwoNumbers(a,b):
    private static void addTwoNumbers(double a, double b){
        //a and b are local variables
        System.out.printf("%2.2f%n",(a+b));
    }

    private static void addTwoNumbers(int a, int b){
        //a and b are local variables
        System.out.printf("%2.2f%n",(a+b));
    }


    //you can have as many methods as you want
    //  as long as the signature is different

    

}


