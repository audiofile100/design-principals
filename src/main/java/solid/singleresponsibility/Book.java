package solid.singleresponsibility;

/**
 * Created by mg on 8/16/2023.
 */
public class Book {

    private String title;
    private String author;
    private String text;

    public Book(String title, String author, String text) {
        this.title = title;
        this.author = author;
        this.text = text;
    }

    public boolean searchText(String text) {
        return this.text.contains(text);
    }

    public String replaceText(String word, String replacement) {
        return text.replaceAll(word, replacement);
    }

    // violates single responsibility rule
    void printTextToConsole() {
        // code for formatting and printing text
    }
}
