# Hands-on_Lecture_2

This repository holds several solution files regarding two different computational problems. It also has test case files to demonstrate the included solutions work properly.
The two problems to be solved are:
1. **Pascal's Triangle**
2. **Spiral Matrix**
----

## Pascal's Triangle
### Problem Description
In Pascal's triangle, each number is the sum of the two numbers directly above it. This problem asks for a given number of rows of Pascal's triangle.
### Solution Time Complexity
The solution involves three for loops (one to iterate through each row, one to fill the triangle with ones, and another to fill out each row), but of the three loops only two of them consist of operations that take more than an O(n) time complexity. These two loops are the dominant parts of the runtime (since the other loops will consistly add a one to the rows in O(1)) because they iterate through the rows of the triangle and carry out a more complex algorithm to sum up numbers in each row. As a result, the time complexity of the included solution is O(n^2).

## Spiral Matrix
### Problem Description
This problem asks for all elements of an `m x n` matrix to be returned in spiral order.
### Solution Time Complexity
The solution uses a while loop to traverse through the entire matrix. This matrix is made of `n` rows and `m` columns, which means the while loop traverses the entire length of the matrix's rows and columns (by using four different for loops to iterate through the matrix in spiral order). Since the solution will traverse at most `n` rows `m` number of times, the overall time complexity of this solution is O(n*m).

----
###### Resources and References:
https://www.google.com  
https://testgrid.io/blog/junit-testing/