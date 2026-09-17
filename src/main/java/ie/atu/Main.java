package ie.atu;

import java.awt.print.Book;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main
{
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome to the first class !\n");
        System.out.println("this is the secone line with a new line\n");
        book firstbook= new book();
        firstbook.title= "firstbook";
        firstbook.auther="moadele";
        firstbook.page_count=555;

        System.out.println("firstbook:\t" +firstbook.title );
        System.out.println("firstbook:\t " +firstbook.auther);
        System.out.println("firstbook:\t" +firstbook.page_count);
        System.out.println("firsbook Availibility\t =" +firstbook.available);


    }
}