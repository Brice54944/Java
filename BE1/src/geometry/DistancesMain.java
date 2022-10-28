package geometry;

public class DistancesMain {
    public static void main(String[] args) {
        Position p1 = new Position(2,3);
        Position p2 = new Position(-1,-1);
        
        double d1 = Position.euclide(p1,p2);
        double d2 = Position.manhattan(p1,p2);
        
        System.out.println(d1);
        System.out.println(d2);

    }
    
}
