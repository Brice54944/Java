public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Position position1 = new Position(0,0);
        position1.display();
        position1.moveTo(3, 3);
        position1.display();
        position1.moveTo(12, -4);
        position1.display();
        double d = position1.distanceToOrigin();
        System.out.println(d);
        Position position2 = new Position(-3,9);
        Position position3 = new Position(4,2);
        position2.moveTo(7, 1);
        position3.moveTo(-1, 0);
        position2.display();
        position3.display();
        RGB rgb = new RGB(0.1,0.2,0.3);
        rgb.display();
        double g = rgb.greyLevel();
        System.out.println(g);
        rgb.turnToGrey();
        rgb.display();
        Position p = new Position(3, 14);
        Position autreRef = p;
        autreRef.moveTo(10, 42);
        p.display();
        double w = 1;
        double t = 1;
        boolean B = ( w == t);
        System.out.println(B);



    }
}
