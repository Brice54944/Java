public class RGB {
    
    static public int MIN_RANGE = 0;
    static public int MAX_RANGE = 1;

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

    public boolean equals(RGB color) {
        boolean B = (color.blue == this.blue) && (color.red == this.red) && (color.green == this.green);
        return B;
    }

    public boolean hasValueInRange() {
        return(this.red <= MAX_RANGE && this.red >= MIN_RANGE && this.green <= MAX_RANGE && this.green >= MIN_RANGE && this.blue <= MAX_RANGE && this.blue >= MIN_RANGE);
    }
    
}

