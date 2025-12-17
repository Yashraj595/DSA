package DSA;
import java.util.*;
public class Strings {
  public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);
    
    String str = "Yas h @ 1 23";
    String nospace = str.replaceAll("\\s+", "");
    String letters = str.replaceAll("[^0-9]","");
    String unique = str.replaceAll("[0-9a-zA-z]", "");
    System.out.println(letters+"size :"+ unique.length());
    System.out.println(unique+" size : "+letters.length());
System.out.println(nospace);


  }
}
