# CleanThemAll
My first independent project after finishing CodeGym course. It's MVC based puzzle game with Swing graphics. Made in IDEA Community Edition.

Premises of the game:
- blocks of different colors are spread in given regular pattern across 3d matrix (int[][][])
- each color has a certain number of blocks where: number % 3 = 0;
- each block which isn't covered with other blocks can be clicked and moved to a separate array field (length = 7) under the matrix
- if there are 3 blocks of the same color in the array field they get removed
- if there are no more blocks on the map (matrix + array field) the game is won
- if the array field gets full, the game is lost
- game is based on a minigame of the same name from the mobile game Rise of Castles (link)

Development roadmap:
- v0.1 - create a 2d matrix (int[][]) with a single colored block which disappears after clicked
- v0.2 - add another pane at the bottom, the block must be moved there after clicked
- v0.3 - add a list of blocks of different colors, implement an algorithm which populates the (still 2d) matrix at the fixed places
- v0.4 - implement an algorithm which moves clicked blocks to the array field on the bottom, cleans triples, wins the game or loses it
- v0.5 - add another dimension, implement an algorithm which decides which blocks are visible (and clickable), half-visible (and not clickable) and invisible (not clickable)
- v0.6 - when all works well prepare all the missing layers (of 3rd dimension)
- v0.7 - implement "Back" button which can revert the map state to before click (only once)
- v0.8 - using Strategy pattern prepare 3 difficulty levels, with different number of colors used
- v0.9 - try to replace one color with a picture, prepare tests with JUnit
- v1.0 - refactoring, code review, finish
