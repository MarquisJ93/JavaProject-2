package JavaProject2;

public class P03Reverse {
    public static void main(String[] args) {
        String str = "Hello";
        System.out.println("This is string printed normal " + str);
        for (int i = str.length() - 1; i >= 0; i--) {
            System.out.print(str.charAt(i));
        }
    }
}
