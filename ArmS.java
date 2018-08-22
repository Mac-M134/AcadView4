import java.util.Scanner;
class ArmS{
	public static void main(String args[]){
		int num,a,b,count=0,rem,l1,m=0;
		Scanner n=new Scanner(System.in);
		System.out.print("Enter No.: ");
		num=n.nextInt();
		a=num;
		while(a>0){
			a/=10;
			count++;		
		}
		b=num;
		while(b>0){
			rem=b%10;
			l1=power(rem,count);
			m=m+l1;
			b/=10;
		}
		if(m==num){
			System.out.print("Number is Armstrong");
		}
		else{
			System.out.print("Number is not Armstrong");
		}
	}
	public static int power(int base,int exp){
		int powe=1;
		for(int i=0;i<exp;i++){
			powe=powe*base;
		}
		return powe;
}
}




