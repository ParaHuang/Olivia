package day2;

public class Diamond {

	public static void main(String[] args) {
		int lines = 8;
//		int columns = 10;
//		for(initail value ; condition ; increment) {
//			
//		}
		//control a loops goes for N times
//		for(int i=1 ; i<=N ; i++) {
//			
//		}
		
		/*
		*
		**
		***
		****
		*****
		******
		*/
		/*
		for(int i=1 ; i<=lines ; i++) {			//outside loop: control lines
			
			for(int j=1 ; j<=i ; j++) {	//inside loop: control columns
				System.out.print("*");
			}
			
			System.out.println();
		}
		*/
		
		/*
		5 lines
		    *
		   ***
		  *****
		 *******
		*********

		*/
		
		for(int i=1 ; i<lines ; i++) {
			
			for(int j=1 ; j<=lines-i ; j++) {
				System.out.print(" ");
			}
			
			for(int j=1 ; j<=2*i-1 ; j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		for(int i=lines ; i>=1 ; i--) {
			for(int j=1 ; j<=lines-i ; j++) {
				System.out.print(" ");
			}
			for(int j=1 ; j<=2*i-1 ; j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
	}

}

/*
5 lines				i			space			diamond
    *				1				4				1
   ***				2				3				3
  *****				3				2				5
 *******			4				1				7
*********			5				0				9

*/
















