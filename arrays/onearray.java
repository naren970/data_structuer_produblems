import java.util.*;

class onearray{

	public static void main(String args[]){
		int a[];
		char[] s = new char[]{'n','a','r','e'};
		boolean booleanArray[];
		long longArray[];
		short[] shortArray = new short[20];
		a = new int[5];
		for(int i =0; i<5;i++){
			a[i] = i;
			//System.out.println()
		}

		for(int j =0; j<5;j++){
			System.out.println(a[j]);
		}
		for(int k =0; k<s.length;k++){
			System.out.println("Char Array value at "+k+" Positoin"+s[k]);
		}
		

	}

}
