/*
/*(Computer-Assisted Instruction) The use of computers in education is referred to
as computer-assisted instruction (CAI).

i)
Write a program that will help an elementary school student learn multiplication.
Use a Random object to produce two positive one-digit integers. The program
should then prompt the user with a question, such as

How much is 6 times 7?

The student then inputs the answer. Next, the program checks the student’s
answer. If it’s correct, display the message "Very good!" and ask another
multiplication question. If the answer is wrong, display the message "No. Please
try again." and let the student try the same question repeatedly until the
student finally gets it right.

A separate method should be used to generate each new question. This method
should be called once when the application begins execution and each time the
user answers the question correctly.

ii)
One problem in CAI environments is student fatigue. This can be reduced by
varying the computer’s responses to hold the student’s attention. Modify the
program of i) so that various comments are displayed for each answer as follows:

Possible responses to a correct answer:
Very good!
Excellent!
Nice work!
Keep up the good work!

Possible responses to an incorrect answer:
No. Please try again.
Wrong. Try once more.
Don't give up!
No. Keep trying.

Use random-number generation to choose a number from 1 to 4 that will be used
to select one of the four appropriate responses to each correct or incorrect
answer. Use if-else statement to issue the responses.

iii)
More sophisticated computer-assisted instruction systems monitor the student’s
performance over a period of time. Modify the program of ii) to count the number
of correct and incorrect responses typed by the student.

After the student types 10 answers, your program should calculate the
percentage that are correct. If the percentage is lower than 75%, display

" Please ask your teacher for extra help .",

then reset the program so another student can try it. If the percentage is 75% or
higher, display

" Congratulations, you are ready to go to the next level! ",

then reset the program so another student can try it.
*/

import java.util.*;
class Q2_3{
public static void main(String[] args){
	for(int user=1;user>0;user++){
	int times=0;
	int c_ans=0;
	do{
	times=question(times);
	c_ans++;
	}while (times<10);

	int percentage=c_ans*10;
	if(percentage<75){
		System.out.println("Please ask your teacher for extra help.");
	}else{
		System.out.println("Congratulations,you are ready to go to the next level!");
	}
	System.out.println();
}
}

public static int question(int typeANS){
	Random rand=new Random();
		int num1=rand.nextInt(9)+1;
		int num2=rand.nextInt(9)+1;

		System.out.println("How much is "+num1+" times "+num2+" ?");
		Scanner console=new Scanner(System.in);
		int ans=console.nextInt();
		int correct=num1*num2;

		if(ans!=correct){
			typeANS++;
				do{
			wrong();
			ans=console.nextInt();
			typeANS++;
			if(ans==correct){
				correct();
			}
			}while(ans!=correct && typeANS<10);
}

			else{
				typeANS++;
				correct();
			}

		System.out.println();

		return typeANS;

}

public static void wrong(){
	Random rand=new Random();
	int x=rand.nextInt(4)+1;

	if (x==1){
	System.out.println("No. Please try again.");
	}else if(x==2){
	System.out.println("Wrong. Try Once More");
	}else if(x==3){
	System.out.println("Don't  give up!");
	}else{
	System.out.println("No. Keep trying.");
	}
}

public static void correct(){
	Random rand=new Random();
	int x=rand.nextInt(4)+1;

	if (x==1){
	System.out.println("Very good!");
	}else if(x==2){
	System.out.println("Excellent!");
	}else if(x==3){
	System.out.println("Nice Work!");
	}else{
	System.out.println("Keep up the good work!");
	}
}

}
