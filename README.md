# Practice
Practice Project for assignments
COMI 1510 Java Programming Lesson 3 Programming Assignment
Specifications
Problem Description
You are going to write a program that obtains hawk count data from the keyboard, in a loop, until the user enters a sentinel value of -1.
The program will allow the user to track the following species:
 Osprey
 Bald Eagle
 Cooper’s Hawk
 Red-Shouldered Hawk
 Red-Tailed Hawk
The program is based on the hawk counts that are carried out around the country. Here is an example of data collected on Mount Wachusett in Princeton, Massachusetts:
http://hawkcount.org/month_summary.php?rsite=228
The user will enter first the hawk type and then the count. After the user has finished entering data and has entered the sentinel value, the program will display a summary table composed of the species, number of birds observed of that species, and percentage of overall hawks represented by that species. Percentages will show two decimal places.
The program will validate the bird species as they are entered. If the user enters anything other than -1 (the sentinel) or 1-5 (valid species codes), then they will receive the message, “That is an invalid hawk species.”
The program will validate the counts as they are entered. Any value less than 0 will receive the message “That is an invalid count,” and the invalid count will be disregarded. Counts will be entered as whole numbers.
Make sure to avoid a divide-by-zero error if no hawk data is entered.
Use Cases
Use cases are written before the program is designed.
You may use actual hawk count data from the hawkcount.org website if you wish for your use cases, or you may use it as a guide for what a natural range of counts on a given day look like, and invent your own use cases. Use cases should thoroughly test the program, so it is probably best to invent your own use cases unless you see data that is exactly what you need to test your program.
A use case:
What species of hawk?
1 - Osprey, 2 - Bald Eagle, 3 - Cooper's Hawk, 4 - Red Shouldered Hawk, 5 - Red-Tailed Hawk, -1 to quit: 1
How many were seen? 2
What species of hawk?
1 - Osprey, 2 - Bald Eagle, 3 - Cooper's Hawk, 4 - Red Shouldered Hawk, 5 - Red-Tailed Hawk, -1 to quit: 4
How many were seen? 5
What species of hawk?
1 - Osprey, 2 - Bald Eagle, 3 - Cooper's Hawk, 4 - Red Shouldered Hawk, 5 - Red-Tailed Hawk, -1 to quit: 4
How many were seen? 3
What species of hawk?
1 - Osprey, 2 - Bald Eagle, 3 - Cooper's Hawk, 4 - Red Shouldered Hawk, 5 - Red-Tailed Hawk, -1 to quit: 5
How many were seen? -1
That is an invalid count.
What species of hawk?
1 - Osprey, 2 - Bald Eagle, 3 - Cooper's Hawk, 4 - Red Shouldered Hawk, 5 - Red-Tailed Hawk, -1 to quit: -1
Species Number % of Total
Osprey 2 20.00
Bald Eagle 0 0.00
Cooper's Hawk 0 0.00
Red-Shouldered Hawk 8 80.00
Red-Tailed Hawk 0 0.00
Write up a minimum of two additional use cases to show how the program should run with different inputs.
Use only programming techniques that were covered in Chapters 1-4 and my videos. Meeting specifications and making good design choices are critically important.
Turn in
1. Your java program (the .java file only). Make sure that it meets the requirements of the rubric.
2. A word-processed document containing the following:
Section 1: Use Cases
Include your additional use cases, written and computed before you write the program. You should have at least two additional use cases. Write an explanation of why you chose the inputs you chose. Your use cases should be designed to thoroughly test the program.
Section 2: Testing
Copy and paste your program executing on all of the use cases (mine and yours). Discuss any errors currently in your program, including what you did to try to find the source of the error and correct the error.
Section 3: Extra Credit
If you wrote a post to the discussion board that is worth bonus points (see requirements on the discussion board), then copy and paste (or use the snipping tool and take a screen shot and paste) the discussion post here. If you answered a question, then please copy and paste both the question, your answer, and any additional answers that were provided.
Zip the java file and the word-processed document into a folder named JavaProject3_your initials, for example, JavaProject3_msb.
Upload the zipped folder to Blackboard.
Rubric
An exceptional-quality assignment will meet the following standards:
 Meeting functional and design specifications, 75 points The Java program works and meets all of the specifications, with no additional unspecified functionality. (If specifications are not met, a thorough and reflective analysis is provided in the testing section, but points are reduced for missed specifications.) Test cases are thorough and justified. Testing is thorough.
 Communicating with identifiers and white space, 12.5 points The program makes appropriate use of variables. Variables and constants are named according to convention and are named for understandability and purpose. White space, both vertical and horizontal, is correctly used for readability and meets programming conventions.
 Communicating through documentation, 12.5 points The Java program contains comments including the programmer’s name and date. There are block comments (as many as necessary) for each distinct block of code which accurately describe what the block is accomplishing by relating the code to the problem being solved. Javadoc is included and meets the javadoc standards.
