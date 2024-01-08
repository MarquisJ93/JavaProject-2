package JavaProject2;

public class P07NumOfWords {
    public static void main(String[] args) {
        String str="Hello, world and hello Syntax";
        String arr[] = str.split(" ");

        int wordCount = arr.length;
        System.out.println("The number of words in this String are: " + wordCount);
    }
}
