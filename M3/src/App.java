public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Position p1 = new Position(0,3);
        Position p2 = new Position(1,7);
        Segment s = new Segment(p1,p2);
        s.display();
    }
}
