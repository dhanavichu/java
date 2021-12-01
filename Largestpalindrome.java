package com.lucky;

public class Largestpalindrome {
	static boolean palindrome(int N)
	   {
	       int temp = 0, backup = N, b=0;
	       while(N > 0)
	       {
	    	   b= N%10;
	           temp = temp * 10 +b;
	           N = (int)Math.floor(N / 10);
	       }
	       if(temp == backup)
	           return true;
	       return false;
	   }
	   static int largest_palindrome()
	   {
	       int largest = 0;
	       for(int i = 100; i <= 999; i++)
	       {
	           for(int j=100; j<=999; j++)
	           {
	               int N = i * j;
	               if(palindrome(N) && N > largest)
	                   largest = N;
	           }
	       }
	       return largest;
	   }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int answer = largest_palindrome();
	   	System.out.println(answer);
			
			
	}

}


