package geometry;
import java.util.ArrayList;

public class PositionListMain {
    public static void main(String[] args) {
        ArrayList<Position> listOfPos = new ArrayList<>();
        Position p1 = new Position(0,3);
        Position p2 = new Position(-3,4);
        Position p3 = new Position(2,5);
        listOfPos.add(p1);
        listOfPos.add(p2);
        listOfPos.add(p3);
        System.out.println(listOfPos.toString());
        for (Position pos : listOfPos) {
            pos.display();
        }
            
        
    }
}
