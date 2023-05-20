# pascal_triangle
# using iteration:
In this code, we use nested loops to iterate through the rows and columns of Pascal's Triangle. The outer loop (i) iterates over the rows, and the inner loop (j) iterates over the columns within each row.
We initialize the coefficient variable to 1 at the start of each row. We then print the coefficient using System.out.printf with a width of 4 to provide proper spacing between the coefficients. After printing each coefficient,
we update it for the next column using the formula coefficient = coefficient * (i - j) / (j + 1). This formula calculates the current coefficient based on the previous coefficient.
The line System.out.printf("%" + (rows - i) * 2 + "s", ""); is used to add spacing at the beginning of each row to create the triangular shape of Pascal's Triangle. The number of spaces is determined by (rows - i) * 2.
When you run this code, it will output the following Pascal's Triangle:
first row :        1 
second row :     1   1  
third row :     1   2   1 
four row :   1   3   3   1
five row :  1   4   6   4   1
 
# using reursion
In this code, the calculateCoefficient method is a recursive function that takes the row and column indices as parameters and returns the coefficient. If the column is either 0 or equal to the row, we know it is an edge case and the coefficient is 1. Otherwise, we recursively calculate the coefficient by summing the coefficients from the previous row.
The main method iterates through the rows of Pascal's Triangle and prints the coefficients. The inner loop (j) iterates over the columns within each row. We calculate the coefficient using the calculateCoefficient method and print it using System.out.printf with a width of 4 to provide proper spacing between the coefficients.
When you run this code, it will output the following Pascal's Triangle: 
first row :        1 
second row :     1   1  
third row :     1   2   1 
four row :   1   3   3   1
five row :  1   4   6   4   1
# using Recursion with Memoization
In this code, the calculateCoefficient method is a recursive function that takes the row and column indices as parameters and returns the coefficient. We use the same memoization technique as before, but this time we check if the memo map contains the calculated coefficient using the keys key1 and key2. If the coefficient is already in the map, we retrieve it; otherwise, we recursively calculate it.
The rest of the code remains the same as before. We iterate through the rows of Pascal's Triangle and print the coefficients.
The output of this code will be the same as the previous example:
first row :        1 
second row :     1   1  
third row :     1   2   1 
four row :   1   3   3   1
five row :  1   4   6   4   1 
