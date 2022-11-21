package io.text;



import java.io.IOException;

import java.util.ArrayList;


public class BarycenterMain {
    public static void main(String[] args) throws IOException {
        
        ArrayList<Position> positions = PositionReader.read("src/test.pages");
        Position barycenter = Position.barycenter(positions);
        PositionWriter.write(barycenter, "src/test.pages", true);
        ArrayList<Position> positions2 = PositionReader.read("src/test.pages");
        System.out.println(positions2);
    }
        
}

