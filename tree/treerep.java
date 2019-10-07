class Node{

  int data;
  Node left, right;

  public Node(int data){
    this.data = data;
    left = right = null;
  }
 
}


class treerep{

  Node root;
  
  treerep(){
   root = null;
  }
 
  public static void main(String args[]){

   treerep tr = new treerep();
   tr.root = new Node(1);
   
   tr.root.left = new Node(2);
   tr.root.right = new Node(3);

   tr.root.left.left = new Node(4);
   tr.root.left.left.right = new Node(5);
  }

}
