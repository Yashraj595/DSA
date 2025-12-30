
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

import java.util.Scanner;

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

   //static int  count = 

import java.util.*;
   public class Arrayss{






































      public static int  test(int arr[] , int k ) {
    
         int n = arr.length;
         int temp = 0;
           
         System.out.println(" Before  Arrays conditon ");
         for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + "  ");
         }


        for( int j = 0 ; j<k ; j++){
           temp = arr[n-1];
         
          for( int i = n-1 ; i>=0  ; i--){
            arr[i-1] = arr[i];
          }

          arr[n-1] = temp;
        temp = 0 ;
        }
        System.out.println(" After  Arrays conditon ");

        for( int i = 0 ; i<n ; i++){
         System.out.print(arr[i]+"  ");
        }


        return 0;
      }

























/********************************************************************************* */
      public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println();
         System.out.println();
         System.out.println();
         System.out.println();
         System.out.println();
         
/**** *************************************************************************************/
System.out.println("Enter the size of Array : ");
     int n = sc.nextInt();
     int arr [] = new int[n];
     for(int i = 0 ; i <n ; i++)
     {

      System.out.println("at index "+ (i+1)+"  enter --> ");
        arr[i] =sc.nextInt();
        

       
     }

     System.out.println("Enter the no. of rotation you want ");
     int k = sc.nextInt();
     int ans =  test(arr ,k);
      System.out.println("this is that you want : "+ans);















      /********************************************************************************** */
      System.out.println();
      System.out.println();
      System.out.println();
      System.out.println();
      System.out.println();

      }


      

   }