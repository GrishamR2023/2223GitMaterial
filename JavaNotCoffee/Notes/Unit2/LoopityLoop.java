import java.util.Scanner;


public class LoopityLoop {
    public static void main(String[] args) {
        //while conditional statement
        //while (boolean expression == true)
        // while(true){
        //     System.out.println("HI");
        //      DO SOMETHING
        // }

        //while loops are recursive conditional statements
        //keeps happening UNTIL a coniditon is met
        // if(i==9){
        //     System.out.println(i);
        // }

        //print out the numbers 1 through 10
        // int i = 0;
        // while(i<=9){
        //     if(i == 9){
        //         System.out.print(i);    
        //     }
        //     else{
        //         System.out.print(i+",");
        //     }
            
        //     i++;
        // }

        // System.out.println();

        // //print 0-9
        // //for(some var;boolean expression;step)
        // for(int g=0;g<=9;g++){
        //     if(g == 9){
        //         System.out.print(g);    
        //     }
        //     else{
        //         System.out.print(g+",");
        //     }
        // }


        //for i in range(#):
        //for item in list:



        //create a f(x) that takes in user input until they type in 01
        //after they type in -1, output the min and max value they entered
            minMaxChecker();
        }

            private static void minMaxChecker(){
                int max=Integer.MIN_VALUE;
                int min=Integer.MAX_VALUE;
                Scanner ui = new Scanner(System.in);
                System.out.println("Enter numbers, when finished, enter -1 ---");
                int num = ui.nextInt();
                while(num != 0){
                    if(num < min){
                        min = num;
                    }
                    if(num > max){
                        max = num;
                    }
                    num = ui.nextInt();
                }
                System.out.println("Min - " + min);
                System.out.println("Max - " + max);
                ui.close();
    }
}