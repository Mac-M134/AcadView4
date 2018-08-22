import java.util.Scanner;
class PrimeN{
	public static void main(String args[]){
		Scanner n=new Scanner(System.in);
		System.out.print("Enter no. : ");				
		int num;
		num=n.nextInt();
		for(int i=2;i<num;i++){
			int z=0;
			for(int j=2;j<i;j++){
				if(i%j==0){
					z=1;
					break;
				}
			}
			if(z==0){
					System.out.print(i+"\n");
				}
		}
	}
}


