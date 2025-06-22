package exercise4;

public class Readme {

/*
 * Exercise 4: Employee Management System
Scenario: You are developing an employee management system for a company. Efficiently managing employee records is crucial.

Goal: Implement an employee management system using an array.

Steps outlined in the document:

Understand Array Representation: Explain how arrays are represented in memory and their advantages.
Setup: Create a class Employee with attributes like employeeId, name, position, and salary.
Implementation:
Use an array to store employee records.
Implement methods to add, search, traverse, and delete employees in the array.
Analysis:
Analyze the time complexity of each operation (add, search, traverse, delete).
Discuss the limitations of arrays and when to use them.
Solution:

1. Understand Array Representation: 

How arrays are represented in memory:
Arrays are contiguous blocks of memory. This means that all elements of an array are stored next to each other in a single, unbroken sequence of memory locations.
Each element can be accessed directly using its index. If the starting address of the array and the size of each element are known, the address of any element can be calculated using a simple formula: address_of_element[i] = base_address + i * element_size.
Advantages of arrays:
Fast Access (Random Access): Because of their contiguous memory allocation and direct indexing, accessing any element by its index (e.g., arr[5]) is very fast, taking constant time, O(1).
Memory Locality/Cache Performance: Storing elements contiguously often leads to better cache performance, as nearby elements are likely to be brought into the CPU cache together.
Simplicity: Arrays are fundamental and simple data structures to understand and implement.
Space Efficiency: They typically have less memory overhead compared to linked data structures, as they don't store pointers for each element.
2. Project Setup:

Create a new Java project named EmployeeManagementSystem.

3. Implementation:

Project Structure:

EmployeeManagementSystem
├── src
│   └── com
│       └── employees
│           ├── Employee.java
│           ├── EmployeeManager.java
│           └── EmployeeTest.java

4.Output:
All Employees:
ID: E001, Name: Alice, Position: Manager, Salary: $75000.0
ID: E002, Name: Bob, Position: Developer, Salary: $60000.0
ID: E003, Name: Charlie, Position: Designer, Salary: $50000.0

Searching for employee E002:
Found: ID: E002, Name: Bob, Position: Developer, Salary: $60000.0

Deleting employee E002:
All Employees after deletion:
ID: E001, Name: Alice, Position: Manager, Salary: $75000.0
ID: E003, Name: Charlie, Position: Designer, Salary: $50000.0
4. Analysis: 

Time Complexity of Each Operation (using a fixed-size array): 

Add (addEmployee):
Average Case: O(1) - If there's space, it's a direct assignment to the currentSize index.
Worst Case: O(1) - Same as average, assuming capacity check is constant time. However, if the array is full and needs resizing (like ArrayList does internally), that would be O(N).
Search (searchEmployee - by ID):
Average Case: O(N) - On average, you have to check half the elements.
Worst Case: O(N) - The element is at the very end or not found, requiring a full scan of N elements.
Traverse (traverseEmployees):
Average Case: O(N) - You need to visit every element in the array.
Worst Case: O(N) - Same as average.
Delete (deleteEmployee - by ID):
Average Case: O(N) - First, you need to find the element (O(N)). Then, shifting remaining elements to fill the gap takes O(N) operations. So, O(N) + O(N) = O(N).
Worst Case: O(N) - Similar to average, if the element to delete is at the beginning, requiring almost all elements to be shifted.
Limitations of Arrays and When to Use Them: 

Limitations:
Fixed Size: The most significant limitation is their fixed size. Once an array is created, its size cannot be changed. If you need to store more elements than the initial capacity, you have to create a new, larger array and copy all existing elements, which is an expensive O(N) operation.
Inefficient Insertions/Deletions (in the middle): Adding or removing elements from the middle of an array requires shifting subsequent elements, leading to O(N) time complexity.
Memory Waste: If the array is allocated with a large capacity but only a few elements are stored, there can be significant wasted memory. Conversely, if it's too small, frequent resizing is costly.
When to Use Arrays:
Fixed Number of Elements: When the maximum number of elements is known in advance and doesn't change frequently.
Frequent Random Access: When you need very fast O(1) access to elements by their index.
Memory Efficiency (when full): When memory is a critical concern and the array will be mostly full, as they have less overhead than linked data structures.
Primitive Data Types: Arrays are efficient for storing primitive data types.
Underlying Data Structure: They are often used as the underlying data structure for other dynamic data structures (like ArrayList which is a dynamic array) or algorithms (like sorting).
For an employee management system where the number of employees can change frequently and deletions/additions are common, a plain array might not be the most optimal choice for dynamic operations due to its fixed size and O(N) complexity for insertions/deletions. ArrayList (dynamic array) or HashMap (if employee ID is the primary key for frequent lookups) would generally be more suitable in a real-world scenario.


 */
}
