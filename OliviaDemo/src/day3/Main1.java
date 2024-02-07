package day3;

public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0;
		int j = 0;
		
		while (i >= 0 && j <= 0) {
			++i; 
			--j;
		}
		System.out.println(i+"   "+j);
		System.out.println(i == j);
		/*
		//if expresion is true, then execute operation for once
		if(expresion) {
			operation
		}
		
		
		//if expresion is true, then keep executing operation until it's stop being true
		while(expresion) {
			operation
		}
		*/
	}

}

