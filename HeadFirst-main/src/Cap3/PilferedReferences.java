package Cap3;

public class PilferedReferences {
	
	String name;

	public static void main(String[] args) {
		
		PilferedReferences refc;
		int x = 0;
		
		while (x < 10) {
			refc = new PilferedReferences();
			refc.name = String.valueOf(x);
			
			System.out.println(refc.name);
			
			x = x + 1;
		}
		
		
	}
}
	
//		Bob's method		
//		PilferedReferences[] ca = new PilferedReferences[10];
//		
//		int x = 0;		
//		
//		while (x < 10) {
//			ca[x] = new PilferedReferences();
//			ca[x].name = String.valueOf(x);
//								
//			System.out.println(ca[x].name);
//			
//			x = x + 1;
//		}
//		
//		System.out.println(ca[5].name);
//
//	}

//}


// Tawny could see that Kent’s method had a serious flaw. It’s true that he didn’t use as many reference variables as
// Bob, but there was no way to access any but the last of the Contact objects that his method created. 
// With each trip through the loop, he was assigning a new object to the one reference variable, so the previously referenced object
// was abandoned on the heap – unreachable. Without access to nine of the ten objects created, Kent’s method was useless.