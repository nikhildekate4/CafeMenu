import java.util.Scanner;

public class FoodDeliverTest extends LoginClass{
public void choiceLogin() {
	System.out.println("=============Wellcome to UniCafe==========");
	System.out.println("1 Login ");
	System.out.println("2 Registeration");
	System.out.println("========================================");
	Scanner sc=new Scanner(System.in);
	int ch=sc.nextInt();
	while (ch!=0) {
		
	
	switch (ch) {
	case 1:
		Login();
		break;
	case 2:
		Registration();
		break;

	default:
		throw new IllegalArgumentException("Unexpected Value:"+ch);
	}
	ch=sc.nextInt();
	}
	
}
public static void main(String[] args) {
	FoodDeliverTest fd=new FoodDeliverTest();
	fd.choiceLogin();
 
}
}
