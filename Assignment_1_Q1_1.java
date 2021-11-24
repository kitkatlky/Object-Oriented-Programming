/*
i) Write a program that plays a reverse guessing game with the user. The
user thinks of a number between 1 and 10, and the computer repeatedly
tries to guess it by guessing random numbers. It's fine for the computer
to guess the same random number more than once. At the end of the
game, the program reports how many guesses were needed. Example
output is as below:

This program has you, the user, choose a number between 1 and 10, then I, the
computer, will try my best to guess it.
Is it 8?
(y/n) n
Is it 7?
(y/n) n
Is it 5?
(y/n) n
Is it 1?
(y/n) n
Is it 8?
(y/n) n
Is it 1?
(y/n) n
Is it 9?
(y/n) y
I got your number of 9 correct in 7 guesses.
*/

import java.util.*;
class Q1_1{
	public static void main(String[] args){
		System.out.print("This system has you, the user, choose a number between 0 and 10,");
		System.out.println("then I, the computer, will try my best to guess it.");

		char ans='n';
		int count=1;
		while(ans!='y'){
		Random rand=new Random();
		int num=rand.nextInt(10)+1;

		System.out.println("Is it "+num+" ? (y/n)");
		Scanner console=new Scanner(System.in);
		ans=console.next().charAt(0);

		if(ans !='y'){
		count++;
		}else{
		System.out.println("I got your number of "+num+" correct in "+count+" guesses");
		}
	}
}
}
