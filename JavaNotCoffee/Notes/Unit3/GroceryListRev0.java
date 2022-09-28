import java.util.Scanner;


public class GroceryListRev0{
    public static void main(String[] args) {
        //Boild a grocery list
        Scanner ui = new Scanner(System.in);
        int howmany = ui.nextInt();
        // String[] groceryList = {}; no no, length of 0
        //define a n empty array, need to define the length
        String[] groceryList = new String[howmany];
        
        for(int i=0;i<groceryList.length;i++){
            System.out.print("Add an item: ");
            groceryList[i]=ui.next();
        }
        printHorizontalArray(groceryList);
    }
    

    private static void printArray(String[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }

    private static void printHorizontalArray(String[] arr){
        for(int i=0;i<arr.length;i++){
            if(i+1 == arr.length){
                System.out.print(arr[i]);
            }
            else{
                System.out.print(arr[i]+", ");
            }
            
        }
    }
}