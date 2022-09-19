public class StringNotes {
     public static void main(String[] args) {
          //python 
          //name = "bob"
          String name = "bob";          //literal assignment
          String name2 = new String("bob");  //class assignment or constructor

          int age =0;  //i is not capitalized
          String ages="0"; //S is capitalized

          System.out.println(name +"\t"+ ages);
          System.out.println(name.concat("\t".concat(ages)));       
          System.out.printf("%s\t%s",name,ages);

          

          String email = "nate.adam@bbobaboom.g0v";
          String email2 = "brandon.spencer@bbobaboom.g0v";

          System.out.println(email);
          //length of our string
          System.out.println(email.length());

          //print out the username
          System.out.println(email.substring(0,9));
          System.out.println(email2.substring(0,email2.indexOf("@")));

          //where is the @ sign
          System.out.println(email2.indexOf("@"));
          System.out.println(email2.indexOf("#"));     //returns -1 if not found

          
          String email3 = "caden.rome@bbobaboom.g0v";
          System.out.println(email3.indexOf("e"));

          String email4 = "keenan.mason@bbobaboom.g0v";

          //see if email3's and email4's usernames are the same
          System.out.println(email3.substring(0,email3.indexOf("@")).equals(email4.substring(0,email4.indexOf("@"))));

          /*
               main methods
                    substring() = return a section of the String
                    indexOf() = return the index of a chr in a String
                         find the first instance of the value
                    equals() = Strings can't use ==
                    length() = returns the length of the string
                    contains() = returns true or false if contains
          */

          //contains
          System.out.println(email4.contains(".g0v"));

          //pull their domain
          System.out.println(email4.substring(email4.indexOf("@")+1));

          //pull their company
          System.out.println(email4.substring(email4.indexOf("@")+1,email4.indexOf(".g0v")));

          double owe = 2.00;
          System.out.println("You owe me: "+ Double.toString(owe));
          System.out.println("You owe me: "+ String.valueOf(owe));
          System.out.printf("You owe me: %2.2f",owe);
     }
}
