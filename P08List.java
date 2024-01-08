package JavaProject2;

import java.util.ArrayList;

public class P08List {
    public static void main(String[] args) {
        ArrayList<String> strList=new ArrayList<>();
        strList.add("Andrew");
        strList.add("Ben");
        strList.add("Answer");
        strList.add("Zoo");
        for (String name : strList) {
            if (name.startsWith("A")) {
                System.out.println(name.toLowerCase());
            }
        }
    }
}
