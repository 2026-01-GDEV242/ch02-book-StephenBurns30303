/**
 * A class that maintains information on a book.
 * This might form part of a larger application such
 * as a library system, for instance.
 *
 * @author Stephen M. Burns
 * @version 02/06/2026
 */
class Book
{
    private String author;
    private String title;

    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle)
    {
        author = bookAuthor;
        title = bookTitle;
    }

    /**
     * This method returns the book's author.
     */
    public String getAuthor()
    {
        return author;
    }
    
    /**
     * This method returns the book's title
     */
    public String getTitle()
    {
        return title;
    }
    
    /**
     * This method prints the author's name
     */
    public void printAuthor()
    {
        System.out.println("Author:" +author);
    }
    
    /**
     * This method prints the title of the book.
     */
    public void printTitle()
    {
        System.out.println("Title:" +title);
    }

}
