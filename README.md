# SYSC3303-Assignment1
#README

SYSC3303 Assignment 1 - PB&J Maker
Guy Morgenshtern 101151430

Premise:
To use multiple consumer and one producer thread in order to create exactly 20 peanut butter and jam sandwiches. The table is synchronised using the block synchronisation method, meaning only one object can access it at a time.

File names:
- Table: a shared resource for Agent and Chef to access and add to/take from
- Agent: Randomly adds 2 of 3 possible PB&J ingredients to the table when it is empty. (File name specified in the assignment instruction)
- Chef: Uses the ingredients on the table to finish creating the sandwich. Each chef has a type variable in it that denotes the ingredient they are responsible for
- SandwichSimulator: Contains the main method to begin the PB&J sandwich simulation

How to run:
Unzip the assignment submission , open the project in Eclipse Java Edition, run the main method within SandwichSimulator.java
