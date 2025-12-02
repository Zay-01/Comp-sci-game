# Void GAME

Basic movement, arrow keys to move boxes

Encounter a enemy on enemy boxes (they move one)


0 0 0 0 0 0 0 0 0 0
0 1 1 2 2 1 1 0 0 0
0 1 1 2 2 1 1 0 0 0
0 2 2 2 2 3 2 0 0 0
0 2 2 2 2 2 2 0 0 0
0 1 1 2 2 1 1 0 0 0
0 1 1 2 2 1 1 0 0 0
0 0 0 0 0 0 0 0 0 0

Each board has a [0] [1] and [2]
[0] - Black void mass
[1] - Terrain
[2] - Movable areas
[3] - Save Point (may not be implemented)

Board -> 10x10 (Planned) OR 5x5 easier to build map

[ENCOUNTER] will not happen, instead its all RNG
[Steps] -> Each time a play steps it will choose a direction, wont go previous location until previous is smth else
Enemy moves up, cant move down until next step
Once moved differently it can go back to spot



