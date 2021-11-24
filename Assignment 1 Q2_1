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
*/

import java.util.*;
class Q2_1{
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
				System.out.println("No. Please try again.");
				ans=console.nextInt();
				}while(ans!=correct);
			}
		System.out.println("Very good!");
}

}
