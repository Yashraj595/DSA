//package DSA;
import java.util.*;
public class TwoPointer {
  
  public static void main(String args []){
  
    int arr [] = {1,2,3,4,6,7};
    int x = 7 ;
 int count = 0 ;

    int start = 0 ;
    int end = arr.length-1;
    while( start <end){
      if(arr[start]+arr[end] < x){
        System.out.println("("+arr[start]+","+arr[end]+")");
          end --;
      }
      else if ( arr[start]+arr[end] >x){
      end--;
      }
     
    }
    
    
  }
}
