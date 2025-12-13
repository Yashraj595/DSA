package DSA;
// import java.util.Scanner;

// public class Arrays{

// public static void search( int arr [], int n ){
// int largest = arr[0];
// for( int i = 0 ; i<arr.length ; i++){

// if(largest < arr[i]){
// largest = arr[i];

// }
// }
// System.out.println(largest);

// }

// public static void main(String args []){
// Scanner sc = new Scanner(System.in);
// // System.out.println("Enter the value of n that you want to search : ");
// // int n = sc.nextInt();

// int arr []= {1, 5, 7, 5, 6};

// search(arr , n );

// }
// }

// **************************************Binary Search ********************************** */

// import java.util.*;
// public class Arrays {
// public static int myFunction( int arr [], int n ){
// int start = 0 ;
// int end = arr.length-1;

// while( start <= end){
// int mid = (start+end)/2;
// if(arr[mid]== n ){
// return mid ;
// }
// else if ( n < arr[mid] ){
// end = mid-1;
// }
// else {
// start = mid+1;
// }
// }

// return -1;
// }

// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// System.out.println("Enter the N :" );
// int arr [] = { 1, 2, 3, 4, 5, 6, 7};
// int n = sc.nextInt();
// int ans = myFunction(arr, n);
// System.out.println(ans);
// }
// }

// import java.util.Scanner;

/************************************************************************* */


// public class Arrays {

//   public static void  construction( int arr []){
//     int start ;
//     int end ;
//     int n = arr.length-1;
//    for( int i = 0 ; i<(arr.length)/2 ; i++ ){
//            start = arr[i];
//            arr[i] = arr[n-i];
//            arr[n-i]= start; 
//    }

// for( int i = 0 ; i<arr.length ; i++){
//   System.out.print(arr[i]+" ");
// }
//   }
//   public static void main(String[] args) {
//     int arr [] = { 1, 2, 3, 5, 6, 7};
 
// construction(arr);

//   }
// }
import java.util.*;
public class Arrays {
   //static int  count = 0;


  public static void pairPrint(int arr []){  

      
    for( int i = 0 ; i<arr.length ; i++){

      for( int j = 0 ; j <j+1 ; j++){

        System.out.print(arr[j]);
      }
System.out.print(" ");
   
    }

  }


  public static void main(String[] args) {
    int arr [] = { 1 , 2 , 3 , 4 , 5 , 6 , 7, 8};
pairPrint( arr );


  }
}