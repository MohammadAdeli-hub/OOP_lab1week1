package ie.atu;

public class book
{
    public String title;
    public String author;
    public int  page_count;
    public boolean available= true;

    public void displayDetails()
    {
        System.out.println("Book title: "+title);
        System.out.println("Book Author: "+author);
        System.out.println("Book page count: " +page_count);
        System.out.println("Book available: " + available);

    }

}
