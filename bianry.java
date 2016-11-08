package algo;

public class bianry {
	
	public static void main(String[] args) {
		int[] max = new int[100000];
		for(int i = 0; i < 100000; i++)
			max[i] = i;
		
		binsearch(max,1);
		binsearch(max,10);
		binsearch(max,50);
		binsearch(max,100);
		binsearch(max,500);
		binsearch(max,1000);
		binsearch(max,3000);
		binsearch(max,5000);
		binsearch(max,10000);
		
	}
	public static int binsearch(int[] s, int value){
		long start = System.nanoTime();
		int low = 0;
		int high = s.length;
		int mid;
		long end;
		while(low <= high){
			mid = (low + high) / 2;
			
			if(value == s[mid]){
				 end = System.nanoTime();
				System.out.println("수행시간 : " + (end-start));
				return mid;
			}
			
			else if( value < s[mid])
				high = mid - 1;
			
			else
				low = mid + 1;
		}
		 end = System.nanoTime();
		System.out.println("수행시간 : " + (end-start));
		return 0;
	}
}
