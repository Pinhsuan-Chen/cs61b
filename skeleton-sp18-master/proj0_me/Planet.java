public class Planet{
   /** determine instance variables */
   public static final double G = 6.67e-11;
   public double xxPos;
    public double yyPos;
    public double xxVel;
    public double yyVel;
    public double mass;
    public String imgFileName;

        /**This is the first constructor, recieving data and assign to instance variables */
    public Planet(double xP, double yP, double xV,
                  double yV, double m, String img) {
                      this.xxPos = xP;
                      this.yyPos = yP;
                      this.xxVel = xV;
                      this.yyVel = yV;
                      this.mass = m;
                      this.imgFileName = img;
                  }
    // copy constructor
    // don't know why I have to write it
    public Planet(Planet p) {
        this.xxPos = p.xxPos;
        this.yyPos = p.yyPos;
        this.xxVel = p.xxVel;
        this.yyVel = p.yyVel;
        this.mass = p.mass;
        this.imgFileName = p.imgFileName;
    }

//    calculates the distance between two Planets
    public double calcDistance(Planet p2){
        double dx = this.xxPos-p2.xxPos;
        double dy = this.yyPos-p2.yyPos;
        return Math.sqrt(dx*dx + dy*dy);
        //return Math.sqrt(Math.pow(this.xxPos-p2.xxPos,2)+Math.pow(this.yyPos-p2.yyPos,2));

    }
//describing the force exerted on this planet by the given planet.
    public double calcForceExertedBy(Planet p2){
        double r = this.calcDistance(p2);
        return G*this.mass*p2.mass/(r*r);


    }


}