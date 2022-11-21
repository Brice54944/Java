package io.text;

import java.io.IOException;
import java.util.*;
import java.io.*;

public class PositionReader {
    
    public static ArrayList<Position> read(String fileName) throws IOException{
        FileReader in = new FileReader(fileName);
        BufferedReader bin = new BufferedReader(in);

        ArrayList<Position> positions = new ArrayList<>();
        while(bin.ready()) {
            String line = bin.readLine();
			String[] tokens = line.split(",");
			double x = Double.parseDouble(tokens[0].trim());
			double y = Double.parseDouble(tokens[1].trim());
			positions.add(new Position(x, y));
        }
        bin.close();
        return(positions);
    
    }
}
