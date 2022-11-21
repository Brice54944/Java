package io.text;

import java.io.*;
import java.util.Collection;

public class PositionWriter {
    
    public static void write(Position position, String fileName, boolean append) throws IOException{
        PrintWriter out = new PrintWriter(new FileWriter(fileName, append));
        out.println(position.getX()+","+position.getY());
        out.close();
    }

    public static void write (Collection<Position> positions, String fileName, boolean append) throws IOException{
        PrintWriter out = new PrintWriter(new FileWriter(fileName, append));
        for (Position position : positions) {
            out.println("\n"+ position.getX()+","+position.getY());
        }
        out.close();
    }
}
