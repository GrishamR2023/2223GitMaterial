import java.lang.Math;
public class StringLoops{
    public static void main(String[] args) {
        //Examples of Loops utilize with Strings
        //Sequence Data -> Strings, Array, List, ArrayList

        //count the number of char in a String
        howMany("GIGGLING","g");


        spaceReplacer("This  sentence.  has.  double  spaces.  !");


        removeVowels("banana");


        //brute force a password
        passwordCrack("123456");


    }

    private static void howMany(String s, String v){
        //find and count v in s 
        int count=0;

        v=v;
        for(int i=0; i<s.length(); i++){
            //substring returns a portion of the string      s[4:7]
            //substring(i,i+1) -> means the current letter
            if(s.toUpperCase().substring(i,i+1).equals(v.toUpperCase())){
                count++;
            }
        }

        System.out.println(count);
    }

    private static void spaceReplacer(String s){
        String one = s.replace("  "," ");
        System.out.println(one);
    }

    private static void removeVowels(String s){
        //aeiou and sometimes y
        //make sure that sometimes or 50% of the time, it removes y
        String one = s.replace("a","");
        one = one.replace("e","");
        one = one.replace("i","");
        one = one.replace("o","");
        one = one.replace("u","");
        double test = Math.random();
        if(test<=.5){
            one = one.replace("y","");
        }
        System.out.println(one);
    }

    //think about tweaking this so taht you can incoroporate letters...
    private static void passwordCrack(String p){
        String guess = "";
        int count = 0;
        while(!guess.equals(p)){
            coun++;
            guess=String.valueOf(count);
        }
            System.out.println("Found it!");
    }
}