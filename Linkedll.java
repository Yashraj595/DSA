package DSA;

public class Linkedll {

  class Node {
    int data;
    Node next;

    public Node(int data) {
      this.data = data;
      this.next = null;
    }
  }

  public Node head;
  public Node tail;

  public void addFirst(int data) { // static removed 
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
   ll.printLL();

  }
}
