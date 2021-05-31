# FibonacciFactorial
Exercise 9.1 from Eck, D. J. (2019). Introduction to programming using Java, version 8.1. Hobart and William Smith Colleges. http://math.hws.edu/javanotes

In many textbooks, the first examples of recursion are the mathematical functions factorial and fibonacci. These functions are defined for non-negative integers using the following recursive formulas:
           factorial(0)  =  1
           factorial(N)  =  N*factorial(N-1)   for N > 0
           fibonacci(0)  =  1
           fibonacci(1)  =  1
           fibonacci(N)  =  fibonacci(N-1) + fibonacci(N-2)   for N > 1
           
Write recursive functions to compute factorial(N) and fibonacci(N) for a given non- negative integer N, and write a main() routine to test your functions. Consider using the BigInteger class (see Exercise 8.2)

(In fact, factorial and fibonacci are really not very good examples of recursion, since the most natural way to compute them is to use simple for loops. Furthermore, fibonacci is a particularly bad example, since the natural recursive approach to computing this function is extremely inefficient.)
