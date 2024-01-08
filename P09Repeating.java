package JavaProject2;

public class P09Repeating {
    public static void main(String[] args) {
        String str="abracadabra";
        int index = -1;
        char nonRepeat = ' ';
        for (char i : str.toCharArray()) {
            if (str.indexOf(i) == str.lastIndexOf(i)) {
                nonRepeat = i;
                break;
            }
            else {
                index += 1;
            }
        }
        if (index == str.length()-1) {
            System.out.println("All characters are repeating");
        }
        else {
            System.out.println("The first non-repeating character in "+str+" is "+ nonRepeat+".");
        }
    }
}
