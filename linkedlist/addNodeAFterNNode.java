import java.util.*;
class Node{

 int data;
 Node next;
 public Node(int d){
  data = d;
  next = null;
 }
}

class addNodeAFterNNode{
 Node head;
 public static void main(String args[]){
  addNodeAFterNNode ll= new addNodeAFterNNode();
  ll.head = new Node(1);
  Node n2 = new Node(2);
  Node n3 = new Node(3);
  Node n4 = new Node(4);
  Node n5 = new Node(5);

  ll.head.next = n2;
  n2.next = n3;
  n3.next = n4;
  n4.next = n5;
  System.out.println("Original List");
  ll.printList(ll.head);
  System.out.println("ADding new node");
  //System.out.println("Enter which node you want add");
  //Scanner sc = new Scanner(System.in);
  //int n = sc.nextInt();
  
  Node newNode = new Node(6); 
  ll.addNode(3, ll.head, newNode);  
   ll.printList(ll.head);
 }

 public void printList(Node head){
  while(head != null){
    System.out.println(head.data);
    head = head.next;
  }
 }
 
 public void  addNode(int n, Node head, Node newNode){
  int count = 1;
  System.out.println("Inside adding new node");
  while(head != null){
   if(count == n){
     Node temp =  head.next;
     head.next = newNode;
     newNode.next = temp;
   }
   head = head.next;
   count++;
  }
  
 }
}
