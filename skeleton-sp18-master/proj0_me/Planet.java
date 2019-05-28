public class Planet{
   /** determine instance variables */
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
                  
    public Planet(Planet p) {
        this.xxPos = p.xxPos;
        this.yyPos = p.yyPos;
        this.xxVel = p.xxVel;
        this.yyVel = p.yyVel;
        this.mass = p.mass;
        this.imgFileName = p.imgFileName;
    }
    private public calcDistance(Planet p2){

    }


}