class Book {
    String title;
    String author;
    double price;

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }
}

class Fiction extends Book {
    public Fiction(String title, String author, double price) {
        super(title, author, price);
    }

    public void display() {
        System.out.println("Fiction Book Details:");
        super.display();
    }
}

class NonFiction extends Book {
    public NonFiction(String title, String author, double price) {
        super(title, author, price);
    }

    public void display() {
        System.out.println("Non-Fiction Book Details:");
        super.display();
    }
}

public class LibraryManagement {
    public static void main(String[] args) {
        Fiction f = new Fiction("Harry Potter", "J.K. Rowling", 500);
        NonFiction nf = new NonFiction("Sapiens", "Yuval Noah Harari", 700);

        f.display();
        System.out.println();
        nf.display();
    }
}
