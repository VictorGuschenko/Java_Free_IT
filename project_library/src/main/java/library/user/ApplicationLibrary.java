package library.user;

import library.service.BookService;
import library.service.BookServiceImpl;

import java.util.Scanner;

public class ApplicationLibrary {

    public void runApp() {
        System.out.println("*** Library ***");
        mainMenu();
    }

    private void mainMenu() {
        Scanner scanner = new Scanner(System.in);
        BookService bookService = new BookServiceImpl();

        boolean running = true;
        while (running) {
            System.out.println();
            System.out.println("Please chose an action.");
            System.out.println("1. Get a book by ID.");
            System.out.println("2. Add a book to the library. ");
            System.out.println("3. Edit book in the library.");
            System.out.println("4. Remove book from the library.");
            System.out.println("5. Exit");
            System.out.println();
            long id;
            String title, authorName, genreName, isbn;
            String action = scanner.nextLine();
            switch (action) {
                case "1":
                    System.out.println("Please input id of a book: ");
                    id = Long.parseLong(scanner.nextLine());
                    bookService.fetchBookById(id);

                    break;
                case "2":
                    System.out.println("Please input a title:");
                    title = scanner.nextLine();
                    System.out.println("Please input an author's name:");
                    authorName = scanner.nextLine();
                    System.out.println("Please input genre:");
                    genreName = scanner.nextLine();
                    System.out.println("Please input ISBN:");
                    isbn = scanner.nextLine();
                    bookService.addBook(title, authorName, genreName, isbn);
                    break;
                case "3":
                    System.out.println("Please input id of a book to edit: ");
                    id = Long.parseLong(scanner.nextLine());
                    System.out.println("Please input a title:");
                    title = scanner.nextLine();
                    System.out.println("Please input an author's name:");
                    authorName = scanner.nextLine();
                    System.out.println("Please input genre:");
                    genreName = scanner.nextLine();
                    bookService.editBook(id, title, authorName, genreName);
                    break;
                case "4":
                    System.out.println("Please input id of a book to remove: ");
                    id = Long.parseLong(scanner.nextLine());
                    bookService.removeBookById(id);
                    break;
                case "5":
                    running = false;
                    System.out.println("*** Bye ***");
                    break;
                default:
                    System.out.println("Please input correctly");
            }
        }
        scanner.close();
    }
}
