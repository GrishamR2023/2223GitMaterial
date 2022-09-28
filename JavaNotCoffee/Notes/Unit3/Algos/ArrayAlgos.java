public class ArrayAlgos{
    public static void main(String[] args) {
         double[] test = {12,7,13,8,4.0,3,72};
         double[] test2 = {120,57,1.3,8.5,0,3,7};
         
        //  System.out.print("Sum: %f",sum(test));       
        //  System.out.print("Ave: %f",ave(test));
         System.out.printf("Min: %f",min(test));
        //  System.out.print("Max: %f",max(test));
         System.out.println();
         //returns the index if found, if not, -1
        //  System.out.println("Find: %f",find(test,8));
         System.out.println("Reverse: "+printArray(reverse(test)));
        //  System.out.println("Sorted: "+printArray(sort(test)));
        //  System.out.println("Merge: "+printArray(merge(test,test2)));
    }
    public static double[] reverse(double[] arr) {
        double[] sorted = new double[arr.length];
        int j=0;
        for (int i = arr.length-1; i >0; i--) {
             sorted[j] = arr[i];
             j++;
        }
        return sorted;
    }
    public static String printArray(double[] grades) {
        String out = "";
        for (int i = 0; i < grades.length; i++) {
            if (i != grades.length-1) {
                out += (grades[i]+",");
            }
            else {
                out += (grades[i]);
            }
        }
        return out;
    }
    public static double min(double[] arr){
        double min = arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        return min;
    }

    
    public static double[] merge(double[] arr, double[] arr2) {
        double[] mergedArray = new double[arr.length + arr2.length];
        int start = 0;
        for (int i = 0; i < arr.length; i++) {
            mergedArray[start] = arr[i];
            mergedArray[start+1] = arr2[i];
            start += 2;
        }
        return mergedArray;
    }

    public static double sum(double[] arr) {
        double total = 0;
        for (int i = 0; i < arr.length; i++) {
            total += arr[i];
        }
        return total;
    }
















}