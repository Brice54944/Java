package geometry;

import java.util.ArrayList;

public class AllInOneMain {
    public static void main(String[] args) {
        ArrayList<AllInOne> list = new ArrayList<>();
        Position p1 = new Position(1,1);
        Position p2 = new Position(-4,2);
        Circle c1 = new Circle(3, -1,0);
        Circle c2 = new Circle(5, 2,2);
        list.add(p1);
        list.add(c1);
        list.add(p2);
        list.add(c2);
        for (AllInOne iterable_element : list) {
            iterable_element.translate(100, 100);
            iterable_element.display();
        }
    
    }
}
