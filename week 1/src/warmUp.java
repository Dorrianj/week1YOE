import java.util.Scanner;

public class warmUp {

	public static void main(String[] args) {
		// TODO Auto-generated method 
		
		
		Scanner sncr= new Scanner(System.in);
	
		
		System.out.println("what is your name");
		sncr.next();//strings 
		System.out.println("how old are you");
		sncr.nextInt();//numbers 
		System.out.println("what is your favorite color");
		sncr.next();//strings 
		System.out.println("what is your best number");
		sncr.nextInt();//numbers
		
		
		System.out.println("thanks for your participation");
		sncr.close();
		
	}
	
	
}