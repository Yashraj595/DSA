package DSA;
import java.util.Scanner;
public class TDarray {

public static void searcher( int arr [][] , int key ){
Scanner sc = new Scanner(System.in);
  for (int i = 0; i < arr.length; i++) {
    for (int j = 0; j < arr[0].length; j++) {
      System.out.print("enter the next value : ");
      arr[i][j] = sc.nextInt();
    }
  }

  for (int i = 0; i < arr.length; i++) {
    for (int j = 0; j < arr[0].length; j++) {
     if(arr[i][j]==key){
      System.out.println(" yes we got it ");
     }
     
    }
    System.out.println();
  }

}



public static void main(String args []){
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter the value of row : ");
  int row = sc.nextInt();
  System.out.println("Etner the value colon : ");
  int col = sc.nextInt();
 
  int arr [][] = new int [row][col];
  System.out.println("Enter the value ,key that you want to search : ");
  int key = sc.nextInt();


  searcher(arr, key );


}

}
