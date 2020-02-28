package day52.Books;

public abstract class Book implements KnowledgeBank {

    String name;
    String author;

    public Book(String name, String author) {
        this.name = name;
        this.author = author;
    }

    public Book(String name) {
        this.name=name;

    }

    public abstract void displayInfo();




}
