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
    private int pages;
    private String refNumber;
    private int borrowed;
    private boolean courseText;

    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle, int bookPages, boolean bookCourseText)
    {
        author = bookAuthor;
        title = bookTitle;
        pages = bookPages;
        courseText=bookCourseText;
        refNumber="";
        borrowed=0;
    }
    
    /**
     * This method returns the status of a book if it is a course material or not.
     */
    public boolean isCourseText()
    {
        return courseText;
    }
    
    /**
     * This method sets the current number of times borrowed for a book.
     */
    public void setBorrowed()
    {
        borrowed+=1;
    }
    
    /**
     * This method returns the number of times a book has been borrowed.
     */
    public int getBorrowed()
    {
        return borrowed;
    }
    
    /**
     * This method sets the reference number for a book.
     */
    public void setRefNumber(String ref)
    {
        if(ref.length()>=3)
        {
            refNumber=ref;
        }
        else
        {
            System.out.println("Error, string for refNumber is too short");
        }
    }
    
    /**
     * 
     */
    
    /**
     * This method returns the reference number.
     */
    public String getRefNumber()
    {
        return refNumber; 
    }
    
    /**
     * This method returns the number of pages.
     */
    public int getPages()
    {
        return pages;
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

    /**
     * This method prints all the information concerning a certain book.
     */
    public void printDetails()
    {
        System.out.println("Title: "+title+ " Author: "+author+ " Pages: "+pages);
        if(refNumber.length()<=0)
        {
            refNumber="ZZZ";
            System.out.print(" Reference Number: "+refNumber);
        }
        else
        {
            System.out.print(" Reference Number: "+refNumber);
        }
        
        System.out.println(" Number of times borrowed: " + borrowed);
    }
    
}
