# Recommended imports for all problems
# Some problems may require more
import sys
import math
import string

## windows hack
sys.stdin = open("1.in")

# Always start with reading in the number
# of test cases from standard input. The
# rstrip() method removes the lingering newline
cases = int(sys.stdin.readline().rstrip())
# Loop for each test case. This is the last line
# common to all problems; the content of this
# loop will change based on the problem solved.
for caseNum in range(cases):
    ## Sample input
    ## 5 3
    ## <5 names>
    ## <3 names>

    # For problem B, we need to read in our data
    dataString = sys.stdin.readline()
    data = dataString.split(" ")

    # then we need to convert it to numbers
    shipyardDataLength = int(data[0])
    #print(shipyardDataLength)
    shipDataLength = int(data[1])
    #print(shipDataLength)

    shipyardData = []
    shipData = []

    for i in range(shipyardDataLength):
        ## NG:
        #shipData[i] = sys.stdin.readline()
        # append to the list
        ## for an array behavior, initialize first
        ## see: https://stackoverflow.com/questions/6667201/how-to-define-a-two-dimensional-array
        ##     and 
        ##     numpy 
        ##       https://numpy.org/doc/stable/reference/generated/numpy.zeros.html

        shipyardData.append(sys.stdin.readline().strip())


    for i in range(shipDataLength):
        shipData.append(sys.stdin.readline().strip())

    #print(shipyardData)

    result = shipyardData.copy()

    #print(shipData)

    
    for e in shipData:
        if e in shipyardData:
            result.remove(e)

    for r in result:
        print(r)

##
# What I learned:
# 0. Tabs vs Spaces, pick one and don't mix
# 1. VSCode: Set settings (ctrl+,) settings.json add: "python.autoComplete.addBrackets": true,
# 2. use .strip on the inputs
# 3. Lists: 
#     - use .append to add, .copy for shallow, .deepcopy for deep
#     - use List Comprehension to modify
#     see: https://docs.python.org/3/tutorial/datastructures.html
#      in particular, 5.1.3:
#            5.1.3. List Comprehensions
#               List comprehensions provide a concise way to create lists. Common applications are to make new lists where each element is the result of some operations applied to each member of another sequence or iterable, or to create a subsequence of those elements that satisfy a certain condition.
