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
