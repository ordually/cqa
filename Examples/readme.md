
| Experience Level	| Recommended Problems | | | 
| --- | --- | --- | --- |
| No experience	| "Not So Self-Driving" Simple if/then/else	| "Recycle!" Simple math	| "No More Shouting" Use of standard functions |
| Foundational	| "Factorial!" A bit more complex math	| "Brick House" A bit more complex math | ~~"Time and Time Again" String parsing~~
| Intermediate	| "Make The Grade" String manipulation |	"Minesweeper" List manipulation	| "Conway's Game of Life" Grid manipulation | 
| Expert	| "Bird Watching" Machine learning/k-means	| "Sudoku" Sudoku puzzle solver	| "It's an Enigma!" WWII Enigma machine |

= Tips 
== Rounding
Round Half Way Away from Zero (0.5->1, -0.5->-1)
See: https://stackoverflow.com/questions/21839140/python-3-rounding-behavior-in-python-2
> Python 2 round in Python 3
I think you need to write a new function.

```
def python2round(f):
    if round(f + 1) - round(f) != 1:
        return f + abs(f) / f * 0.5
    return round(f)
```

useful: [GH wiki editing reference (https://docs.github.com/en/get-started/writing-on-github/getting-started-with-writing-and-formatting-on-github/basic-writing-and-formatting-syntax)]
