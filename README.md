# Object-Oriented-Programming

If you've never used an object-oriented programming language before, you'll need to learn a few basic concepts before you can begin writing any code. This lesson will introduce you to objects, classes, inheritance, interfaces, and packages. Each discussion focuses on how these concepts relate to the real world, while simultaneously providing an introduction to the syntax of the Java programming language.

What Is an Object?
An object is a software bundle of related state and behavior. Software objects are often used to model the real-world objects that you find in everyday life. This lesson explains how state and behavior are represented within an object, introduces the concept of data encapsulation, and explains the benefits of designing your software in this manner.

What Is a Class?
A class is a blueprint or prototype from which objects are created. This section defines a class that models the state and behavior of a real-world object. It intentionally focuses on the basics, showing how even a simple class can cleanly model state and behavior.

source: The Java Tutorials

ASSIGNMENT 1 [Assignment 1.pdf](https://github.com/kitkatlky/Object-Oriented-Programming/files/7597576/Assignment.1.pdf)

Question 1.1
i)  Write a program that plays a reverse guessing game with the user. The
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
    
ii) Then, modify your program to consider having the user hint to the
    computer whether the correct number is higher or lower than the
    computer's guess. The computer should adjust its range of random
    guesses based on the hint.
    
    
Question 1.2
(Computer-Assisted Instruction) The use of computers in education is referred to
as computer-assisted instruction (CAI).

i)  Write a program that will help an elementary school student learn multiplication.
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
    
ii) One problem in CAI environments is student fatigue. This can be reduced by
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
    
iii)  More sophisticated computer-assisted instruction systems monitor the student’s
      performance over a period of time. Modify the program of ii) to count the number
      of correct and incorrect responses typed by the student.
      
      After the student types 10 answers, your program should calculate the
      percentage that are correct. If the percentage is lower than 75%, display
      
      " Please ask your teacher for extra help .",
      
      then reset the program so another student can try it. If the percentage is 75% or
      higher, display
      
      " Congratulations, you are ready to go to the next level! ",
      
      then reset the program so another student can try it.



ASSIGNMENT 2 [Assignment 2.pdf](https://github.com/kitkatlky/Object-Oriented-Programming/files/7597734/Assignment.2.pdf)

1.
Write a class named GroceryList that represents a person's list of items to buy from the 
market, and another class named GroceryItemOrder that represents a request to purchase 
a particular item in a given quantity (example: 4 boxes of cookies).

The GroceryList class should use an array field to store the grocery items, as well as 
keeping track of its size (number of items in the list so far). Assume that a grocery list 
will have no more than 10 items. A GroceryList object should have the following methods:

        public GroceryList()
        Constructs a new empty grocery list.
        
        public void add(GroceryItemOrder item)
        Adds the given item order to this list, if the list is not full (has fewer than 10 items).
        
        public double getTotalCost()
        Returns the total sum cost of all grocery item orders in this list.
        
The GroceryItemOrder class should store an item quantity and price per unit. 
A GroceryItemOrder object should have the following methods:

        public GroceryItemOrder(String name, int quantity, double pricePerUnit) 
        Constructs an item order to purchase the item with the given name, in the given quantity,
        which costs the given price per unit.
        
        public double getCost()
        Returns the total cost of this item in its given quantity. For example, 4 boxes of 
        cookies that are 2.30 per unit have a cost of 9.20.
        
        public void setQuantity(int quantity)
        Sets this grocery item's quantity to be the given value.
       
2.
Write a class named Date that represents a date consisting of a year, month, and day. 
A Date object should have the following methods:

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
