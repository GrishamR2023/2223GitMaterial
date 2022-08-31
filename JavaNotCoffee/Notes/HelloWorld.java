// single line comment
/* 
    Block comment 
*/

/*
 * Main Class you are runnning
 *      public = public so the JVM can access the file
 *      class = define that the following code is in a class
 *      ClassName = MUST FOLLOW: First letter capitalized
 *                     AND Same name as the file name
 *                     AND Numbers are at the end of the file
 */
public class HelloWorld {
    //If this is where the program starts, you need the following method
    public static void main(String[] args) {    
        System.out.println("Hello World");   
        System.out.print("Howdy");
        System.out.println(12345.6789);             // x whole numbers and 2 decimals       
        System.out.printf("%2.2f%n", 12345.6789);   // 2 values and 2 decimals
        System.out.printf("%5.2f%n", 12345.6789);   // 5 values and 2 decimals
        System.out.printf("%10.2f%n", 12345.6789);  // 10 values and 2 decimals
    }
}


/*
 * def functionName():
 *      do something
 *      return something
 */

/*
 * Delete entire line -> shift+del
 * Delete entire word -> ctrl+del
 * Highlight word -> ctrl+shift+arrowkey
 * Reformat -> ctrl+a then ctr+k then ctrl+f
 */