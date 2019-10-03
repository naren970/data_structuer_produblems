class Node{
 int data;
 Node next;

 public Node(int d){
   data = d;
   next = null;
 }

}

class addNodeFrontLList{
 Node head;
 public static void main(String args[]){
 
  addNodeFrontLList ll = new addNodeFrontLList();
  ll.head  = new Node(2);
  Node n3 = new Node(3);
  Node n4 = new Node(4);
  ll.head.next = n3;
  n3.next = n4;
  System.out.println("Before Adding Node");
  ll.printData(ll.head); 
  Node fNode = new Node(1);
  fNode.next = ll.head;
  ll.head = fNode; 
  System.out.println("AFter adding node");
  ll.printData(ll.head);
 }

 public void printData(Node head){

   while(head != null){
     System.out.println(head.data);
	head = head.next;
   }
 }

}
