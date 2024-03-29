import java.util.*;

class Book implements Comparable<Book> {
    private String title;
    private int pageCount;
    private String author;
    private String publicationDate;


    public Book(String title, int pageCount, String author, String publicationDate) {
        this.title = title;
        this.pageCount = pageCount;
        this.author = author;
        this.publicationDate = publicationDate;
    }


    public String getTitle() {
        return title;
    }

    public int getPageCount() {
        return pageCount;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublicationDate() {
        return publicationDate;
    }

    @Override
    public int compareTo(Book otherBook) {
        return this.title.compareTo(otherBook.getTitle());
    }

    @Override
    public String toString() {
        return "Title: " + title + ", Page Count: " + pageCount + ", Author: " + author + ", Publication Date: " + publicationDate;
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating Book objects
        Book book1 = new Book("Java Programming", 400, "John Smith", "2020-01-01");
        Book book2 = new Book("Data Structures", 350, "Alice Johnson", "2019-05-15");
        Book book3 = new Book("Algorithm Design", 500, "David Brown", "2021-03-10");
        Book book4 = new Book("Web Development", 250, "Emily Davis", "2018-11-20");
        Book book5 = new Book("Database Systems", 450, "Michael Wilson", "2022-07-05");

        Set<Book> bookSetByName = new HashSet<>();
        bookSetByName.add(book1);
        bookSetByName.add(book2);
        bookSetByName.add(book3);
        bookSetByName.add(book4);
        bookSetByName.add(book5);


        System.out.println("Books sorted by name:");
        for (Book book : bookSetByName) {
            System.out.println(book);
        }

        Set<Book> bookSetByPageCount = new TreeSet<>(Comparator.comparing(Book::getPageCount));

        // Adding books to TreeSet
        bookSetByPageCount.add(book1);
        bookSetByPageCount.add(book2);
        bookSetByPageCount.add(book3);
        bookSetByPageCount.add(book4);
        bookSetByPageCount.add(book5);

        System.out.println("\nBooks sorted by page count:");
        for (Book book : bookSetByPageCount) {
            System.out.println(book);
        }
    }
}