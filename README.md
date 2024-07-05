# Java_21_Book_Sale_System_1

**A practical example of Inheritance**

Write a Java application for a book sales system. The system deals with two types of books: paperback and hardcopy. 

The price of a hardcopy is equal to the price of a paperback multiplied by a certain “hardFactor”.
 
In this Java program you have to create classes Book, Paperback and HardCopy and Driver. Class Book encapsulates the Strings: title, author and the integer year. 

Class Paperback is derived from Book and it encapsulates the double price. 

Class Hardcopy is derived from Book and it encapsulates the price and the “hardFactor”.  
 
Start by writing the class Driver of this Java application. 

In the Driver one creates up to 100 objects of both Paperback and HardCopy type, which are stored in an array of Book references. The loop to enter data will stop when the user enters “quit” instead of the title of the book.  Inside this loop one uses an if/else structure to create either Paperback and HardCopy objects.
 
Next the Driver contains a loop where it uses the method toString() to displayed the title, author, year, type of book.

In the same loop it calculates the prices of all books using the method getPrice().  The format of the output for each book is shown below: 

_Paperback : Java, Horstmann, 2020  
Price = $120.50_

Finally the driver will display using toString() only the books with prices over $100.0. 

After you finish class Driver, write classes Book, Paperback and HardCopy.

