public class Cercle {
    
    private double r;

    public Cercle(double r0){
        
        this.r = r0;
    }

    public double circonference(){
        return(2 * Math.PI * this.r);
    }

    public double surface() {
        return(Math.PI * Math.pow(this.r, 2));
    }
}


