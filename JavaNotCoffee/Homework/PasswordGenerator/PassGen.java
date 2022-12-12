import java.util.Scanner;
import java.util.Random;
public class PassGen{
    public static void gen(){
        Scanner ui = new Scanner(System.in);
        System.out.println("How many characters do you want?");
        int chars = ui.nextInt();
        System.out.println("How many numbers do you want?");
        int numbs = ui.nextInt();
        System.out.println("How many special characters do you want?");
        int specs = ui.nextInt();
        
        String specialCharacters = "! @$%^&*()_-+={[}]|:;'<,>.?";
        Random r = new Random();
        char c = (char)(r.nextInt(26) + 'a');
        String s = "";
        int n = 0;
        String total = "";
        String finalPass = "";
        for(int i=0;i<chars;i++){
            c = (char)(r.nextInt(26) + 'a');
            total = total+c;
        }
        System.out.println();
        for(int i=0;i<numbs;i++){
            s = String.valueOf((r.nextInt(10)));
            total = total+s;
        }
        System.out.println();
        for(int i=0;i<specs;i++){
            n = r.nextInt(specialCharacters.length());
            total = total+String.valueOf(specialCharacters.charAt(n));
        }
        System.out.println(total);
        String placeHolder = total;
        System.out.println("Test");;
        for(int i=0;i<total.length();i++){
            if(String.valueOf(total.charAt(i)).equals("{")){
                System.out.println(i);
            }
        }
        
        for(int i=0;i<placeHolder.length();i++){
            n = r.nextInt(total.length());
            finalPass = finalPass+String.valueOf(total.charAt(n));
            total=total.substring(0, n)+total.substring(n+1, total.length());
            System.out.println(total);
            System.out.println(finalPass);
        }

    }




//Iterate through big one, 























    public static void main(String[] args) {
        gen();
    }
}