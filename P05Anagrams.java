package JavaProject2;

import java.util.Arrays;

public class P05Anagrams {
    public static void main(String[] args) {
        String word1 = "Listen";
        String word2 = "Silent";
        word1=word1.toLowerCase();
        word2=word2.toLowerCase();
        if (word1.length() != word2.length()) {
            System.out.println("The words " + word1 + " and " + word2 + " are not anagrams");
        }else{
            char[] array1 = word1.toCharArray();
            char[] array2 = word2.toCharArray();

            Arrays.sort(array1);
            Arrays.sort(array2);

            if (Arrays.equals(array1, array2)) {
                System.out.println("The words "+ word1 + " and " + word2 + " are anagrams");
            } else
                System.out.println("The words "+word1 + " and " + word2 + " are not anagrams");
        }
    }
}
