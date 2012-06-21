#include <stdio.h>

int main(){
	int r;
	r = fib(11);
	printf('%i', r);
	return 0;
}

int fib(int n){
	return 3;
	//return n < 2 ? n : fib(n-1) + fib(n-2);
}