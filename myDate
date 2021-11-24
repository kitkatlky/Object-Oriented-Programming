/*
Write a class named Date that represents a date consisting of a year, month, and day. A Date object should have the following methods:

    public Date(int year, int month, int day)
    Constructs a new Date to represent the given date.

    public void addDays(int days)
    Moves this Date object forward in time by the given number of days.
    
    public void addWeeks(int weeks)
    Moves this Date object forward in time by the given number of 7-day weeks.
    
    public int daysTo(Date other)
    Returns the number of days that this Date must be adjusted to make it equal 
    to the given other Date.
    
    public boolean equals(Object o)
    Returns whether two Date objects represent the same calendar date.
    
    public int getDay()
    Returns this Date's day value; for example, for the date 2006/07/22, returns 22.
    
    public int getMonth()
    Returns this Date's month value; for example, for the date 2006/07/22, returns 7.
    
    public int getYear()
    Returns this Date's year value; for example, for the date 2006/07/22, returns 2006.
Then, create the client code name myDate to use and test the Date class.
*/


import java.util.*;

public class myDate{
	public static void main(String[] args){
		Scanner console=new Scanner(System.in);
		System.out.println("Enter your Date(year) :");
		int year=console.nextInt();
		System.out.println("Enter your Date(month) :");
		int month=console.nextInt();
		System.out.println("Enter your Date(day) :");
		int day=console.nextInt();
		Date set=new Date(year,month,day);
		System.out.println("Your date is "+set.toString());

		System.out.println();

		System.out.println("Enter the days you want to add :");
		set.addDay(console.nextInt());

		System.out.println("Enter the weeks you want to add :");
		set.addWeeks(console.nextInt());

		System.out.println();
		System.out.println("Enter the date you want to reach(year) :");
		int year_1=console.nextInt();
		System.out.println("Enter the date you want to reach(month) :");
		int month_1=console.nextInt();
		System.out.println("Enter the date you want to reach(day) :");
		int day_1=console.nextInt();
		Date set_1=new Date(year_1,month_1,day_1);
		System.out.println("Your date you want is "+set_1.toString());

		System.out.println();
		boolean ans=set.equals(set_1);
		if(ans==false){
			int add_d=set.daysTo(set_1);
			System.out.println(ans);
			System.out.println("you need to add more "+add_d+" days to reach it");
			System.out.println("the days and weeks that you add will reach "+set.toString());
		}
		else{
			System.out.println(ans);
		}



	}


}
