public class Sort {
    /** Sorts strings destructively. */
    public static void sort(String[] x) { 
           // find the smallest item
           // move it to the front
           // selection sort the rest (using recursion?)
    }

    /** Returns the smallest string in x. */
    public static String findSmallest(String[] x) {
//        int smallestIndex = 0;
//        for (int i =0; i < x.length; i+= 1){
//          int cmp = x[i].compareTo(x[smallestIndex]);
//          if(cmp < 0){
//            smallestIndex = i;
//          }
//        }
//        return x[smallestIndex];
        return x[1];
    }
}