public class Songs {
    //By default, these are public - typically want private
    private String name, artist;
    private double rating;
    //x,y = 100,100... you can't do that in java

    //Constructor
    public Songs(){
        this.name = "untitled";
        this.artist = "unknown artist";
    }

    public Songs(String name, String artist){
        this.name = name;
        this.artist = artist;
    }
    public Songs(String name, String aritst, double rating){
        // this.globalVariable = argumentVariable
        this.name = name;
        this.artist = artist;
        this.rating = rating;
    }
    //getters and setters
    //accessors and mutators
    public String getName(){
        return this.name;
        //this == self
    }

    public double getRating(){
        return this.rating;
    }

    public String getArtist(){
        return this.artist;

    }

    public void setName(String newName){
        this.name = newName;

    }
    public void setArtist(String newArtist){
        this.artist = newArtist;
    }

    public void setRating(double newRating){
        this.rating = newRating;
    }

    //Override methods
    @Override
    public String toString(){
        return this.name+"\t"+this.artist;
    }

    //equals compares the object as a whole
    @Override
    public boolean equals(Object o){
        //Object o is the object you are comparing this Songs object to.
        if(o == this){
            return true;
        }
        else{
            return false;
        }
    }
}
