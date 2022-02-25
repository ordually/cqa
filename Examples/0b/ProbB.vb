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
			' For Not So Self-Driving, we need to read in our data
			Dim dataString As String
			dataString = Console.ReadLine()
			' Then pull out the numbers to work on
			Dim data As String()
			data = dataString.Split(New Char(){":"c})
			Dim velocity As Double
			Dim distance As Double
			Double.TryParse(data(0), velocity)
			Double.TryParse(data(1), distance)
			' Calculate time to collision
			If velocity = 0.0 Then
				Console.WriteLine("SAFE")
			Else
				Dim time As Double
				time = distance / velocity
				' Respond accordingly
				If time <= 1.0 Then
					Console.WriteLine("SWERVE")
				Else If time <= 5.0 Then
					Console.WriteLine("BRAKE")
				Else
					Console.WriteLine("SAFE")
				End If
			End If
        Next
    End Sub

End Module
