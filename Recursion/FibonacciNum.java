package Recursion;

public class FibonacciNum {
	public static int fibo(int n){
		if(n == 0){
			return 0; //f(0) == 0
		}
		else if(n == 1){
			return 1; //f(1) == 1
		}
		else if(n > 1){
			return fibo(n - 1) + fibo(n - 2);
		}
		else return -1;
	}
}
