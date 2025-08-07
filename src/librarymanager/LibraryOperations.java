package librarymanager;


public interface LibraryOperations {
	void addBook(Book book);
    void registerUser(User user);
    void issueBook(String bookTitle, int userId);
    void returnBook(String bookTitle, int userId);
    void listBooks();
    void listUsers();
	
}



