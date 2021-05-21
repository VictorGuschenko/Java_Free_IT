//package library;
//
//import java.util.InputMismatchException;
//import java.util.Scanner;
//
//public class ApplicationBooks {
//    static Scanner scanner = new Scanner(System.in);
//    public static Library library = new Library();
//
//    public void start() {
//        System.out.println("Welcome to the library");
//        System.out.println("What would you like to do?");
//        mainMenu();
//    }
//
//    public static void mainMenu() {
//        boolean running = true;
//        while (running) {
//            try {
//                System.out.println("Please input a number for actions:");
//                System.out.println("1 - Print all books.");
//                System.out.println("2 - Add a new book.");
//                System.out.println("3 - Remove a book.");
//                System.out.println("4 - Edit an existing book.");
//                System.out.println("5 - Exit.");
//                int number = Integer.parseInt(scanner.nextLine().trim().replaceAll(" +", ""));
//                switch (number) {
//                    case 1:
//                        printBooks();
//                        break;
//                    case 2:
//                        addNewBook();
//                        break;
//                    case 3:
//                        removeBook();
//                        break;
//                    case 4:
//                        editBook();
//                        break;
//                    case 5:
//                        running = false;
//                        break;
//                    default:
//                        throw new NumberFormatException();
//                }
//            } catch (InputMismatchException | NumberFormatException exception) {
//                System.err.println("Wrong input.");
//            }
//        }
//        scanner.close();
//    }
//
//    public static void printBooks() {
//        boolean running = true;
//        while (running) {
//            System.out.println("Please choose sorting by:");
//            System.out.println("1 - A - Z");
//            System.out.println("2 - Z - A");
//            System.out.println("3 - new books - old books");
//            System.out.println("4 - exit to main menu");
//            try {
//                int number = Integer.parseInt(scanner.nextLine().trim().replaceAll(" +", ""));
//                switch (number) {
//                    case 1:
//                        System.out.println(library.getAToZBooks());
//                        System.out.println("Exit to main menu or");
//                        break;
//                    case 2:
//                        System.out.println(library.getZToABooks());
//                        System.out.println("Exit to main menu or");
//                        break;
//                    case 3:
//                        System.out.println(library.getNewToOldBooks());
//                        System.out.println("Exit to main menu or");
//                        break;
//                    case 4:
//                        running = false;
//                        break;
//
//                    default:
//                        throw new InputMismatchException();
//                }
//            } catch (InputMismatchException | NumberFormatException exception) {
//                System.err.println("Wrong input.");
//            }
//        }
//    }
//
//    public static void addNewBook() {
//        try {
//            System.out.println("Please input id: ");
//            int id = Integer.parseInt(scanner.nextLine().trim().replaceAll(" +", ""));
//            if (!library.hasBookInLibrary(id)) {
//                System.out.println("Please input title: ");
//                String title = scanner.nextLine();
//                System.out.println("Please input genre: ");
//                String genreName = scanner.nextLine();
//                library.addBook(new Book(id, title, new Genre(genreName)));
//                System.out.println("book ID=" +
//                        library
//                                .getBooks()
//                                .get(id)
//                                .getId() +
//                        " title=" +
//                        library
//                                .getBooks()
//                                .get(id)
//                                .getTitle() + " has been added.");
//            } else {
//                System.out.println("The book with id=" + id + " exists in library");
//            }
//        } catch (InputMismatchException | NumberFormatException exception) {
//            System.err.println("Wrong input, id must be a number.");
//        }
//    }
//
//    public static void removeBook() {
//        System.out.println("Please input id of book which you want to remove:");
//        try {
//            int id = Integer.parseInt(scanner.nextLine().trim().replaceAll(" +", ""));
//            library.removeBook(id);
//        } catch (InputMismatchException | NumberFormatException exception) {
//            System.err.println("ID must be a number.");
//        }
//    }
//
//    public static void editBook() {
//        System.out.println("Please input ID of book, which you want to edit:");
//        try {
//            int id = Integer.parseInt(scanner.nextLine().trim().replaceAll(" +", ""));
//            if (library.hasBookInLibrary(id)) {
//                System.out.println("Please input new title:");
//                String newTitle = scanner.nextLine();
//                System.out.println("Please input new genre:");
//                String newGenreName = scanner.nextLine();
//                library.editBook(id, newTitle, newGenreName);
//            } else {
//                System.out.println("There is no book with id=" + id);
//                editBook();
//            }
//        } catch (InputMismatchException | NumberFormatException exception) {
//            System.err.println("ID must be a number.");
//        }
//    }
//}
