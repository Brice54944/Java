package mobility.model;

public class Follower extends Mobile{
    private static double theta0 = Math.PI;
    private int M;
    private Mobile leader;
    private static int n = 0;

    public Follower(double x0, double y0, Mobile leader0, int M0) {
        super(x0, y0, theta0, leader0.speed);
        this.M = M0;
    }

    public void move(double timeStep) {
        if (n % this.M == 0) {
            
            double alpha = Math.PI/2 + this.leader.theta - this.theta;
            this.theta = Math.PI/12*rand.nextGaussian() + alpha;
            this.x += this.speed*timeStep*Math.cos(this.theta);
            this.y += this.speed*timeStep*Math.sin(this.theta);
            
           
        }
        else {
            this.x += this.speed*timeStep*Math.cos(this.theta);
            this.y += this.speed*timeStep*Math.sin(this.theta);
            
        }
        n++;
    }

    @Override
    public String toString() {
       
            if (this.leader instanceof Brownian) {
                String string = "F " + super.toString() + " -> " + "B " + this.leader.toString();
                return(string);
            }
            else {
                String string = "F " + super.toString() + " -> " + "D " + this.leader.toString();
                return(string);
            }
        
        
    }
}
