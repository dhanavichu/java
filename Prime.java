package com.lucky;

public class Prime {

	public static void main(String[] args) {
		long n=600851475143L;
		for(int i=2;i<n;i++) {
			while(n%i==0) {
				n=n/i;
			}
		}
		if(n>2) {
			System.out.println(n);
		}

	}

}
