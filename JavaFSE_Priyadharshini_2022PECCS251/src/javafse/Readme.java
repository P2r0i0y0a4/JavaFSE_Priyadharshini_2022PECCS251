package javafse;

public class Readme {
	
	/*
	 * Exercise1:
	 * ✅ Step-by-Step Solution
          1. Create Java Project:
             Project Name: SingletonPatternExample

          2. Define Singleton Class - Logger.java
          3. Create Test Class - LoggerTest.java

          4. Output:
             Logger instance created.
             Log: First log message.
             Log: Second log message.
             Both logger instances are the same (Singleton confirmed).

          5. Explanation:
             This is a lazy initialization singleton (created only when needed).
             Not thread-safe. If needed in multithreaded apps, use synchronized keyword or other thread-safe mechanisms (like using enum or double-checked locking).
      *
      *Exercise 2:
      *Code Implementation:

        1. Define Document Classes (Interfaces or Abstract Classes):
           src/com/documents/Document.java
        2. Create Concrete Document Classes:
           src/com/documents/WordDocument.java
        3. Implement the Factory Method:
           src/com/factories/DocumentFactory.java
        4. Test the Factory Method Implementation:
           src/com/client/DocumentCreator.java
        
        Output:

Demonstrating Factory Method Pattern:

Opening Word Document...
Saving Word Document...
Closing Word Document...
Document processed successfully.

Opening PDF Document...
Saving PDF Document...
Closing PDF Document...
Document processed successfully.

Opening Excel Document...
Saving Excel Document...
Closing Excel Document...
Document processed successfully.
Explanation of the Factory Method Pattern in this example:

Product (Document): The Document interface defines the common operations for all document types. WordDocument, PdfDocument, and ExcelDocument are concrete products.
Creator (DocumentFactory): The DocumentFactory abstract class declares the factory method createDocument(), which returns an object of type Document. It also defines a processDocument() method that uses the factory method to create and then perform operations on a document. This processDocument() method demonstrates how the client code interacts with the factory without knowing the concrete document type.
Concrete Creators (WordDocumentFactory, PdfDocumentFactory, ExcelDocumentFactory): These concrete factory classes extend DocumentFactory and implement the createDocument() method to return a specific concrete document type (e.g., WordDocumentFactory creates WordDocument instances).
This structure allows you to:

Decouple: The client (DocumentCreator) is decoupled from the concrete document classes. It only interacts with DocumentFactory and Document interfaces/abstract classes.
Extensible: To add a new document type (e.g., PowerPointDocument), you only need to create a new PowerPointDocument class and a PowerPointDocumentFactory class. The existing client code remains unchanged, adhering to the Open/Closed Principle.
Encapsulate Object Creation: The responsibility of creating objects is delegated to the factory classes.



   

	 */
}
