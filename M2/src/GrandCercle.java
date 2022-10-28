public class GrandCercle {

    final static private double R = 6371E3;
    
    private double l1;
    private double d1;
    private double l2;
    private double d2;

    public GrandCercle(double l10, double d10, double l20, double d20) {
        this.l1 = l10;
        this.d1 = d10;
        this.l2 = l20;
        this.d2 = d20;
    }

    public double longueurGC() {
        double l = 2 * GrandCercle.R * Math.asin(Math.sqrt(Math.pow(Math.sin((this.d1 - this.d2)/2),2)+ Math.cos(this.d1)*Math.cos(this.d2)*Math.pow(Math.sin((this.l1 - this.l2)/2),2)));
        return(l);
    }
}
