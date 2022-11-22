package io.binary;

import java.io.*;
import java.util.ArrayList;

import geometry.Position;

public class BinaryOutputMain{

    public static void main(String[] args) throws IOException{
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("src/data/data.bin"));
        out.writeInt(42);
        out.writeDouble( Math.PI);
        out.writeObject("toto");
        ArrayList<String> list = new ArrayList<>();
        list.add("Titi");
        list.add("gros minet");
        list.add("gargamel");
        out.writeObject(list);
        Position position = new Position(2,2);
        out.writeObject(position);
        ArrayList<Position> positions = new ArrayList<>();
        positions.add(new Position(3,2));
        positions.add(new Position(-3,2));
        positions.add(new Position(3,-2));
        out.writeObject(positions);
        out.close();
        
    }
}