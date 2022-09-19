public class Condish {
    public static void main(String[] args) {
        //conditional statements - booleans
        //bollean = True or False
        //boolean operators = AND & OR
        //python: True False => true false Capital letters typically mean a class
        /*
         * if (boolean expression){
         *      do statement
         * }
         * 
         * else if (boolean expression){
         *      do statement
         * }
         * else {
         *      do statement
         * }
         * 
         * if (boolean expression)
         *      do one line statement
         * 
         * 
         * switch(case):
         *      case __:
         *          do statement
         *          break;
         */

        //                  Conditional statements for numbers

        int a = 4;
        int b = 5;
        int c = 6;

        if(a == b){
            System.out.println("They're the same");
        }
        else if (a  == b && b == c){
            System.out.println("A is equal to C");
        }
        else if (a == b || b == c){
            System.out.println("Either a is equal to b or b is equal to c");
        }
        else if(a!=b){
            System.out.println("a is NOT equal to b");
        }
        else{
            System.out.println("nothing is equal to each other");
        }



        //                  String Conditional
        String name = "bob";
        String name1 = "bob";

        if(name == name1){
            System.out.println("They're the same name");
        }
        else{
            System.out.println("They are not the same");
        }



    }
}