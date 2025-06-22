package exercise5;

public class Readme {

/*
 * Task Management System
Scenario: You are developing a task management system where tasks need to be added, deleted, and traversed efficiently.

Goal: Implement a singly linked list to manage tasks.

Steps outlined in the document:

Understand Linked Lists: Explain the different types of linked lists (Singly Linked List, Doubly Linked List).
Setup: Create a class Task with attributes like taskId, taskName, and status.
Implementation:
Implement a singly linked list to manage tasks.
Implement methods to add, search, traverse, and delete tasks in the linked list.
Analysis:
Analyze the time complexity of each operation.
Discuss the advantages of linked lists over arrays for dynamic data.
Solution:

1. Understand Linked Lists: 

Singly Linked List:
Concept: A linear data structure where each element (called a node) contains two parts:
The data (or value) of the element.
A pointer (or reference) to the next node in the sequence.
The last node's pointer points to null, signifying the end of the list.
Access to elements is sequential, starting from the head (the first node).
Advantages: Efficient insertions and deletions at the beginning (O(1)).
Disadvantages: Traversal is only in one direction. Accessing an element in the middle or at the end requires traversing from the beginning (O(N)).
Doubly Linked List:
Concept: Similar to a singly linked list, but each node contains three parts:
The data (or value).
A pointer to the next node.
A pointer to the previous node.
This allows for traversal in both forward and backward directions.
Advantages: Efficient insertions and deletions from both ends (O(1)) and from the middle (O(1) once the node to be operated on is found). Bi-directional traversal.
Disadvantages: Requires more memory per node (due to the extra 'previous' pointer). More complex implementation due to managing two pointers.
2. Project Setup:

Create a new Java project named TaskManagementSystem.

3. Implementation:

Project Structure:

TaskManagementSystem
├── src
│   └── com
│       └── tasks
│           ├── Task.java
│           ├── TaskNode.java
│           ├── SinglyLinkedList.java
│           └── TaskManagerTest.java

4.Output:

All Tasks:
Task ID: T001, Task Name: Design Database, Status: In Progress
Task ID: T002, Task Name: Implement API, Status: Pending
Task ID: T003, Task Name: Write Documentation, Status: Completed

Searching for task T002:
Found: Task ID: T002, Task Name: Implement API, Status: Pending

Deleting task T002:
All Tasks after deletion:
Task ID: T001, Task Name: Design Database, Status: In Progress
Task ID: T003, Task Name: Write Documentation, Status: Completed

4. Analysis: 

Time Complexity of Operations (using a Singly Linked List): 

Add (addTask - at the end):
Average Case: O(N) - To add at the end, you must traverse the entire list to find the last node.
Worst Case: O(N) - Same as average.
Note: If adding at the beginning (prepended), it would be O(1).
Search (searchTask - by ID):
Average Case: O(N) - On average, you have to traverse half the list.
Worst Case: O(N) - The element is at the very end or not found, requiring a full traversal of N elements.
Traverse (traverseTasks):
Average Case: O(N) - You need to visit every node.
Worst Case: O(N) - Same as average.
Delete (deleteTask - by ID):
Average Case: O(N) - First, you need to find the element (O(N)). Once found, the actual deletion (re-linking pointers) is O(1). So, O(N) + O(1) = O(N).
Worst Case: O(N) - If the element is at the end or not found, requiring a full traversal.
Note: Deleting the head is O(1).
Advantages of Linked Lists over Arrays for Dynamic Data: 

Dynamic Size: Linked lists can grow or shrink in size dynamically as needed, without the need for resizing and copying elements like arrays. They use memory as needed.
Efficient Insertions and Deletions (in the middle, if node is found):
For arrays, inserting or deleting an element in the middle requires shifting all subsequent elements, which is an O(N) operation.
For linked lists, once you have a reference to the node before the insertion/deletion point, the operation is O(1) (just changing a few pointers). However, finding that specific point usually requires a traversal, which is O(N) from the head.
No Memory Waste (Fragmented Memory): Linked lists only allocate memory for the nodes they currently hold, avoiding pre-allocation of large, potentially unused blocks of memory. However, their nodes can be scattered throughout memory, leading to poorer cache performance compared to arrays.
When to choose Linked List vs. Array:

Choose Linked List when:
Frequent insertions/deletions are needed, especially at the beginning or if you often have a pointer to the insertion/deletion point.
The size of the data collection is highly dynamic and unpredictable.
Memory might be fragmented, and you want to avoid large contiguous blocks.
Choose Array (or ArrayList) when:
Random access (accessing elements by index) is frequent.
The size of the collection is relatively fixed or changes predictably, allowing for efficient resizing.
Memory locality and cache performance are important.

 */
}
