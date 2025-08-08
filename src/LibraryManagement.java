abstract class Book {
    private String title;
    private String author;
    private boolean isIssued;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.isIssued = false;
    }

    public abstract void displayDetails();

    public void issueBook() {
        if (!isIssued) {
            isIssued = true;
            System.out.println(title + " has been issued.");
        } else {
            System.out.println(title + " is already issued.");
        }
    }

    public void returnBook() {
        if (isIssued) {
            isIssued = false;
            System.out.println(title + " has been returned.");
        } else {
            System.out.println(title + " was not issued.");
        }
    }

    public boolean getIssueStatus() {
        return isIssued;
    }

    public String getTitle() {
        return title;
    }
}


class Fiction extends Book {
    private String genre;

    public Fiction(String title, String author, String genre) {
        super(title, author);
        this.genre = genre;
    }

    @Override
    public void displayDetails() {
        System.out.println("Fiction Book: " + getTitle() + ", Genre: " + genre);
    }
}

class NonFiction extends Book {
    private String subject;

    public NonFiction(String title, String author, String subject) {
        super(title, author);
        this.subject = subject;
    }

    @Override
    public void displayDetails() {
        System.out.println("Non-Fiction Book: " + getTitle() + ", Subject: " + subject);
    }
}

class Magazine extends Book {
    private int issueNumber;

    public Magazine(String title, String author, int issueNumber) {
        super(title, author);
        this.issueNumber = issueNumber;
    }

    @Override
    public void displayDetails() {
        System.out.println("Magazine: " + getTitle() + ", Issue No: " + issueNumber);
    }
}

public class LibraryManagement {
    public static void main(String[] args) {
        // Only 3 books handled individually
        Fiction f1 = new Fiction("The Hobbit", "J.R.R. Tolkien", "Fantasy");
        NonFiction nf1 = new NonFiction("Sapiens", "Yuval Noah Harari", "History");
        Magazine m1 = new Magazine("National Geographic", "Various", 202);

        // Display details
        f1.displayDetails();
        nf1.displayDetails();
        m1.displayDetails();

        System.out.println("\n--- Issue and Return Operations ---");
        f1.issueBook();
        f1.issueBook();

        m1.issueBook();
        m1.returnBook();
        m1.returnBook();
    }
}
