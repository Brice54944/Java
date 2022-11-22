package io.binary;


import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;



public class BinaryInputMain {
    public static void main(String[] args) throws IOException{
        FileInputStream fis = new FileInputStream("src/data/data.bin");
        ObjectInputStream ois = new ObjectInputStream(fis);
        int i = ois.readInt();
        System.out.println(i);
        double pi = ois.readDouble();
        System.out.println(pi);
        try {
            Object string = ois.readObject();
            System.out.println(string);}
        catch(ClassNotFoundException e) {
            System.out.println(e);
        }
        try {
            Object strings = ois.readObject();
            System.out.println(strings);
        }
        catch (ClassNotFoundException e) {
            System.out.println(e);
        }
        try {
            Object position = ois.readObject();
            System.out.println(position);
        }
        catch (ClassNotFoundException e) {
            System.out.println(e);
        }
        try {
            Object positions = ois.readObject();
            System.out.println(positions);
        }
        catch (ClassNotFoundException e) {
            System.out.println(e);
        }
        ois.close();
        fis.close();
    }
}
