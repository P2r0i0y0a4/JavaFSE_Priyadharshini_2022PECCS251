package exercise6;

import java.util.Arrays;

class Book {
    private String bookId;
    private String title;
    private String author;

    public Book(String bookId, String title, String author) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
    }

    // Getters
    public String getBookId() {
        return bookId;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return "Book ID: " + bookId + ", Title: " + title + ", Author: " + author;
    }
}

class LibraryManagementSystem {
    private Book[] books;
    private int count;

    public LibraryManagementSystem(int capacity) {
        books = new Book[capacity];
        count = 0;
    }

    // Add a book
    public void addBook(Book book) {
        if (count < books.length) {
            books[count++] = book;
        } else {
            System.out.println("Library is full. Cannot add more books.");
        }
    }

    // Linear search for a book by title
    public Book linearSearchByTitle(String title) {
        for (int i = 0; i < count; i++) {
            if (books[i].getTitle().equalsIgnoreCase(title)) {
                return books[i];
            }
        }
        return null; // Book not found
    }

    // Binary search for a book by title (assuming the array is sorted)
    public Book binarySearchByTitle(String title) {
        int left = 0;
        int right = count - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int comparison = books[mid].getTitle().compareToIgnoreCase(title);

            if (comparison == 0) {
                return books[mid]; // Book found
            } else if (comparison < 0) {
                left = mid + 1; // Search in the right half
            } else {
                right = mid - 1; // Search in the left half
            }
        }
        return null; // Book not found
    }

    // Sort books by title (for binary search)
    public void sortBooksByTitle() {
        Arrays.sort(books, 0, count, (b1, b2) -> b1.getTitle().compareToIgnoreCase(b2.getTitle()));
    }

    // Display all books
    public void displayBooks() {
        for (int i = 0; i < count; i++) {
            System.out.println(books[i]);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        LibraryManagementSystem library = new LibraryManagementSystem(5);

        // Create books
        Book book1 = new Book("B001", "The Great Gatsby", "F. Scott Fitzgerald");
        Book book2 = new Book("B002", "To Kill a Mockingbird", "Harper Lee");
        Book book3 = new Book("B003", "1984", "George Orwell");
        Book book4 = new Book("B004", "Pride and Prejudice", "Jane Austen");
        Book book5 = new Book("B005", "The Catcher in the Rye", "J.D. Salinger");

        // Add books to the library
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);
        library.addBook(book5);

        // Display all books
        System.out.println("All Books in the Library:");
        library.displayBooks();

        // Linear search for a book
        System.out.println("\nSearching for '1984' using Linear Search:");
        Book foundBookLinear = library.linearSearchByTitle("1984");
        if (foundBookLinear != null) {
            System.out.println("Found: " + foundBookLinear);
        } else {
            System.out.println("Book not found.");
        }

        // Sort books by title for binary search
        library.sortBooksByTitle();

        // Binary search for a book
        System.out.println("\nSearching for '1984' using Binary Search:");
        Book foundBookBinary = library.binarySearchByTitle("1984");
        if (foundBookBinary != null) {
            System.out.println("Found: " + foundBookBinary);
        } else {
            System.out.println("Book not found.");
        }
    }
}
