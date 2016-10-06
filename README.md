# IS2545 - DELIVERABLE 2: Unit Testing

![build status](https://travis-ci.org/asphaltpanthers/CitySim9002.svg?branch=master)

This is a homework for IS2545 Software Quality Assurance.
A program that simulates the toursting process for four kinds of people in City Of Pittsburgh and corresponding test code are included in this project.

Some issues I encountered:

1. I find it hard to test the tourist method in CitySim9002 class. The reason is that it includes two loops. If I pass in a test double of Random class which returns 4 when its nextInt(5) method is called, the program will fall into the first (infinite) loop. If I change the return value to something other than 4 (0 ~ 3), the program will fall into the second (infinite) loop. However, I find a solution. I can generate chaining thenReturn methods as stubs. For example, when(mockRandom.nextInt(5)).thenReturn(4).thenReturn(0).thenReturn(3).thenReturn(4) In this case, the stub of nextInt(5) method will return 4, then return 0, then return 3, then return 4. This is exactly what I want. So I solve the problem via this way.
2. I feel confused about "excluding the main method". So we are required to test each public method that returns a value for this homework. And we are not required to test the main method. Is this a common practice in real life? As far as I'm concerned, the main method can also include many program logics. Take my code as an example, I use a loop to traverse all five visitors. The loop conditions are not tested. Actually, I can put all program logics into main method to relieve "trouble" of writing test codes. Apparently I didn't do that. I think in real life, main method should only contain very simple logics.
3. There are some getters and setters methods in my Visitor class. I chose not to test them to avoid over-testing.
4. I'm confused about the meaning of package names. So we have a Validator in Domain package, other program classes in Program package. And we have another Domain package under Test Packages. I want to know what does "Domain" mean here, why we separate Validator and other program classes. And also, I believe a custom in Java programming is to use lowercase package names. I wonder why all package names in this project are uppercase.
5. It would be great if the Instructor can provide a sample of the finished project and corresponding comments. I would like to hear any suggestion regarding the test codes and program codes.