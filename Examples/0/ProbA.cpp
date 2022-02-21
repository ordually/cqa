// Recommended includes for all problems. Some problems
// may require additional libraries.
#include <iostream>
#include <string>
#include <cmath>
#include <cstdlib>
using namespace std;

// main() serves as the entry point to your program - 
// this is how your program will be run. You can use this
// file as a template for solving other problems.
int main()
{
	// All inputs start with the number of test cases. These two
	// lines should always appear in every problem.
	int testCases;
	cin >> testCases;
	// This string and the following "getline" call move the 
	// input cursor past the newline character at the end of
	// the first line. This is important to read more input.
	string dummy;
	getline(cin, dummy);
	
	// This for loop allows us to do the same thing for each
	// test case. This line is the last one common to all
	// problems - inside this loop, things will be different.
	for(int testcase = 0; testcase < testCases; testcase++){
		// For Hello World, we simply want to output whatever
		// text we read in.
		string text;
		getline(cin, text);
		cout << text << '\n';
	}
}
