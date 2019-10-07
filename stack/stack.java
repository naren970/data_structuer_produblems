import java.util.*;
import java.io.*;
class stack{

 public static void main(String args[]){
 
  Stack<Integer> st = new Stack<Integer>();
  push_stack(st);
  pop_stack(st);
  push_stack(st);
  peek_stack(st);
  search_stack(st, 2);  
 }
 

  static void push_stack(Stack<Integer> s){
   System.out.println("Push Elements");
   for(int i =0; i< 5; i++){
    s.push(i);
   }
  }

  static void pop_stack(Stack<Integer> s){
   System.out.println("Pop Elements ");
   for(int i =0; i< 5; i++){
    Integer item = (Integer) s.pop();
    System.out.println("The Item :"+ item);
   }
  }

  static void search_stack(Stack<Integer> s, int item){
   Integer pos =  (Integer) s.search(item);
 
   if(pos == -1){
     System.out.println("Element not found");
   }else{
     System.out.println("Element found at "+ pos+ " Position");
   }
  }

  static void peek_stack(Stack<Integer> s){
    Integer i = (Integer) s.peek();
    System.out.println("Peek Element "+ i);
  }

}
