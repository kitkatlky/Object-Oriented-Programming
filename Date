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


public class Date{
	int year;
	int month;
	int day;

	public Date(int year,int month, int day){
		this.year=year;
		this.month=month;
		this.day=day;
	}

	public void addDay(int day){
		int add=this.day+day;
		calculation(add);
	}

	public void addWeeks(int weeks){
		int add=this.day+weeks*7;
		calculation(add);
	}

	public int daysTo(Date other){
		int year_d=other.year-this.year;
		int month_d=other.month-this.month;
		int day_d=other.day-this.day;


				int daysInMonthD=0;
				if(this.month==1 && month_d>0){
					daysInMonthD=31;
					if(month_d>=2){
					if(this.year%4==0 && this.year%100!=0 && this.year%400==0){
						daysInMonthD+=29;
						}
						else {
						daysInMonthD+=28;
					}
					for(int i=3;i<=month_d;i+=2){
						daysInMonthD+=31;
					}
					for(int i=4;i<=month_d;i+=2){
						daysInMonthD+=30;
					}
				}
				}

				if(this.month==3 ||this.month==5||this.month==7||this.month==8||this.month==10||this.month==12){
					for(int i=1;i<=month_d;i+=2){
						daysInMonthD+=31;
					}
					for(int i=2;i<=month_d;i+=2){
						daysInMonthD+=30;
					}
				}

				else if(this.month==2){
					if(this.year%4==0 && this.year%100!=0 && this.year%400==0){
						daysInMonthD=29;
					}
					else {
						daysInMonthD=28;
					}
						for(int i=2;i<=month_d;i+=2){
						daysInMonthD+=31;
						}
						for(int i=3;i<=month_d;i+=2){
						daysInMonthD+=30;
						}
				}

				else if(this.month==4||this.month==6||this.month==9||this.month==11){
					for(int i=1;i<=month_d;i+=2){
						daysInMonthD+=30;
					}
					for(int i=2;i<=month_d;i+=2){
						daysInMonthD+=31;
					}
				}

		return (year_d*365+daysInMonthD+day_d);
	}

	public boolean equals (Object o){
		Date other=(Date) o;
		return(other.year==this.year && other.month==this.month && other.day==this.day);
	}

	public int getDay(){
		return day;
	}

	public int getMonth(){
		return month;
	}

	public int getYear(){
		return year;
	}

	public String toString(){
		return "("+day+"/"+month+"/"+year+")";
	}

	public void calculation(int a){
		do{
		if((this.month==1 ||this.month==3 ||this.month==5||this.month==7||this.month==8||this.month==10||this.month==12) && a>31){
				this.month++;
				a-=31;
		}
		else if(this.month==2){
			if(this.year%4==0 && this.year%100!=0 && this.year%400==0){
				if(a>29){
					this.month++;
					a-=29;
				}
			}
			else {
				if(a>28){
					this.month++;
					a-=28;
				}
			}
		}
		else if((this.month==4||this.month==6||this.month==9||this.month==11) && a>30){
			this.month++;
			a-=30;
		}
	}while(a>31);
		this.day=a;
		this.month=calculation_month(this.month);
	}

	public int calculation_month(int q){
		if(q>12){
			this.year++;
			return q-12;
		}
		else {
			return q;
		}

}
}
