package JavaProject2;

public class P01Swap {
    public static void main(String[] args) {
        String str1="Syntax";
        String str2="Java";
        System.out.println("Strings before swap: str1 = "+str1+ " and str2: "+str2);
        str1 = str1 + str2;
        str2 = str1.substring(0,str1.length()-str2.length());
        str1 = str1.substring(str2.length());
        System.out.println("Strings after swap: str1 = " +str1+ " and str2 = " + str2);
    }
}
