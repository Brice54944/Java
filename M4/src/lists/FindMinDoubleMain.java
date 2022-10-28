package lists;

import java.util.ArrayList;

public class FindMinDoubleMain {
    public static void main(String[] args) {
        ArrayList<Double> double_list = new ArrayList<>();
        double_list.add(6.0);
        double_list.add(3.0);
        double_list.add(14.0);
        double_list.add(2.0);
        double_list.add(8.0);
        double_list.add(6.0);
        double_list.add(9.0);
        double min = 6;
        for (Double d : double_list) {
            if (d <= min) {
               min = d;
            }
        }
        System.out.println(min);

        
    }
}