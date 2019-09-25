class multiarray{

	public static void main(String args[]){
		int[][] multiarray = {{1,2}, {3,4}, {5,6}};

		for(int i=0; i<3;i++){
			for(int k =0; k<2;k++){
				System.out.print(multiarray[i][k]+" ");
			}
			System.out.println("");
		}
	}

}
