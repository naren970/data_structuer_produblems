import java.io.*;
import java.util.*;

class twosum {
 public static void main(String[] args){
  int[] a = new int[]{2,3,5,7,15,17};
  int target = 12;
  int res[] = new int[2];

  for(int i =0, j =a.length-1 ;i<j;){
   int sum = a[i]+a[j];
   if(sum==target){
    res[0] = i+1;
    res[1] = j+1;
    break;	

   }else if(sum > target) j--;
    else i++;	
	
  }  
  //System.out.println(res);
  for(int k =0; k<res.length;k++){
   System.out.println(res[k]);
  }
 }


}
