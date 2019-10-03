class Node{
  int data;
  Node next;

  Node(int n){
   data = n;
  }
}

class revlist{
 Node head;
 
 public static void main(String args[]){
 
  revlist rl = new revlist();
   rl.head = new Node(1);
   Node n1 = new Node(2);
   Node n2 = new Node(3);

   rl.head.next = n1;
   n1.next = n2;
  
 }

 public void printList(Node head){
  Node next = null;
  Node prev = null;
  Node current = head;
  
  while(head != null){
    next = head.next;
    head.next = prev;
    prev = current;
    current = next;      
  }
  node = prev;
 }
}
