package geometry;

import java.util.ArrayList;
import java.util.List;


public class Polyline {

    private ArrayList<Position> edges; 

    public Polyline() {
        this.edges = new ArrayList<>();
    }

    public void addEdge(Position p) {
        this.edges.add(p);
        
    }

    public void clearEdges() {
        this.edges.clear();
    }

    public int size() {
        int s = this.edges.size();
        return(s);
    }

    public double length() {
        double length = 0;
        for (int i = 1; i < this.size(); i++) {
            length += Position.distance(this.edges.get(i-1),this.edges.get(i));
        }
        return(length);
    }

    public String toString() {
        int n = this.size();
        double l = this.length();
        String List_to_string = "\"edges=";
        if (n == 0) {
            List_to_string += "[]";
        }
        for (int i = 0; i < n; i++) {
            if (i == 0) {
                List_to_string += "[" + this.edges.get(0) + ",";
            }
            if (i == n - 1) {
                List_to_string += this.edges.get(n-1) + "]";
            }
            else {
                List_to_string += this.edges.get(i) + ",";
            }
            

        }
        List_to_string += " " + "size="+ n + " " + "length="+ l + "\"";
        return(List_to_string);

    }
}
