public class MediaPlayer {
    public static void main(String[] args) {
        // Songs s = new Songs("Respect","Aretha Franklin");
        // System.out.println(s);

        // Songs sn = new Songs();
        // System.out.println(sn);

        // // System.out.println(sn.name); not good habit
        // System.out.println(sn.getName());
        // System.out.println(sn.getArtist());

        // sn.setArtist("Spencer");
        // sn.setName("Umbrella ella ella ehh ehh");
        // System.out.println(sn);

        // sn.setArtist("Adam");
        // System.out.println(sn);
        
        // sn.setRating(5);
        // System.out.println(sn.getRating());
        // System.out.println(s.getRating());   

        Songs s = new Songs("cBatt","hudson hawke");
        Songs s1 = new Songs("cBatt","hudson hawke");
        if(s.getName() == s1.getName()){
            System.out.println("They're the same name");
        }
        else{
            System.out.println("They are not the same");
        }


        

    }
}