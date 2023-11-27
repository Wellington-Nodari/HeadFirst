package Cap1;

public class PoolPuzzleOne {
	
	public static void main(String [] args) {
		int x = 0;
		
//		while(x < 4) {
//			x = x + 2;
//			System.out.println(">1." + x);
//		
//			if (x < 1) {
//				System.out.print("noise");
//			}
//			x = x - 1;
//			System.out.println(">2." + x);
//			
//			if (x > 3) {
//				System.out.print("an");
//				System.out.print(" oyster");
//				x = x - 2;
//				//
//			}
//			System.out.println(">3." + x);
//			
//			if( x == 1) {
//				System.out.print("a");
//				System.out.print(" ");
//				System.out.print("n");
//				System.out.print("oise");								
//			}
//			System.out.println(">4." + x);
//			
//			if (x > 1) {
//				System.out.print("annoys");
//			}
//			
//			System.out.println("");
//			x = x + 1;
//			System.out.println(">Loop." + x);		
//		}
		
		while (x < 4) {
			System.out.print("a");
			if (x < 1) {
				System.out.print(" ");
			}
			System.out.print("n");
			
			if(x > 1) {
				System.out.print(" oyster");
				x = x + 2;
			}
			
			if(x == 1) {
				System.out.print("noys");
			}
			
			if(x < 1) {
				System.out.print("oise");
			}
			System.out.println("");
			x = x + 1;
		}
	}
}


// a noise
// annoys
// an oyster