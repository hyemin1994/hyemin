package algo;

public class sequential {
	
	public static void main(String[] args) {
		
		int[] max = new int[100000];
		for(int i = 0; i < 100000; i++)
			max[i] = i;
		
		seqsearch(max,1);
		seqsearch(max,10);
		seqsearch(max,50);
		seqsearch(max,100);
		seqsearch(max,500);
		seqsearch(max,1000);
		seqsearch(max,3000);
		seqsearch(max,5000);
		seqsearch(max,10000);


	}
	public static int seqsearch(int[] s, int value){
		long start = System.nanoTime();
		for(int i = 0; i<s.length; i++){
			if(s[i] == value){
				long end = System.nanoTime();
				System.out.println("수행시간 " + (end - start));
				return value;
			}
		}
		long end = System.nanoTime();
		System.out.println("수행시간 " + (end - start));
		return -1;
	}
	
}
