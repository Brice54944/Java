package rationals;

import java.io.IOException;
import java.util.*;
import java.io.*;


public class RationalReader {
    
    public static ArrayList<Rational> read(String fileName) throws IOException, Exception{
        ArrayList<Rational> rationals = new ArrayList<>();
        FileReader in = new FileReader(fileName);
        BufferedReader bin = new BufferedReader(in);

        while (bin.ready()) {
            String line = bin.readLine();
            if (line.contains(" ")) {
                String[] fractions = line.split(" ");
                for (String fraction : fractions) {
                    rationals.add(Rational.parseRational(fraction));
                }
            }
            else {
                rationals.add(Rational.parseRational(line));
            }
        }
        bin.close();
        in.close();
        return(rationals);
    }
}
