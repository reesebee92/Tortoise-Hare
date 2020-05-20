# Tortoise-Hare

The purpose of this project is to practice using the Java basics to display a race between a tortoise and hare. Up until this point no object-oriented topics had been covered.

Design

The specifications of the program are to display the results between a Hare and a Tortoise until one or both reaches the winning position.  The use of a random number generator will be used to keep numerical track of the positions for both contenders. The only displays will be: And They’re Off!, Ouch, T, H, Hare Wins!, Tortoise Wins!, and/or It’s a Tie! My design will include 4 methods (not including main) winnerUpdate(), randomMoveHare(), randomMoveTortoise(), display(). I will use a while loop to continue updating the contenders postions while calling randomMoveHare(), randomMoveTortoise(), and display(). The winnerUpdate() will be called once the race is over. The call to randomMoveHare() and randomMoveTortoise() will include a random number generator to pass a parameter to both methods and allow for continuous calls using a different random number each time until the race is over. The use of a switch statement will work fine to return the appropriate value based on the percentages of an event occurring.

Final Design with Changes

Once I began to code the program, there were several flaws and I had to change the design a bit. First, my while loop was not exiting properly so I created a Boolean value to allow for proper and clean exiting of the while loop. However, this did not solve the problem completely and I had to also change where the number generator was placed in the program. The number generator was originally within the main method, but I had to move it into the randomMoveHare() and randomMoveTortoise() methods to fix the “random” number that was generated. Once I did that the program was working properly, but then another issue. I had a print statement for my own personal debugging and the winning results would print before the winning position was surpassed, so I thought. A simple display() call inside the test statement, used to exit the loop, fixed this issue! I also eliminated the winnerUpdate() method because the winning update is only announced at the end.

What I Learned

The biggest thing I learned doing this project is how to perceive the likelihood of an event occurring and actually using those percentages to write a program and display it! I do not think I would have attempted to solve a problem in such a way.

I also learned variable placement is crucial to what you really want displayed. Meaning logic errors are the hardest to debug!
