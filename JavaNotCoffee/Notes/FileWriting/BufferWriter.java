import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.File;


public class BufferWriter{

    private static final String DATA_FILE = "mymedia.txt";
    private static Scanner in;
    private static BufferedWriter out;

    public static void writeString(String s) {
        if(out==null){
            try{
            out = new BufferedWriter(new FileWriter(DATA_FILE));
            }
            catch(Exception e){
                System.err.println("Cannot open file for output!");
                e.printStackTrace();
            }
            try{
        out.write(s);
        out.newLine();
            }
            catch(Exception e){
                System.out.println("Cannot write file!");
                e.printStackTrace();
            }    
    }
    }

    public static void saveAndClose() {
        //closes after the Scanner is done reading the file
        if(in!=null){
            try{
                in.close();
                in=null;
            }
            catch(Exception e){
                System.err.println("Cannot close input file!");
                e.printStackTrace();
            }
        }

        if(out!=null){
            try{
                out.close();
                out=null;
            }
            catch(Exception e){
                System.err.println("Cannot close output file!");
                e.printStackTrace();
            }
        }
    }

    public static String readString() {
        //check to see if in is already there
        if (in==null) {
            try {
                in = new Scanner(new File(DATA_FILE));
            } catch (Exception e) {
                // TODO: handle exception
                System.err.println("Cannot open file for input!");
                e.printStackTrace();
            }
        }
        try {
            //if there is a new line, read it in
            if(in.hasNext()){
                String s = in.nextLine();
                return s;
            }
            else{
                return null;
            }
        } catch (Exception e) {
            // TODO: handle exception
            System.err.println("Cannot read the file!");
            e.printStackTrace();
        }
        //read in the values from the text file
        return null;
    }
}