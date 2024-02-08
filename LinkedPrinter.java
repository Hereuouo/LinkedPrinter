package LinkedPrinter;

public class LinkedPrinter 
{
    // Linked list stack type string
    private LinkedStack<String> Paper;
    
    //1)Initialize the printer with an empty paper stack
    
    //inside of construcet
    public LinkedPrinter()
    {
        // empty linked list called paper
        Paper = new LinkedStack<>();
    
    }
    //2)The addPaper method add pages to the paper stack 
    public void  addPaper(String NewPaper)
    {
        Paper.push(NewPaper);
        System.out.println("---Paper succesfully Added.---");
    }
    //3)The printDocument method Print whole document
    public void printDocument()
    {
        while (!Paper.isEmpty()) // travse 
        {
            String TempPaper=Paper.pop();// to not mess with the original 
            System.out.println("-=-Document printed:"+TempPaper+"---");
        }
        
    }
    //demonstrate the ability to perform the above tasks
    // main
    public static void main(String[]args)
    {
        // Create list/stack of LinkedPrinter
        LinkedPrinter Printer=new LinkedPrinter();
        // Add contect to Printer using addPaper
        Printer.addPaper("page One");
        Printer.addPaper("page Two");
        Printer.addPaper("page Three");
        // Display the document using printDocument
        Printer.printDocument();
    }
}
