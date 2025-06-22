package exercise6;

public class Readme {

/*
 * Library Management System
Scenario: You are developing a library management system where users can search for books by title or author.

Goal: Implement linear search and binary search for books.

Steps outlined in the document:

Understand Search Algorithms: Explain linear search and binary search algorithms.
Setup: Create a class Book with attributes like bookId, title, and author.
Implementation:
Implement linear search to find books by title.
Implement binary search to find books by title (assuming the list is sorted).
Analysis:
Compare the time complexity of linear and binary search.
Discuss when to use each algorithm based on the data set size and order.
Solution:

1. Understand Search Algorithms: 

Linear Search (Sequential Search):
Concept: This is the simplest search algorithm. It sequentially checks each element in the list until a match is found or the entire list has been searched.
How it works: Starts from the beginning of the list and compares each element with the target value.
Prerequisites: Does not require the data to be sorted.
Time Complexity: O(N) in the worst and average cases. O(1) in the best case.
Binary Search:
Concept: A much more efficient search algorithm for sorted data. It works by repeatedly dividing the search interval in half.
How it works: It compares the target value with the middle element of the sorted array. If they are not equal, the half in which the target cannot lie is eliminated, and the search continues on the remaining half until the target is found or the interval becomes empty.
Prerequisites: Requires the data to be sorted.
Time Complexity: O(log N) in the worst and average cases. O(1) in the best case.
2. Project Setup:

Create a new Java project named LibraryManagementSystem.

3. Implementation:

Project Structure:

LibraryManagementSystem
├── src
│   └── com
│       └── library
│           ├── Book.java
│           └── BookSearch.java

4.Output:

All Books in the Library:
Book ID: B001, Title: The Great Gatsby, Author: F. Scott Fitzgerald
Book ID: B002, Title: To Kill a Mockingbird, Author: Harper Lee
Book ID: B003, Title: 1984, Author: George Orwell
Book ID: B004, Title: Pride and Prejudice, Author: Jane Austen
Book ID: B005, Title: The Catcher in the Rye, Author: J.D. Salinger

Searching for '1984' using Linear Search:
Found: Book ID: B003, Title: 1984, Author: George Orwell

Searching for '1984' using Binary Search:
Found: Book ID: B003, Title: 1984, Author: George Orwell

4. Analysis: 

Comparison of Time Complexity: 

Linear Search:
Time Complexity: O(N) (Linear) - In the worst case, it has to check every element in the list.
Space Complexity: O(1) (Constant) - Uses a fixed amount of extra memory.
Binary Search:
Time Complexity: O(log N) (Logarithmic) - Halves the search space in each step.
Space Complexity: O(1) (Constant) - For iterative implementation; O(log N) for recursive due to call stack.
Prerequisite: Requires the data to be sorted.
When to use each algorithm based on the data set size and order: 

Use Linear Search when:
Data is unsorted: If the data cannot be easily sorted, or sorting is too expensive (e.g., dynamic data that changes frequently), linear search is the only option among these two.
Small datasets: For very small lists (e.g., less than 50-100 elements), the overhead of sorting for binary search might outweigh the benefits, making linear search simpler and fast enough.
Searching once: If you only need to search the list once or very infrequently.
Use Binary Search when:
Data is sorted: This is a strict prerequisite. If the data is already sorted or can be sorted once and then searched many times, binary search is highly efficient.
Large datasets: For large collections of books, binary search offers significantly faster search times, directly impacting user experience in a library system.
Frequent searches: If search operations are a common and critical part of the application.
In a real-world library management system, where the number of books can be very large, the data would almost certainly be stored in a database with indexes on fields like 'title' and 'author'. These indexes internally use data structures (like B-trees) that provide logarithmic search times, effectively achieving the performance benefits of binary search without requiring manual sorting of arrays in the application layer. However, if dealing with in-memory collections that need to be searched repeatedly, pre-sorting and using binary search is a powerful technique.


 */
}
