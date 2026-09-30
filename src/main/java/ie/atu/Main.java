package ie.atu;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main
{
    public static void main(String[] args) {

        book firstbook= new book();
        firstbook.title= "firstbook";
        firstbook.author ="moadele";
        firstbook.page_count=555;

        firstbook.displayDetails();



    }
}