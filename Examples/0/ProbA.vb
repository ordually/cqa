Option Explicit On

Module HelloWorld

	' The Main subroutine is the entry point for your program;
	' make sure to include it! This file can be used as a
	' template for solving all Code Quest problems
    Sub Main(args As String())
		' All inputs starts with the number of test cases.
		' These next two lines should appear in every solution.
        Dim i As Integer
        Int32.TryParse(Console.ReadLine(), i)
		' Now we need to do something for each test case. This
		' For loop allows us to do that. These two lines are the
		' last two common to all problems; inside the loop, it'll
		' be different for each problem.
        Dim test As Integer = 0
        For test = 0 To (i - 1)
			' For Hello World, we just want to print out whatever
			' text we read in.
            Console.WriteLine(Console.ReadLine())
        Next
    End Sub

End Module
