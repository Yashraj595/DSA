package DSA;


import java.util.*;
public class ArrayListt {

  public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.println("Entter the value , inside the list : ");
    int n = sc.nextInt();
   // ArrayList<Integer> list = new ArrayList<>(); 
//      for( int i = 0  ; i<n; i++){
//  list.add(i);
//      }
//     System.out.println(list);


// 2D dimention   ArrayList 

ArrayList<ArrayList<Integer>> main = new ArrayList<>();

ArrayList<Integer> list1 = new ArrayList<>();
ArrayList<Integer> list2 = new ArrayList<>();
ArrayList<Integer> list3 = new ArrayList<>();

for( int i = 0 ; i<n ; i++){
  list1.add(i);
  list2.add(i);
  list3.add(i);

}

System.out.println(list1);
System.out.println(list2);
System.out.println(list3);
main.add(list1);
main.add(list2);
main.add(list3);
System.out.println(" Till here we have printed all the three sublist , which  all are present inside the below main list ");
System.out.println(main);



  }
}
