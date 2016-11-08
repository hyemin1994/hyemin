package algo;

public class fibo {
	public static void main(String[] args){
		long start,end;
		
		start = System.nanoTime();
		fib(3);
		end = System.nanoTime();
		System.out.println("fib 수행시간 : " + (end-start));
		start = System.nanoTime();
		rfib(3);
		end = System.nanoTime();
		System.out.println("rfib 수행시간 : " + (end-start));
		System.out.println("");
		
		start = System.nanoTime();
		fib(5);
		end = System.nanoTime();
		System.out.println("fib 수행시간 : " + (end-start));
		start = System.nanoTime();
		rfib(5);
		end = System.nanoTime();
		System.out.println("rfib 수행시간 : " + (end-start));
		System.out.println("");
		
		start = System.nanoTime();
		fib(8);
		end = System.nanoTime();
		System.out.println("fib 수행시간 : " + (end-start));
		start = System.nanoTime();
		rfib(8);
		end = System.nanoTime();
		System.out.println("rfib 수행시간 : " + (end-start));
		System.out.println("");
		
		start = System.nanoTime();
		fib(10);
		end = System.nanoTime();
		System.out.println("fib 수행시간 : " + (end-start));
		start = System.nanoTime();
		rfib(10);
		end = System.nanoTime();
		System.out.println("rfib 수행시간 : " + (end-start));
		System.out.println("");
		
		start = System.nanoTime();
		fib(13);
		end = System.nanoTime();
		System.out.println("fib 수행시간 : " + (end-start));
		start = System.nanoTime();
		rfib(13);
		end = System.nanoTime();
		System.out.println("rfib 수행시간 : " + (end-start));
		System.out.println("");
		
		start = System.nanoTime();
		fib(15);
		end = System.nanoTime();
		System.out.println("fib 수행시간 : " + (end-start));
		start = System.nanoTime();
		rfib(15);
		end = System.nanoTime();
		System.out.println("rfib 수행시간 : " + (end-start));
		System.out.println("");
		
		start = System.nanoTime();
		fib(18);
		end = System.nanoTime();
		System.out.println("fib 수행시간 : " + (end-start));
		start = System.nanoTime();
		rfib(18);
		end = System.nanoTime();
		System.out.println("rfib 수행시간 : " + (end-start));
		System.out.println("");
		
		start = System.nanoTime();
		fib(20);
		end = System.nanoTime();
		System.out.println("fib 수행시간 : " + (end-start));
		start = System.nanoTime();
		rfib(20);
		end = System.nanoTime();
		System.out.println("rfib 수행시간 : " + (end-start));
		System.out.println("");
		
		start = System.nanoTime();
		fib(23);
		end = System.nanoTime();
		System.out.println("fib 수행시간 : " + (end-start));
		start = System.nanoTime();
		rfib(23);
		end = System.nanoTime();
		System.out.println("rfib 수행시간 : " + (end-start));
		System.out.println("");
		
		start = System.nanoTime();
		fib(25);
		end = System.nanoTime();
		System.out.println("fib 수행시간 : " + (end-start));
		start = System.nanoTime();
		rfib(25);
		end = System.nanoTime();
		System.out.println("rfib 수행시간 : " + (end-start));
		System.out.println("");
	}
	
	public static int fib(int n){
		int n1=0;
		int n2=1;
		int n3=0;
		
		for(int i = 1; i<n ; i++){
			n3 = n1 + n2;
			n1 = n2;
			n2 = n3;
		}
		return n3;
		
	}
	public static int rfib(int n){
		if(n <= 1){
			return n;
		}
		else
			return rfib(n-1) + rfib(n-2);
	}
	
}
