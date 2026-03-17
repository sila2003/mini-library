public class Main {
    public static void main(String[] args) {

        Book b1 = new Book("1984", "George Orwell", 300, true);
        Book b2 = new Book("Harry Potter", "J.K. Rowling", 500, true);
        Book b3 = new Book("Clean Code", "Robert Martin", 400, true);

        Reader r1 = new Reader("Ali", "Yilmaz", "R001", 0);
        Reader r2 = new Reader("Ayse", "Demir", "R002", 1);

        b1.printInfo();
        b2.printInfo();
        b3.printInfo();

        r1.printData();
        r2.printData();

        r1.increaseBorrowedCount();
        r1.increaseBorrowedCount();
        r1.decreaseBorrowedCount();

        r2.printData();
        Library lib = new Library(10);

        lib.addBook(b1);
        lib.addBook(b2);
        lib.addBook(b3);

        System.out.println("Available books:");
        lib.printAvailableBooks();

        System.out.println("Count: " + lib.countAvailableBooks());

        Book found = lib.findBookByTitle("1984");
        if (found != null) {
            System.out.println("Found:");
            found.printInfo();
        }
    }
}