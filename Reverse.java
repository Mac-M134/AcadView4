import java.util.Scanner;
class Reverse{
	public static void main(String args[]){
		int a,b;
		Scanner md=new Scanner(System.in);
        System.out.print("Enter a No: ");
		a=md.nextInt();
		b=a;
		int rev=0,rem;
		while(a!=0){
			rem=a%10;
			rev=(rev*10)+rem;
			a=a/10;
		}
		System.out.printf("Reverse is :%d",rev);
	}
}


