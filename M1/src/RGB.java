public class RGB {
    
    private double red;
    private double green;
    private double blue;

    public RGB(double r0, double g0, double b0) {
        
        this.red = r0;
        this.green = g0;
        this.blue = b0;
    }


    public void display() {
        System.out.println("[" + this.red + "," + this.green + "," + this.blue + "]");

    }

    public double greyLevel() {
        double d = (this.red + this.green + this.blue) / 3;
        return d;

    }

    public void turnToGrey() {
        double d = this.greyLevel();
        this.red = d;
        this.green = d;
        this.blue = d;

    }

    
}

