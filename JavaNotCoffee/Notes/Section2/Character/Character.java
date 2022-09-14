import java.security.AlgorithmConstraints;

//we don't see this, but java extends the Object Class
//  we inerit some basic methods
public class Character {
    //1. any and all global variables
    String name;
    int age;
    String school;
    boolean drive;
    //2. any and all constructors
    //Professionally it has to match the file name
    public Character(){}            //no-arg constructor

    public Character(String n){
        //this.Characteristic is a global variable
        // = var is the one passed in
        this.name=n;
    }

    // public Character(String s){
    //     //this.Characteristic is a global variable
    //     // = var is the one passed in
    //     this.school=s;
    // }

    public Character(String n, int a){
        this.name = n;
        this.age = a;
    }

    public Character(String n, int a, String s, boolean d){
        this.name = n;
        this.age = a;
        this.school = s;
        this.drive = d;     
    }
    //3. any and all methods

    // def__str__(self):
    //  return ""
    @Override           //decorator
    public String toString(){
        return this.name+"/t"+this.age;
    }



    /*
     * attributes = nouns and adjectives
     * health
     * armor
     * skin
     * food
     * inventory
     * experience
     */

    /*
     * methods = verbs
     *  walk
     *  sprint
     *  crouch
     *  build
     *  swim
     *  attack (mine)
     * 
     */


     /* 
      * attributes
      */
}