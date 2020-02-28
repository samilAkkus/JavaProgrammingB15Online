package a_replit.InstanceMethodPracticeBook_233;

public class Book {

    String title;
    String author;
    String tableOfContents = "";

    int nextPage = 1;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public void addChapter(String titleChapter , int numberChapter ){

        tableOfContents += "\n"+titleChapter+"..."+nextPage;
        nextPage+=numberChapter;



    }

    public int getPages(){

        return nextPage -1;


    }

    public String getTableOfContents(){

        return tableOfContents;
    }

    @Override
    public String toString() {


        return title + "\n" +author;


    }
}
