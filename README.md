ProgAssgmnt1
============
Programming Assignment 1

This is an team assignment. For this assignment you will develop a design for a First Person Shooter (FPS) video game. You are to develop a high level architectural design of this system, and the objects that exist in and compose it. You will list the relevant classes for each object, and describe their attributes and behaviors.

Once the design for your system is complete, you are to develop skeletal code for this system, that is, Java classes for each of the classes, with their fields (representing attributes) and methods (representing behaviors). Again, this is skeletal code, so all the methods should remain empty, or filled with dummy code to make it compile (e.g. return null; if the methods declares that it returns some object).

You should also submit appropriate documentation supporting your design: what did you have in mind when you came up with the different classes, how do you envision this system working in the future?. Finally, you should include lessons learned with this exercise (as specified on the assignment guidelines). Remember to Javadoc the code with meaningful comments.

Follow the submission guidelines and send me an email with the compressed file. You will also submit a print-out of the source code and relevant documentation in class, during the class meeting immediately after the due date.

This assignment is worth 25 points.

Due: Wednesday April 16th, 2014 at start of class.

Team b(a^2)kd:

-Ben Nickerson (Team Captain)
-Andrew Nipp
-Andrew Niklas
-Dyaln Nguyen
-Kurt Newcomb

Approach:

We decided to make a simple FPS, using only two game types: Capture the Flag and Death Match. Basically, everything occurs within the Levels class. If the User or Enemy decides to shoot, it runs it through Levels to determine if anything gets hit. The same goes for flag running. The User will rely on an input stream, but the Enemy class is much more detailed since it recieves to input. The weapons class is primarily for passing information to the User and Enemy. Finally, the Game class passes information about the gameType to the Levels class. If this code were finished, it should be a fairly straight forward game.

Lessons Learned:

There is a great deal of consideration and organization that goes into this kind of thing. Especialy when we have multiple people working on different classes and have them trying to bring everything together. Even with all the edits made, I cannot help but feel that we probably missed something. That's the biggest issue with programming in general, we need to keep in sight of the big picture or else all of the little incremental additions we make will clash with eachother and ruin the program. Also of note is the proper formatting of API, it is not so much something that is dificult, but it does have a learning curve. In the future, we will likely try to outline the code more completely before diving in.
