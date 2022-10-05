import java.net.Inet4Address;
import java.util.ArrayList;
public class ALMethods{
    public static void main(String[] args) {
        //1,5,9,7,4,8,2,3,6,0,9
        ArrayList<Integer> arrList = new ArrayList<Integer>();
        
        int[] ia = {1,5,9,7,4,8,2,3,6,0,9};
        arrList=createArrayList(ia);
        System.out.println(arrList);
        System.out.println(minIntAL(arrList));
        System.out.println(maxIntAL(arrList));
        System.out.println(aveIntAL(arrList));
        System.out.println(sumIntAL(arrList));
        System.out.println(removeDuplicates(arrList));





    }
    //convert an int array to an int arraylist
    public static ArrayList<Integer> createArrayList(int[] iarr){
        ArrayList<Integer> temp = new ArrayList<Integer>();
        for(int i=0;i<iarr.length;i++){
            temp.add(iarr[i]);
        }
        return temp;
        // ArrayList<String> places = new ArrayList<>(Arrays.asList("Buenos Aires", "Córdoba", "La Plata"));
    }

    public static int maxIntAL(ArrayList<Integer> arrList) {
        int max = 0;
        for(int i=0;i<arrList.size();i++){
            if(max<arrList.get(i)){
                max=arrList.get(i);
            }
        }
        return max;
    }

    public static ArrayList<Integer> removeDuplicates(ArrayList<Integer> al) {
        ArrayList<Integer> arrList = new ArrayList<Integer>();
        for (int i =0; i<al.size(); i++) {
            if (!arrList.contains(al.get(i))) {
                arrList.add(al.get(i));
            }
        }

        return arrList;
    }



}