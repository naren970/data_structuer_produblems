import java.util.*;

class hashtable {

	public static void main(String args[]){

		Hashtable<Integer, String> h = new Hashtable<Integer, String>();
		Hashtable<Integer, String> h1 = new Hashtable<Integer, String>();

		h.put(1, "Helo");
		h.put(3, "World");
		h.put(2, "Test");
		h.put(4, "working");
		h1 = (Hashtable<Integer, String>)h.clone();

		System.out.printf("Value in Clone "+ h);
		System.out.println();
//		h.clear();
		System.out.printf("Values in H1 ", h1);
		System.out.println();
		
		//ComputeIfAbsent()
		h1.computeIfAbsent(3, k->"Worlding");
		h1.computeIfAbsent(6, k->"Computing If Absent");
		System.out.println("Printing ComputeIfAbsent");
		System.out.print(h1);
		
		//Cotains methode
		System.out.printf(" Is Hello Exist ?", h.contains("World"));
		System.out.println();
			
		//Contains key
		System.out.printf("Is 1 Key Existed", h.containsKey(1));
		System.out.println();
		System.out.printf("The value is ", h.get(1));
	
	}

}
