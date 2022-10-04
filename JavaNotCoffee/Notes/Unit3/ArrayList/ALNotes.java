import java.util.ArrayList;
import java.util.Scanner;

public class ALNotes{
    public static void main(String[] args) {
        // ArrayList newList1 = ArrayList<>();
        // Class<DataType> objName = new Constructor<DataType>();
        ArrayList<String> names = new ArrayList<String>();
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        //add
        names.add("Cracken");
        names.add("Zeus");
        names.add("Ares");
        names.add("Poseidon");

        //insert
        names.add(2, "Achilles");

        //remove
        names.remove("Zeus");

        //size or length
        names.size();

        //get
        System.out.println(names.get(2));

        System.out.println(names);

        //clear
        names.clear();

        //CRUD - Create,Read,Update,Delete
        System.out.println(names);
        additionCalculator();
    }
    public static void additionCalculator(){
        Scanner ui = new Scanner(System.in);
        System.out.println("Enter numbers you want to add.");
        ArrayList<Double> numbers = new ArrayList<Double>(); 
        double num = ui.nextDouble();
        while(num!=0.0){
            numbers.add(num);
            num = ui.nextDouble();
        }
        double total=0.00;
        for(int i=0;i<numbers.size();i++){
            System.out.println(numbers.get(i)+" ");
            total+=(numbers.get(i));
            
        System.out.printf("Your total is: %f\n",total);
        }
        ui.close();
    }
}

    