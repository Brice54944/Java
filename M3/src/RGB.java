public class RGB {
 
    // Constants
    public static final int MIN_RANGE = 0;
    public static final int MAX_RANGE = 1;
 
    // Attributes
    private double red;
    private double green;
    private double blue;
 
    // Constructors
    public RGB(double r0, double g0, double b0) {
        this.red = r0;
        this.green = g0;
        this.blue = b0;
    }
 
    public RGB() {
        this(1, 1, 1);
    }
 
    // Methods
    public boolean equals(RGB color) {
        if (color == null)
            return false;
        if (color == this)
            return true;
        return ((color.red == this.red) && (color.green == this.green) && (color.blue == this.blue));
    }
 
    public boolean hasValuesInRange() {
        return ((this.red <= MAX_RANGE) && (this.red >= MIN_RANGE) && (this.green <= MAX_RANGE)
                && (this.green >= MIN_RANGE) && (this.blue <= MAX_RANGE) && (this.blue >= MIN_RANGE));
    }
 
    public static boolean isValueInRange(double value) {
        return value <= MAX_RANGE && value >= MIN_RANGE;
    }
 
    public void set(double r, double g, double b) {
        this.red = r;
        this.green = g;
        this.blue = b;
    }
 
    public void set(double grey) {
        this.set(grey, grey, grey);
    }
 
    public void display() {
        System.out.println("[ " + this.red + " " + this.green + " " + this.blue + " ]");
    }
 
    public double greyLevel() {
        return (this.red + this.green + this.blue) / 3;
    }
 
    public void turnToGrey() {
        double grey = this.greyLevel();
        this.blue = grey;
        this.green = grey;
        this.red = grey;
    }
}