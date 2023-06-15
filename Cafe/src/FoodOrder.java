import java.security.PublicKey;
import java.util.Scanner;

public class FoodOrder {

	int mojito=250;
	int burger=120;
	int fries=150;
	int pizza=260;
	int colddrinks=50;
	int qty;
	double total;
    double generatedBillrate;
public void menuDisplay()
{
	System.out.println("===============Menu Card================");
	System.out.println("========================================");
	System.out.println("Select items");
	System.out.println("1. Mojito          -250rs");
	System.out.println("2. Burger          -120rs");
	System.out.println("3. Fries           -150rs");
	System.out.println("4. Pizza           -260rs");
	System.out.println("5. Colddrinks      -50rs");
	System.out.println("6.Generate Bill");
	System.out.println("0. Close the Menu");
  
}


public void order() {
    System.out.println("Enter your choice:");
    Scanner sc=new Scanner(System.in);
    int choice=sc.nextInt();
    int qty;
    double total;
    double generatedBillrate=0;
    
    
    while(choice!=0) {
		switch (choice) {
		case 1: 
			System.out.println("you selected mojito");
			System.out.println();
			System.out.println("Enter the quantity");
			qty=sc.nextInt();
			total=qty*mojito;
			generatedBillrate=generatedBillrate+total;
	        break;
		
		case 2: 
			System.out.println("you selected burger");
			System.out.println();
			System.out.println("Enter the quantity");
			qty=sc.nextInt();
			total=qty*burger;
			generatedBillrate=generatedBillrate+total;
		    break;
		
		
		case 3: 
			System.out.println("you selected fries");
			System.out.println();
			System.out.println("Enter the quantity");
			qty=sc.nextInt();
			total=qty*fries;
			generatedBillrate=generatedBillrate+total;
		    break;
		
		case 4: 
			System.out.println("you selected pizza");
			System.out.println();
			System.out.println("Enter the quantity");
			qty=sc.nextInt();
			total=qty*pizza;
			generatedBillrate=generatedBillrate+total;
		    break;
		    
		case 5: 
			System.out.println("you selected colddrinks");
			System.out.println();
			System.out.println("Enter the quantity");
			qty=sc.nextInt();
			total=qty*colddrinks;
			generatedBillrate=generatedBillrate+total;
		    break;
		    
		case 6 : 
	        System.out.println("=========YOUR ORDER SUMMARY=========");
	        System.out.println("Total Bill="+generatedBillrate);
	        System.out.println("Thanks for visiting us");
	        System.exit(choice);
		    
		default:
			throw new IllegalArgumentException("Unexpected value: " + choice);
		}
		System.out.println("Enter your choice:");
	    choice=sc.nextInt();
	}
   
    
	}
        

}


