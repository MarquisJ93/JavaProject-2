package JavaProject2;

public class P02Alpha {
    public static void main(String[] args) {
        String str="213dlajl#$NND@D!D214";
        int count=str.length();
        int alpha= str.replaceAll("[^A-Za-z0-9]","").length();
        System.out.println("There are "+count+" characters in this String but only "+alpha+" are alpha characters.");
    }
}
