class LList{
 Node head;
 static class Node{
  int data;
  Node next; 

   Node(int n){
   data = n;
   next = null;
  }
 }

 public static void main(String args[]){
  LList ll = new LList();
  ll.head = new Node(1);
  Node second = new Node(2);
  Node third = new Node(3);

  ll.head.next = second;
  second.next = third;
  ll.printlist(ll.head);
	 
 } 
 public void printlist(Node head){
  
  while(head!= null){
	System.out.println(head.data+"-->");
	head = head.next;
  }

 }
}
