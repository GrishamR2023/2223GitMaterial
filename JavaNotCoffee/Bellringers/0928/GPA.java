import java.util.Scanner;

public class GPA{
    public static void main(String[] args) {
        int[] grades = {0,0,0,0,0};
        double total = 0;
        Scanner ui = new Scanner(System.in);
        for(int i=0;i<grades.length;i++){
            System.out.print("Enter Grade: ");
            grades[i] = ui.nextInt();
            if(grades[i]>=90){
                grades[i]=4;
            }
            else if(grades[i]>=80){
                grades[i]=3;
            }
            else if(grades[i]>=70){
                grades[i]=2;
            }
            else if(grades[i]>=60){
                grades[i]=1;
            }
            else{
                grades[i]=0;
            }
            total+= grades[i];
        }
        System.out.println(total);
        total = total/grades.length;
    
        System.out.println(total);

    }
}