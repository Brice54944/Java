package mobility.model;

import java.util.Random;

public  abstract class  Mobile {
	
    protected static Random rand = new Random();
    protected double x;
    protected double y;
    protected double theta;
    protected double speed;

    public Mobile(double x0, double y0, double speed0) {
        this.x = x0;
        this.y = y0;
        this.speed = speed0;
        this.theta = 2*Math.PI*rand.nextDouble();
    }

    public abstract void move(double timeStep);

    public double getX() {
        return this.x;
    }

    public double getY() {
        return this.y;
    }

    public double getTheta() {
        return this.theta;
    }

    public double getSpeed() {
        return this.speed;
    }



    @Override
    public String toString() {
        return  "("+ getX() + ", " +
             getY() + ")";
            
    }
    
}
