import java.util.Scanner;

class Main 
{
	public static void main(String[] args) 
	{
    double lumber;  // price per board 
    double windows; // price per square inch of window
    double taxRate; 
    double lumberPrices;
    int boards;
    int numOfWindows;
    double windowPrices;
    double total;
    double grandTotal;

     // Create a Scanner object to read input.
      Scanner console = new Scanner(System.in);

    	/*ask user for the sales tax rate as a decimal, 
    	the number of boards needed, 
    	and the number of windows needed. Store all info*/
      System.out.println("Hello, Enter the sales tax rate: ");
        taxRate = console.nextDouble();
      System.out.println("Enter the numbers of boards you need: ");
        boards = console.nextInt();
      System.out.println("How many windows do you need?");   
        numOfWindows = console.nextInt();

       




    	
    	//create Construction Object
    	Construction lala = new Construction(8,11, taxRate);
      
      lala.lumberCost(boards); //calculating the price of the lumbers
      lumberPrices = lala.lumberCost(boards);
      //System.out.println(lumberPrices);
    	
      lala.windowCost(numOfWindows);  //calculating the price of the windows
      windowPrices = lala.windowCost(numOfWindows);

    	//print total cost HINT lumberCost + windowsCost
      lumberPrices += windowPrices;
      total = lumberPrices;
    	System.out.println("Total: $" + total);


      //grand total calculation
      lala.grandTotal(total);
      grandTotal = lala.grandTotal(total);
      System.out.println(grandTotal);
      System.out.println("Grand Total: $" + grandTotal);
      console.close();
/* Here is an example of the output

Enter the sales tax rate: 
 .08
How many boards do you need? 
 10
How many windows do you need? 
 5
Total: $135.0
Grand Total: $145.8 */
	}
}