import java.util.Scanner;
class Even{
	public static void main(String args[]){
		int num;
		Scanner n=new Scanner(System.in);
		System.out.print("Enter a number: ");
		num=n.nextInt();

		for(int i=0;i<num;i++){
			if(i%2==0){
				System.out.println(i);
			}
		}
	}
}

