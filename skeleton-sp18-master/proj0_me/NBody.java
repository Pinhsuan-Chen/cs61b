public class NBody {



    /** Read radius information from given file */

    public static double readRadius(String filePath) {
        In in = new In(filePath);
        int number = in.readInt();
        double radius = in.readDouble();
        return radius;

    }
    public static void main (String[] args){

    }


}