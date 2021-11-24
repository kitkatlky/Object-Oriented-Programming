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
*/

import java.util.*;
class Q2_2{
public static void main(String[] args){
	for(int i=1;i>0;i++){
	question();
}
}

public static void question(){
	Random rand=new Random();
		int num1=rand.nextInt(9)+1;
		int num2=rand.nextInt(9)+1;

		System.out.println("How much is "+num1+" times "+num2+" ?");
		Scanner console=new Scanner(System.in);
		int ans=console.nextInt();
		int correct=num1*num2;

		if(ans!=correct){
			do{
				wrong();
				ans=console.nextInt();
				}while(ans!=correct);
		}
		correct();

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
