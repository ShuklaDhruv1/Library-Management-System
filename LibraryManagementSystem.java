import java.util.ArrayList;
import java.util.Scanner;

public class LibraryManagementSystem {

    static ArrayList<Book> books = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        while (true) {

            System.out.println("\n=================================");
            System.out.println("      LIBRARY MANAGEMENT SYSTEM");
            System.out.println("=================================");
            System.out.println("1. Add Book");
            System.out.println("2. View All Books");
            System.out.println("3. Search Book");
            System.out.println("4. Issue Book");
            System.out.println("5. Return Book");
            System.out.println("6. Exit");
            System.out.println("=================================");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    addBook();
                    break;

                case 2:
                    viewBooks();
                    break;

                case 3:
                    searchBook();
                    break;

                case 4:
                    issueBook();
                    break;

                case 5:
                    returnBook();
                    break;

                case 6:
                    System.out.println("\nThank you for using the Library System! 📚");
                    sc.close();
                    return;

                default:
                    System.out.println("❌ Invalid choice!");
            }
        }
    }

    public static void addBook() {

        System.out.print("Enter Book ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Book Title: ");
        String title = sc.nextLine();

        System.out.print("Enter Author Name: ");
        String author = sc.nextLine();

        Book book = new Book(id, title, author);

        books.add(book);

        System.out.println("✅ Book added successfully!");
    }

    public static void viewBooks() {

        if (books.isEmpty()) {
            System.out.println("\n📭 No books available.");
            return;
        }

        System.out.println("\n========== BOOK LIST ==========");

        for (Book book : books) {
            book.displayBook();
        }
    }

    public static void searchBook() {

        System.out.print("Enter Book ID to search: ");
        int id = sc.nextInt();

        for (Book book : books) {

            if (book.getId() == id) {

                System.out.println("\n🔎 Book Found!");
                book.displayBook();
                return;
            }
        }

        System.out.println("❌ Book not found!");
    }

    public static void issueBook() {

        System.out.print("Enter Book ID to issue: ");
        int id = sc.nextInt();

        for (Book book : books) {

            if (book.getId() == id) {

                if (book.isIssued()) {
                    System.out.println("❌ Book is already issued!");
                } else {
                    book.issueBook();
                    System.out.println("📖 Book issued successfully!");
                }

                return;
            }
        }

        System.out.println("❌ Book not found!");
    }

    public static void returnBook() {

        System.out.print("Enter Book ID to return: ");
        int id = sc.nextInt();

        for (Book book : books) {

            if (book.getId() == id) {

                if (!book.isIssued()) {
                    System.out.println("❌ This book is already available!");
                } else {
                    book.returnBook();
                    System.out.println("↩️ Book returned successfully!");
                }

                return;
            }
        }

        System.out.println("❌ Book not found!");
    }
}
