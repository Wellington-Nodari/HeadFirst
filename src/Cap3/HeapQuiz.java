package Cap3;

public class HeapQuiz {
	
	int id = 0;
	
	public static void main(String[] args) {
		
		int x = 0;
		
		HeapQuiz[] hq = new HeapQuiz[5];
		
		while (x < 3) {
			hq[x] = new HeapQuiz();
			
			hq[x].id = x;
			
			x = x + 1;			
		}
		
		System.out.println(hq[2].id);
		
		hq[3] = hq[1];
		hq[4] = hq[1];
		hq[3] = null;
		hq[4] = hq[0];
		hq[0] = hq[3];
		hq[3] = hq[2];
		hq[2] = hq[0];
		
//		hq[0].id ? = null
//		hq[1].id ? = 1
//		hq[2].id ? = null
//		hq[3].id ? = 2
//		hq[4].id ? = 0
	}

}
