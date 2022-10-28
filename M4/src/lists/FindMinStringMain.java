package lists;

import java.util.ArrayList;

public class FindMinStringMain {
    public static void main(String[] args) {
        ArrayList<String> string_list = new ArrayList<>();
        string_list.add("bonjour");
        string_list.add("bonsoir");
        string_list.add("salut");
        String min = string_list.get(0);
        for (String s : string_list) {
            if (s.compareTo(min) < 0) {
                min = s;
            }
        }
        System.out.println(min);
        

    }
}
