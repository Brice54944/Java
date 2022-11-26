package mobility.model;

import java.util.Random;

public class Brownian extends Mobile{
    private final static double theta0 = 2*Math.PI*rand.nextDouble();

    public Brownian(double x0, double y0, double speed0) {
        super(x0, y0, theta0, speed0);
        
    }
    
    @Override
    public void move(double timeStep) {
        this.theta = 2*Math.PI*rand.nextDouble();
        this.x += this.speed*timeStep*Math.cos(this.theta);
        this.y += this.speed*timeStep*Math.sin(timeStep);
    }

    @Override
    public String toString() {
        String string = "B " + super.toString();
        return(string);
    }
}
