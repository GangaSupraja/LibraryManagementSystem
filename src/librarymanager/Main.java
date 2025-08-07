package librarymanager;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		LibraryOperations library = new Library(); // Use the interface
        Scanner scanner = new Scanner(System.in);

        // Sample data
        library.addBook(new Book("SpringBoot", "Rod Johnson"));
        library.addBook(new Book("Java", "James Gosling "));
        library.registerUser(new User("xyz", 1));
        library.registerUser(new User("abc", 2));

        int choice;

        do {
            System.out.println("\n--- Library Menu ---");
            System.out.println("1. List Books");
            System.out.println("2. List Users");
            System.out.println("3. Issue Book");
            System.out.println("4. Return Book");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // clear newline

            switch (choice) {
                case 1:
                    library.listBooks();
                    break;

                case 2:
                    library.listUsers();
                    break;

                case 3:
                    System.out.print("Enter book title to issue: ");
                    String issueTitle = scanner.nextLine();
                    System.out.print("Enter user ID: ");
                    int issueUserId = scanner.nextInt();
                    scanner.nextLine();
                    library.issueBook(issueTitle, issueUserId);
                    break;

                case 4:
                    System.out.print("Enter book title to return: ");
                    String returnTitle = scanner.nextLine();
                    System.out.print("Enter user ID: ");
                    int returnUserId = scanner.nextInt();
                    scanner.nextLine();
                    library.returnBook(returnTitle, returnUserId);
                    break;

                case 5:
                    System.out.println("Exiting Library System. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }

        } while (choice != 5);

        scanner.close();
    }
}

	


