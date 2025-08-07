package librarymanager;

import java.util.ArrayList;
import java.util.List;

public class Library implements LibraryOperations {
    private List<Book> books;
    private List<User> users;

    public Library() {
        books = new ArrayList<>();
        users = new ArrayList<>();
    }

    @Override
    public void addBook(Book book) {
        books.add(book);
    }

    @Override
    public void registerUser(User user) {
        users.add(user);
    }

    @Override
    public void issueBook(String bookTitle, int userId) {
        Book book = findBookByTitle(bookTitle);
        User user = findUserById(userId);

        if (book == null) {
            System.out.println("Book not found.");
        } else if (user == null) {
            System.out.println("User not found.");
        } else if (book.isIssued()) {
            System.out.println("Book is already issued.");
        } else {
            book.setIssued(true);
            user.borrowBook(book);
            System.out.println("Book issued to " + user.getName());
        }
    }

    @Override
    public void returnBook(String bookTitle, int userId) {
        Book book = findBookByTitle(bookTitle);
        User user = findUserById(userId);

        if (book == null || user == null) {
            System.out.println("Book or User not found.");
        } else if (!user.getBorrowedBooks().contains(book)) {
            System.out.println("This user didn't borrow this book.");
        } else {
            book.setIssued(false);
            user.returnBook(book);
            System.out.println("Book returned successfully.");
        }
    }

    @Override
    public void listBooks() {
        System.out.println("\nAvailable Books:");
        for (Book book : books) {
            System.out.println("- " + book);
        }
    }

    @Override
    public void listUsers() {
        System.out.println("\nRegistered Users:");
        for (User user : users) {
            System.out.println("- " + user);
        }
    }

    private Book findBookByTitle(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) return book;
        }
        return null;
    }

    private User findUserById(int id) {
        for (User user : users) {
            if (user.getId() == id) return user;
        }
        return null;
    }
}
