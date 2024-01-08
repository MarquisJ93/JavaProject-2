package JavaProject2;

public class P04Palindrome {
    public static void main(String[] args) {
        String word="Dad";
        String reversedWord="";
        for (int i = word.length()-1; i>=0; i--) {
            reversedWord=reversedWord+word.charAt(i);
        }
        if(word.equalsIgnoreCase(reversedWord)){
            System.out.println("Its a Palindrome");
        }else{
            System.out.println("It's not a Palindrome");
        }
    }
}
