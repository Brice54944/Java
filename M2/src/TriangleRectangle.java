public class TriangleRectangle {
    
    private double a;
    private double b;
    

    public TriangleRectangle(double a0, double b0) {
        this.a = a0;
        this.b = b0;
    }

    public double hypothenuse() {
        double c = Math.sqrt(Math.pow(this.a,2) + Math.pow(this.b, 2));
        return(c);

    }
}
