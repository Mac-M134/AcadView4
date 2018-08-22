import java.util.Scanner;
class BinaryS{
	public static void main(String args[]){
		int num,f=0,l,m;
		int arr[]={1,4,6,7,8,9,10};
		Scanner n=new Scanner(System.in);
		System.out.print("Enter number: ");
		num=n.nextInt();
		l=(arr.length)-1;
		m=(f+l)/2;
		while(f<=l){
			if(arr[m]==num){
				System.out.print("Index is:"+m);
				break;
			}
			else if(arr[m]<num){
				f=m+1;
			}
			else if(arr[m]>num){
				l=m-1;
			}
			else {
				System.out.print("Element not present");
			}
			m=(f+l)/2;
		}
	}
}




