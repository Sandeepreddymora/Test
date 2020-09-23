

public class Factorial {

	public static void main(String[] args) {

		//Scanner scan = new Scanner(System.in);
		
		System.out.println("enter a number: ");
		
		int n = 5; //scan.nextInt();
		int fact=1;
		int i=1;
		while(i<=n) {
			
			fact = fact*i;
			i++;
		}
				System.out.println("factorial of "+n+ " is: "+fact);
		
		//method2
		int fact1=1;
		
		for(int k=1;k<=n;k++) {
			fact1 = fact1*k;
		}
		
		System.out.println("factorial of "+n+ " is: "+fact1);
	}

}
