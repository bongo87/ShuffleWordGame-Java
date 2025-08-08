Project Title: Java Shuffle Word Game (Data Structures Module)

Description: A console-based word shuffling and guessing game developed in Java. This project demonstrates core data structures concepts through a custom ArrayList implementation, a word shuffling algorithm, and game logic for word verification and scoring.

Key Features:

Custom MyArrayList<E> class providing dynamic array functionality.

Wrapper class to manage character display state (e.g., for hints).

Efficient shuffleWord algorithm using MyArrayList's swap method.

verifyWord method for case-insensitive guess checking.

Loads words from an external words10.txt file.

Console-based gameplay with scoring and hints.

How to Compile and Run (for local setup):

Prerequisites: Java Development Kit (JDK) 8 or higher installed.

Clone the repository: git clone [https://github.com/bongo87/Java-ShuffleWordGame.git ](https://github.com/bongo87/ShuffleWordGame-Java/tree/main)

Navigate to the project directory: cd Java-ShuffleWordGame

Compile: javac MyArrayList.java Wrapper.java Wordload.java Tester.java

Run: java Tester

Files Included:

MyArrayList.java: Custom dynamic array implementation.

Wrapper.java: Class to hold characters and their display state.

Wordload.java: Manages loading words and shuffling the MyArrayList of Wrapper objects.

Tester.java: Main game logic and entry point.

words10.txt: Text file containing words used in the game.

Author: Rebone Motswana

Module: Data Structures

Module: Data Structures

