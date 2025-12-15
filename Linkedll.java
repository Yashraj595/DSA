package DSA;

public class Linkedll {
///   creating Node class 
  class Node {
    int data;
    Node next;

    public Node(int data) {
      this.data = data;
      this.next = null;
    }
  }
 ///  define node head and tail 
  public Node head;
  public Node tail;

  public void addFirst(int data) { //  keep public this function 
    Node newNode = new Node(data);

    if (head == null) {
      head = tail = newNode;
      return;
    }

    newNode.next = head;
    head = newNode;
  }


  public void addLast(int data){
  Node newNode = new Node(data);
  if( head == null){
    head = tail = newNode;
    return ;
  }
    tail.next = newNode;
   tail = newNode;
      
  }


  public void addmid(int idx , int data ){

  if( idx == 0 ){
    addFirst(data);
    return ;
  }
 Node temp = head ;
  Node newNode = new Node(data);
  int i = 0 ;
  while( i < idx-1){

    temp  = temp.next ;
    i++;
  }
newNode.next = temp.next;
temp.next = newNode;

  }

  public void printLL( ){

    if( head == null){
      System.out.println("Linked list is empty ");
      return ;
    }
    Node demo = head ;
    while( demo != null){
      System.out.print(demo.data+" -> ");
      demo = demo.next;
    }
     System.out.println(" NUll ");
  }


  public static void main(String[] args) {
    Linkedll ll = new Linkedll();
   ll.addFirst(0);
   ll.addLast(1);
   ll.addmid(1, 1);
   ll.printLL();

  }
}
