package mobility.model;

public class Drunkard extends Mobile{
    

    public Drunkard(double x0, double y0, double speed0) {
        super(x0, y0, speed0);
    }

    public void move(double timeStep) {
        this.theta = Math.PI/12*rand.nextGaussian() + this.theta;
        this.x += this.speed*timeStep*Math.cos(this.theta);
        this.y += this.speed*timeStep*Math.sin(this.theta);
    }

    @Override
    public String toString() {
        String string = "D " + super.toString();
        return(string);
    }
}
