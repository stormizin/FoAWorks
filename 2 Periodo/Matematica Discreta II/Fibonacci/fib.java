class Fibonacci {

	public static void main(String[] args) {
		System.out.println(fib(40));
	}

	public static int fib(int n){
		return n < 2 ? n : fib(n-1) + fib(n-2);
	}

}