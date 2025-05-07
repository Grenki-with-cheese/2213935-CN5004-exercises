package practice;

public class book implements Comparable<book>
{
    private String title;
    private String author;
    private int year;

    public book(String titleIn, String authorIn, int yearIn){
        title=titleIn;
        author=authorIn;
        year=yearIn;
    }

    public String getTitle(){
        return title;
    }

    public String getAuthor(){
        return author;
    }
    
    public int getYear(){
        return year;
    }

    public String toString(){
        return title+" / "+author+" /"+year;
    }

    public boolean equals(Object objIn){
        book bookIn = (book) objIn;
        return title.equals(bookIn.title) && author.equals(bookIn.author) && year == bookIn.year;
    }

    public int hashCode(){
        return title.hashCode() + author.hashCode() + year;
    }

    @Override
    public int compareTo(book bIn) {
        return title.compareTo(bIn.title);
    }
}
