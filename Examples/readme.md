# Recommended to Start 
| Experience Level	| Recommended Problems | | | 
| --- | --- | --- | --- |
| No experience	| "Not So Self-Driving" Simple if/then/else	| "Recycle!" Simple math	| "No More Shouting" Use of standard functions |
| Foundational	| "Factorial!" A bit more complex math	| "Brick House" A bit more complex math | The Good Ship Input (2022) |
| Intermediate	| "Make The Grade" String manipulation |	"Minesweeper" List manipulation	| "Conway's Game of Life" Grid manipulation | 
| | Codebreaker Returned (2022) | Morse Code (2022) | 
| Expert	| "Bird Watching" Machine learning/k-means	| "Sudoku" Sudoku puzzle solver	| "It's an Enigma!" WWII Enigma machine |
| | Twinkle Twinkle from 2018 (calculating vertices of a star shape) | Dominating Disney from 2018 (travelling salesman) | Plink (2022) |

# Practice Problems by Type or Algorithm
## Recursion
1. [Pascals Triangle](https://lmcodequestacademy.com/problem/pascals-triangle) a neat math-based problem that can be solved with recursion
2. [Tower of Hanoi](https://lmcodequestacademy.com/problem/tower-of-hanoi) for a student wanting more challenge. A traditional computer science problem.
3. From 2022: Plink (todo: add link when available)

## Cryptography
1. It's an Enigma (2018)
2. Codebreaker Returned (2022)

## Object Oriented
Problems that lend themselves to OO design

Quoting Brett Reynolds: 
> Many of our [maze-solving problems](https://lmcodequestacademy.com/tag/mazes) can make use of classes in order to remember the paths taken through the maze, to avoid overlapping or backtracking. These classes can evaluate for themselves the possible "next steps" and also report their lengths and paths, as necessary. These problems do tend to be among our hardest, however.
	
* [LMCoin](https://lmcodequestacademy.com/problem/lmcoin) features a simplified blockchain algorithm, similar to those used by cryptocurrencies. A class could be created to represent a single "block" within the chain.
* [Past is Prologue](https://lmcodequestacademy.com/problem/past-is-prologue) asks you to build a database from which certain information can be extracted. Each item in the database could be represented by a class, responsible for parsing its own data and assisting with analysis of that data.
* Some of our more difficult problems, such as [Flight Finder](https://lmcodequestacademy.com/problem/flight-finder), have you read in a large amount of data, which you then have to use to solve a problem (in that case, finding a flight itinerary that meets strict criteria). As with the previous points, you could use classes to store that data and assist with searching through it.

# Tips 
## Rounding
Round Half Way Away from Zero (0.5->1, -0.5->-1)
From: https://stackoverflow.com/questions/21839140/python-3-rounding-behavior-in-python-2
> Python 2 round in Python 3
> I think you need to write a new function.
```python
def python2round(f):
    if round(f + 1) - round(f) != 1:
        return f + abs(f) / f * 0.5
    return round(f)
```

useful: [GH wiki editing reference](https://docs.github.com/en/get-started/writing-on-github/getting-started-with-writing-and-formatting-on-github/basic-writing-and-formatting-syntax)
