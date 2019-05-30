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
        double dx = p2.xxPos-this.xxPos;
        double dy = p2.yyPos-this.yyPos;
        return Math.sqrt(dx*dx + dy*dy);
        //return Math.sqrt(Math.pow(this.xxPos-p2.xxPos,2)+Math.pow(this.yyPos-p2.yyPos,2));

    }
//describing the force exerted on this planet by the given planet.
    public double calcForceExertedBy(Planet p2){
        double r = this.calcDistance(p2);
        return G*this.mass*p2.mass/(r*r);

    }
    public double calcForceExertedByX(Planet p2){
        double r = this.calcDistance(p2);
        double f = this.calcForceExertedBy(p2);
        double dx = p2.xxPos-this.xxPos;
        return f*dx/r;
    }
    public double calcForceExertedByY(Planet p2){
        double r = this.calcDistance(p2);
        double f = this.calcForceExertedBy(p2);
        double dy = p2.yyPos-this.yyPos;
        return f*dy/r;
    }

    public double calcNetForceExertedByX(Planet[] ps){
        double netfx = 0;
        for(Planet p : ps){
            if(this.equals(p)){
                continue;
            }
            netfx += this.calcForceExertedByX(p);
        }
        return netfx;
    }

    public double calcNetForceExertedByY(Planet[] ps){
        double netfy = 0;
        for(Planet p : ps){
            if(this.equals(p)){
                continue;
            }
            netfy += this.calcForceExertedByY(p);
        }
        return netfy;
    }
    public void update(double t, double Fx, double Fy){
        double Ax = Fx / this.mass;
        double Ay = Fy / this.mass;
        this.xxVel+= t*Ax;
        this.yyVel+= t*Ay;
        this.xxPos+= t*xxVel;
        this.yyPos+= t*yyVel;

    }

    public void draw(){
        StdDraw.picture(this.xxPos, this.yyPos, "images/"+imgFileName);
    }



}