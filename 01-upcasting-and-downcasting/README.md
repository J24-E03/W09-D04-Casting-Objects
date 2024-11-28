# Upcasting and Downcasting

#### Objective: 
To understand the concept of upcasting and downcasting and perform casting between related classes.

#### Time Required: 15 minutes

#### Difficulty Level: Beginner

#### Scenario: 
You are working on a project to create a simple game. You have a base class "Game" and two subclasses "Chess" and "TicTacToe". You need to perform casting between the classes.

#### Task List:

* Create a base class "Game" with a method "play()"
* Create two subclasses "Chess" and "TicTacToe" that inherit from the "Game" class and override the "play()" method.
* In the main method, create an object of the "Chess" class and upcast it to the "Game" class.
* Call the "play()" method on the upcasted object and observe the output.
* In the main method, create an object of the "Game" class and downcast it to the "Chess" class.
* Call the "play()" method on the downcasted object and observe the output.

#### Expected Output:
<pre>
Chess play method is called.
Chess play method is called.
