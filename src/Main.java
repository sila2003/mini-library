public class Main {
    public static void main(String[] args) {

        Book b1 = new Book("1984", "George Orwell", 300, true);
        Book b2 = new Book("Harry Potter", "J.K. Rowling", 500, true);
        Book b3 = new Book("Clean Code", "Robert Martin", 400, true);

        b1.printInfo();

        b1.borrow();
        b1.borrow();

        b1.returnBook();
        b1.printInfo();
    }
}
