public class NBody {



    /** Read radius information from given file */

    public static double readRadius(String filePath) {
        In in = new In(filePath);
        int number = in.readInt();
        double radius = in.readDouble();
        return radius;

    }
    public static Planet[] readPlanets(String filePath){
        In in = new In(filePath);
        int number = in.readInt();
        double radius = in.readDouble();

        Planet[] planets = new Planet[number];
        for(int i = 0; i<number; i++){
            double xP = in.readDouble();
            double yP = in.readDouble();
            double xV = in.readDouble();
            double yV = in.readDouble();
            double m = in.readDouble();
            String name = in.readString();
            Planet p = new Planet(xP, yP, xV, yV, m, name);
            planets[i] = p;

        }
        return planets;
    }

    public static void main (String[] args){
        double T = Double.parseDouble(args[0]);
        double dt = Double.parseDouble(args[1]);
        String filename = args[2];
        double radius = readRadius(filename);
        Planet[] planets = readPlanets(filename);


        //  draw background
        StdDraw.setScale(0-radius, radius);
        StdDraw.clear();

        String imgPath = "./images/starfield.jpg";
        StdDraw.picture(0,0,imgPath);
        StdDraw.show();

        for(Planet p: planets){
            p.draw();
        }

    }


}