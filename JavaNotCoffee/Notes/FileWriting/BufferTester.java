public class BufferTester{
    //Read in the file and run the program
    public static void main(String[] args) {
        BufferWriter.writeString("Hello World");
        BufferWriter.saveAndClose();
        System.out.println(BufferWriter.readString());    
    }
    
}