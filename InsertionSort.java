class InsertionSort{
	public static void main(String args[]){
		int arr[]={1,1,1,1,0,0,1,0};
		int n=arr.length,temp;
		for(int i=0;i<n;i++){
			int j=i;
			while(j>0){
				if(arr[j-1]>arr[j]){
					temp=arr[j-1];
					arr[j-1]=arr[j];
					arr[j]=temp;
				}
				else{
					break;
				}
				j--;
			}
		}
		for(int z:arr){
			System.out.println(z);
		}
	}
}

