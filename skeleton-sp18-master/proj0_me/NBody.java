public class NBody {



    /** Read radius information from given file */

    public static double readRadius(String filePath) {
        In in = new In(filePath);
        int number = in.readInt();
        double radius = in.readDouble();
        return radius;

    }
    public static Planet[] readplanets(String filePath){
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
        Planet[] planets = readplanets(filename);


        String imgPath = "./images/starfield.jpg";

        StdDraw.enableDoubleBuffering();
        StdDraw.setScale(-radius, radius);
        StdDraw.clear();
        StdDraw.picture(0, 0, imgPath);
        StdDraw.show();

        for (Planet p : planets) {
            p.draw();
        }

        for (double time = 0; time <= T; time += dt) {
            double[] xForces = new double[planets.length];
            double[] yForces = new double[planets.length];
            for (int i = 0; i < planets.length; i++) {
                xForces[i] = planets[i].calcNetForceExertedByX(planets);
                yForces[i] = planets[i].calcNetForceExertedByY(planets);
            }
            for (int i = 0; i < planets.length; i++) {
                planets[i].update(dt, xForces[i], yForces[i]);
            }
            // StdDraw.clear();
            StdDraw.picture(0, 0, imgPath);
            for (int i = 0; i < planets.length; i++) {
                planets[i].draw();
            }
            StdDraw.show();
            int pauseTime = 1000;
            StdDraw.pause(pauseTime);
        }

        StdOut.printf("%d\n", planets.length);
        StdOut.printf("%.2e\n", radius);
        for (Planet aPArray : planets) {
            StdOut.printf("%11.4e %11.4e %11.4e %11.4e %11.4e %12s\n",
                    aPArray.xxPos, aPArray.yyPos, aPArray.xxVel, aPArray.yyVel, aPArray.mass, aPArray.imgFileName);
        }






    }


}