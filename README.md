# simpleMaze
A simple maze game for the Unix command line!

# How to install/run:

* Clone the repository to your local machine -

    $ git clone https://github.com/davidbrazilparker/simpleMaze.git

* Compile the mainmethod file -

    $ javac mainmethod.java

* Run the mainmethod file -

    $ java mainmethod

# How to play:

    * The game will start and generate a new maze each time you run the mainmethod.java file.

    * Your goal is to navigate the maze and find the exit!

    * Each room you enter will be printed out on your screen.

        Example:

        +---------/Back\---------+
        |                        |
        |         MAGENTA        |
        |                        |
        +----\1/----------\2/----+

    * In order to navigate through the maze, type in 'back', '1', or '2' depending on what you see in the current room.

    * Each room has it's own unique color that distinguishes it from all the other rooms.

This game is meant to be extremely easy right now. If you'd like updates please check back soon and do a git pull from your local repository.

# To-Do List:

* Create additional mazes with varied difficulties, lengths, and more colors!

* Release JAR file executable

* Improve upon GUI and representation of room colors.

* Timer for speed of maze solving.

* High-score board

* Log-in feature to save best scores/share scores with other players.

* MySQL server to store data for high-score, user log in, etc...
