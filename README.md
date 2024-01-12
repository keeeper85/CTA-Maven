# CleanThemAll
My first independent project after finishing CodeGym course. It's MVC based puzzle game with Swing graphics. Made in IDEA Community Edition (then switched to Idea UE).

Premises of the game:
- squares (total: 360) of different colors are spread (in a regular pattern) across gameboard - 3d matrix (multiple int[][])
- each color has a certain number of squares where: number % 3 = 0;
- each square which isn't covered with other squares can be clicked and moved to a separate "pocket", it's a TreeMap with 7 pairs <PocketSlot, Square>
- if there are 3 squares of the same color in the pocket - they get removed
- if there are no more squares on the gameboard (matrix + array field) the game is won
- if the pocket gets full, the game is lost
- game is based on a minigame of the same name from the mobile game Rise of Castles

How does the app work?

It all starts in model, in the startegy package. As the new model is created it takes one Difficulty parameter - it decides which startegy will produce the squares for the game. 
Easy strategy will make less different colors than normal or difficult. The user chooses the difficulty level through JOptionPane.showOptionDialog method.

When the Queue<Square> with 360 squares is ready, a method in Gameboard class (model package) "giveCoordinates(Queue<Square> allSquaresReadyToPlace)" gives them their x/y/z coordinates so the view knows where to draw them.
Gameboard class uses enum Layers which holds 27 matrixes int[][], each matrix responds to different value of z-dimension. A matrix contains 0 and 1 values - when giveCoordinates method finds 1 - it takes x/y/layer values and sets them to a new point.

Once all Square objects have colors and coordinates, GameboardView method drawSquares() draws them on the JPanel.
Each Square object has a SquareView brother in view package. SquareView is responsible for graphics and listening to mouse clicks. When a click on the square gets registered and accepted (square must be "clickable")
- a method moveToPocket(SquareView squareView, GameboardView gameboardView) in Controller class is called. It tells the model to remove the square from the gameboard and move it to the pocket.
GameboardView class changes the location of this square to the first free slot in Pocket and removes triples if they occur.

Once the pocket gets full, model gameLost() method is called which launches a JOptionPane with score.
Either, if there are no more squares remaining, model gameWon() is called with JOptionPane and congratulations.
